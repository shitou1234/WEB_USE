package org.zhq.common.portal.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhq.dubbo.demo.server.api.IDubboDemoServerService;
import org.zhq.dubbo.server.dubbo_demo_server_biz.DubboDemoServerServiceImpl;

/**
 * 测试控制器类
 * @author zhq
 *
 */
@Controller
@RequestMapping(value = "/dubboDemoServerController")
public class DubboDemoServerController {
	
	@Resource(name=DubboDemoServerServiceImpl.BEAN_ID)
	private IDubboDemoServerService dubboDemoServerService;
	
	
	/**
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/test.do")
	public @ResponseBody Map<String,Object> test(HttpServletRequest request, HttpServletResponse response){
		Map<String,Object> resultData = new HashMap<String,Object>();
		resultData.put("code", "This is a test method");
		return resultData;
	}
}
