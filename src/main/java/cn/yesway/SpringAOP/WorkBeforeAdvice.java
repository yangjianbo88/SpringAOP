package cn.yesway.SpringAOP;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

public class WorkBeforeAdvice implements MethodBeforeAdvice {

	@Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("上班前要打卡");
		
	}

}
