package com.test.spring.transaction.demo1;
/** 
 * @Description:转账服务接口实现 
 */
public class AccountServiceImpl implements AccountService{
	
	//注入DAO层bean
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	/**
	 * 无事务管理
	 */
	@Override
	public void transferAccount(String out,String in,double money) {
		accountDao.outMoney(out, money);
		accountDao.inMoney(in, money);
	}
}
