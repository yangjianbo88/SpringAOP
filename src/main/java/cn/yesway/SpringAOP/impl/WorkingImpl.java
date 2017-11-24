package cn.yesway.SpringAOP.impl;

import org.springframework.stereotype.Component;

import cn.yesway.SpringAOP.Working;

@Component(value="WorkingImpl")
public class WorkingImpl implements Working {

	@Override
	public void workByWho(String name) {
		System.out.println(name+" is working!");
	}

}
