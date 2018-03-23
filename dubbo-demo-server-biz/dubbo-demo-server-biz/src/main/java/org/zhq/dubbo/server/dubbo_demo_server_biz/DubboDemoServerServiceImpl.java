package org.zhq.dubbo.server.dubbo_demo_server_biz;

import org.springframework.stereotype.Service;
import org.zhq.dubbo.demo.server.api.IDubboDemoServerService;

/**
 * 接口服务实现类
 * @author zhq
 *
 */
@Service(IDubboDemoServerService.BEAN_ID)
public class DubboDemoServerServiceImpl implements IDubboDemoServerService{
	
	public String hello(String msg) {
		String outMsg="Hello "+msg;
		System.out.println(outMsg);
		return outMsg;
	}

}
