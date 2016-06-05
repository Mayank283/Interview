package question;

public class ZooKeeper {

	public static void main(String[] args) {

		new ZooKeeper().go();
	}

	public void go(){
		Mammal m = new Zebra();
		System.out.println(m.name+m.makeNoise());
	}
}

class Mammal{
	
	String name = "Furry";
	public String makeNoise(){
		
		return "Generic noise";
	}
}

class Zebra extends Mammal {
	String name = "stripes";
	public String makeNoise(){
		return "bray";
	}
}