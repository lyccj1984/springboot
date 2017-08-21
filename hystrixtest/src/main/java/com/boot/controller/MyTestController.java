package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Gread;
import com.boot.model.MytestJson;

@RestController
@RequestMapping("/dome")
public class MyTestController {

	@RequestMapping("/getmytestjson")
	public MytestJson getmytestjson()
	{
		MytestJson mj=new MytestJson();
		
		mj.setName("liangyanchun");
		mj.setAge(33);
		Gread gread=new Gread();
		gread.setBan(2);
		gread.setClasses("一年级");
		mj.setGread(gread);
		return mj;
	}
}
