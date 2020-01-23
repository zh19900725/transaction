package com.test.spring.transaction.demo2;
/** 
 * @Description:转账服务接口 
 */
public interface AccountService {
	public void transferAccount(String out,String in,double money);
}
