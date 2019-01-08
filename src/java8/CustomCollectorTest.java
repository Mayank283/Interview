package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CustomCollectorTest
{

    public static void main(String[] args)
    {
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().collect(new CustomCollector()));
    }
}

class CustomCollector implements Collector<Integer, ArrayList<Integer>, ArrayList<ArrayList<Integer>>>
{

    private ArrayList<ArrayList<Integer>> arrayList;
    private int counter = 0;

    public CustomCollector()
    {
        this.arrayList = new ArrayList<ArrayList<Integer>>();

    }

    @Override
    public Supplier<ArrayList<Integer>> supplier()
    {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<ArrayList<Integer>, Integer> accumulator()
    {

        return (list, value) -> {
            ++counter;
            if (list.size() < 5)
            {
                list.add(value);
            } else
            {
                this.arrayList.add(new ArrayList<>(list));
                list.clear();
                list.add(value);
            }
            if (counter == 9)
            {
                this.arrayList.add(new ArrayList<>(list));
            }
        };
    }

    @Override
    public BinaryOperator<ArrayList<Integer>> combiner()
    {
        return (left, right) -> {
            right.addAll(left);
            return right;
        };
    }

    @Override
    public Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> finisher()
    {
        return (value) -> this.arrayList;
    }

    @Override
    public Set<Characteristics> characteristics()
    {
        return EnumSet.of(Characteristics.UNORDERED);
    }

}