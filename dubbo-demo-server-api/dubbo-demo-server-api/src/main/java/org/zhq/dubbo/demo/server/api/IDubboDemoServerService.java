package org.zhq.dubbo.demo.server.api;

/**
 * 服务接口
 * @author zhq
 *
 */
public interface IDubboDemoServerService {
	public static final String BEAN_ID="dubboDemoServerServiceImpl";
	/**
	 * say hello + msg
	 * @param msg
	 * @return
	 */
	String hello(String msg);
}
