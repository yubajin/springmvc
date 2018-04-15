package com.yubajin.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/springmvc")
@Controller
public class Main {
	private static final String SUCCESS = "success";
	
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
		System.out.println("testCookieValue: sessionId:"+sessionId);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testHeader")
	public String testHeader(@RequestHeader(value="Accept-Language") String al) {
		
		System.out.println("test Header,Accept-Language:" + al);
		return SUCCESS;
	}
	
	/***
	 * @RequestParam来映射请求参数
	 * value值即请求参数的参数名
	 * required该请求参数是否必须，默认为true
	 * defaultValue 请求参数的默认值
	 * @param username
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String username,
								   @RequestParam(value="age",required=false,defaultValue="0") int age) {
		System.out.println("test RequestParam,username:" + username + ",age:" + age);
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testRest/{id}", method=RequestMethod.PUT)
	public String testRestPut(@PathVariable(value="id") Integer id) {
		System.out.println("testRest Put: " + id);
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testRest/{id}", method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable(value="id") Integer id) {
		System.out.println("testRest Delete: " + id);
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testRest", method=RequestMethod.POST)
	public String testRest() {
		System.out.println("testRest Post");
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testRest/{id}", method=RequestMethod.GET)
	public String testRest(@PathVariable(value="id") Integer id) {
		System.out.println("testRest Get: " + id);
		return SUCCESS;
	}
	
	/**
	 * @PathVariable  映射 URL 绑定的占位符
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable(value="id") Integer id) {
		System.out.println("testPathVariable" + id);
		return SUCCESS;
	}
	
	/**
	 *  Ant 风格资源地址支持 3 种匹配符：
	 * @return
	 */
	@RequestMapping("/testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	/***
	 * @RequestMapping 的 value、method、params 及 heads 分别表示请求 URL、请求方法、请求参数及请求头
	 * @return
	 */
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
	
	/***
	 * @RequestMapping 映射请求
	 * @return
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
}
