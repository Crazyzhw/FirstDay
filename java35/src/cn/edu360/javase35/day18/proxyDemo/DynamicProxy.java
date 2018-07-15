package cn.edu360.javase35.day18.proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface DynamicProxy {
	public static void main(String[] args) {
		InterfaceZ  z = new ClassZ();
		Object p = Proxy.newProxyInstance(z.getClass().getClassLoader(), z.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object o = method.invoke(z, args);
				Integer s =(Integer)o;
				System.out.println("打印边长为"+s+"的@的正方形");
				for(int i=0;i<s;i++){
					for(int j=0;j<s;j++) {
						System.out.print("@ ");
					}
					System.out.println();
				}
				return s;
			}
		});
		
		InterfaceZ  z2 =(InterfaceZ)p;
		int x = z2.z(8);
		System.out.println(x);
		
	}
}
