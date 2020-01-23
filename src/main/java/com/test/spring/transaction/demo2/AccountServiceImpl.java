package com.test.spring.transaction.demo2;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @Description:转账服务接口实现
 */
public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	private TransactionTemplate transactionTemplate;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	/**
	 * 使用编程式事务管理
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public void transferAccount(final String out,final String in,final double money) {
		//使用匿名内部类的方式执行，注意：匿名内部类使用外部参数，外部参数需要声明为final类型
		transactionTemplate.execute(status->{
			accountDao.outMoney(out, money);
			accountDao.inMoney(in, money);
			int i = 1/0;
			return null;
		});
	}
}
