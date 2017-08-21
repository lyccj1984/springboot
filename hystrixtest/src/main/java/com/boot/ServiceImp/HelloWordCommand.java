package com.boot.ServiceImp;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class HelloWordCommand extends HystrixCommand<String> {

	private String name;
	public HelloWordCommand(String name) {
		super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	@Override
	protected String run() throws Exception {
		// TODO Auto-generated method stub
		 // a real example would do work like a network call here
        return "Hello " + name + "!";
	}

}
