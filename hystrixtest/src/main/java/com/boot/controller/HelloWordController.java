package com.boot.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.ServiceImp.HelloWordCommand;

import ch.qos.logback.core.util.TimeUtil;

@RestController
public class HelloWordController {

	@RequestMapping("/product")
	public String gethellowordhystrix() throws ExecutionException 
	{
		
		return "hello word";
		/*try {
			TimeUnit.MILLISECONDS.sleep(1);
			
			Future<String> result= new HelloWordCommand("this is content for product").queue();
			return result.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;*/
	}
}
