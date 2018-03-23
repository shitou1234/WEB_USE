package org.zhq.dubbo.demo.client.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.zhq.dubbo.demo.server.api.IDubboDemoServerService;

/**
 * 测试直接通过api接口来调用dubbo服务
 * @author zhq
 *
 */
@Service(DubboDemoServerClientBiz.BEAN_ID)
public class DubboDemoServerClientBiz {
	
	@Resource(name=IDubboDemoServerService.BEAN_ID)
	private IDubboDemoServerService dubboDemoServerService;

	public static final String BEAN_ID="dubboDemoServerClientBiz";
	
	/**
	 * 测试直接通过api接口来调用dubbo服务hello方法
	 * @param msg
	 * @return
	 */
	public String sayHelloMsg(String msg){
		return dubboDemoServerService.hello(msg);
	}
}
