package cn.yesway.SpringAOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

public class JDKDynamicProxy implements InvocationHandler {

	private Object target;

	public JDKDynamicProxy(Object target) {
		this.target = target;
	}

	/**
	 * proxy 所代理的真实对象
	 * method 所要调用真实对象的某个方法的Method对象
	 * args 指代的是调用真实对象某个方法时接受的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}
	private void before(){
		System.out.println("上班前打卡");
	}
	
	private void after(){
		System.out.println("下班后打卡");
	}

}
