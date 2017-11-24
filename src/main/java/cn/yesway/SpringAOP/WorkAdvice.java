package cn.yesway.SpringAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WorkAdvice {
	@Before("execution(* cn.yesway.SpringAOP.impl.WorkingImpl.*(..))")
	public void before() {
		System.out.println("上班前要打卡");

	}

	public void after() throws Throwable {
		System.out.println("下班后要打卡");

	}

}
