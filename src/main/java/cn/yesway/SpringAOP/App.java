package cn.yesway.SpringAOP;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yesway.SpringAOP.impl.WorkingImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// 第一版
		// Working working = new WorkingImpl();
		// working.workByWho("yangjianbo");

		// 第二版
		// Working workingproxy = new WorkingProxy(new WorkingImpl());
		// workingproxy.workByWho("yangjianbo");

		// 第三版
		// Working greeting = new WorkingImpl();
		// // 通过实现 InvocationHandler 接口创建自己的调用处理器
		// InvocationHandler handler = new JDKDynamicProxy(greeting);
		//
		// // 通过为 Proxy 类指定 ClassLoader 对象和一组 interface 来创建动态代理类
		// ClassLoader loader = greeting.getClass().getClassLoader();
		// Class[] interfaces = greeting.getClass().getInterfaces();
		// // 通过反射机制获得动态代理类的构造函数，其唯一参数类型是调用处理器接口类型；
		// // 通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数被传入
		// /**
		// * 得到一个动态的代理对象
		// *
		// * loader:　定义了由哪个ClassLoader对象来对生成的代理对象进行加载
		// * interfaces:
		// 表示的是需要代理的对象提供的接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
		// *
		// handler:　一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
		// */
		// Working greetingproxy = (Working) Proxy.newProxyInstance(loader,
		// interfaces, handler);
		//
		// greetingproxy.workByWho("yangjianbo");

		// // 第四版 Spring 编程式
		// ProxyFactory proxyFactory = new ProxyFactory(); // 创建代理工厂
		// proxyFactory.setTarget(new WorkingImpl()); // 射入目标类对象
		// proxyFactory.addAdvice(new WorkBeforeAdvice()); // 添加前置增强
		//
		// Working greeting = (Working) proxyFactory.getProxy(); // 从代理工厂中获取代理
		// greeting.workByWho("yangjianbo");                              // 调用代理的方法

//		第五版 Spring 声明式
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Working greeting = (Working) ctx.getBean("workingProxy");// 从 Context 中获取代理对象
//        greeting.workByWho("yangjianbo"); 
		////第六版 Spring+aspectj 注解式
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Working working = (Working)ctx.getBean("WorkingImpl");
		working.workByWho("yangjianbo");
		
	}
}
