package com.test.spring.transaction.demo3;


/**
 * @Description:转账服务接口实现
 */
public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transferAccount(final String out,final String in,final double money) {
		accountDao.outMoney(out, money);
		accountDao.inMoney(in, money);
		//发生异常，事务回滚
		int i = 1/0;
	}
}
