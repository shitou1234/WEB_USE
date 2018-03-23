package org.zhq.dubbo.common.portal.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhq.dubbo.demo.client.biz.DubboDemoServerClientBiz;

/**
 * 测试控制器类
 * @author zhq
 *
 */
@Controller
@RequestMapping(value = "/dubboDemoClientController")
public class DubboDemoClientController {
	
/*	@Resource(name=IDubboDemoServerService.BEAN_ID)
	private IDubboDemoServerService dubboDemoServerService;*/
	
	//测试通过业务类来调用，也可以直接用上面的api接口直接调用
	@Resource(name=DubboDemoServerClientBiz.BEAN_ID)
	private DubboDemoServerClientBiz dubboDemoServerClientBiz;
	
	/**
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/helloDemo.do")
	public @ResponseBody Map<String,Object> hello(HttpServletRequest request, HttpServletResponse response){
		Map<String,Object> resultData = new HashMap<String,Object>();
//		String msg=dubboDemoServerService.hello("world");
		String msg=dubboDemoServerClientBiz.sayHelloMsg("world");
		resultData.put("msg", msg);
		return resultData;
	}
}
