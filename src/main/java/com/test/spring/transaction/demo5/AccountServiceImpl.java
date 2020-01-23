package com.test.spring.transaction.demo5;

import org.springframework.transaction.annotation.Transactional;


/**
 * @Description:转账服务接口实现
 */
@Transactional
public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transferAccount(final String out,final String in,final double money) {
		accountDao.outMoney(out, money);
		accountDao.inMoney(in, money);
		int i = 1/0;
	}
}
