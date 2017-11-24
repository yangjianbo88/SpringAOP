package cn.yesway.SpringAOP;

import cn.yesway.SpringAOP.impl.WorkingImpl;

public class WorkingProxy implements Working {

	private WorkingImpl greetingImpl;
	public WorkingProxy(WorkingImpl greetingImpl){
		this.greetingImpl = greetingImpl;
	}
	@Override
	public void workByWho(String name) {
		before();
		greetingImpl.workByWho(name);
		after();
	}
	private void before(){
		System.out.println("上班前打卡");
	}
	
	private void after(){
		System.out.println("下班后打卡");
	}

}
