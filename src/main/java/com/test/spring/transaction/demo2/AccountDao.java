package com.test.spring.transaction.demo2;
/** 
 * @Description: 转账DAO
 */
public interface AccountDao {
	//转出操作
	public void outMoney(String out,double money);
	
	//转入操作
	public void inMoney(String in,double money);
}
