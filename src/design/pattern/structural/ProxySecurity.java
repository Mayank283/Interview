package design.pattern.structural;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySecurity implements InvocationHandler {

	Object obj;

	public ProxySecurity(Object obj) {
		this.obj = obj;
	}

	public static Object getInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new ProxySecurity(obj));

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;

		if (method.getName().contains("add")) {
			throw new IllegalArgumentException();
		} else {
			result = method.invoke(obj, args);
		}
		
		return result;
	}

}
