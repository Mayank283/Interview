package language.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * https://stackoverflow.com/questions/37628/what-is-reflection-and-why-is-it-useful
 * http://www.geeksforgeeks.org/reflection-in-java/
 */

public class ReflectionTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> car = Car.class;

		Method[] methods = car.getDeclaredMethods();

		for (Method method : methods) {

			if ("upGear".equalsIgnoreCase(method.getName())) {

				Object obj = car.newInstance();

				int ret = (int) method.invoke(obj, 2);

				System.out.println(ret);
			}
		}

		Field[] fields = car.getDeclaredFields();
		Engine e = new Engine();
		for (Field field : fields) {
			System.out
					.println(field.getName() + "::Annotation present->" + field.isAnnotationPresent(EnginePower.class));
			System.out.println(field.getType().getSimpleName());
			if (!field.getType().isPrimitive()) {
				Method[] method = field.getType().getDeclaredMethods();
				for (Method method2 : method) {
					if (method2.isAnnotationPresent(EnginePower.class)) {
						Annotation annotation = method2.getDeclaredAnnotation(EnginePower.class);
						String arg = (String) annotation.getClass().getDeclaredMethod("power").invoke(annotation);
						method2.invoke(e, arg);
					}
				}
			}
		}

		System.out.println(e.getPower());

		System.out.println("Superclass of car::" + car.getSuperclass());
		Class<?>[] interfaces = car.getInterfaces();
		for (Class<?> interfac : interfaces) {
			System.out.println(interfac);
		}

	}
}