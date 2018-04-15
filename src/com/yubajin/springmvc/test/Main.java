package com.yubajin.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/springmvc")
@Controller
public class Main {
	private static final String SUCCESS = "success";
	
	@RequestMapping("/testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testParamsAndHeaders",
					params= {"username","age!=10"},
					headers= {"Accept-Language=zh-CN,zh;q=0.8"})
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	}
	
	/***
	 * 常用:使用method属性来指定请求方式
	 * @return
	 */
	@RequestMapping(value="/testMethod", method = RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
}
