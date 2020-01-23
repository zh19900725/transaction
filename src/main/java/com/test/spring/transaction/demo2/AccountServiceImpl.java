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
		//使用transactionTemplate执行事务处理
		String msg = transactionTemplate.execute(status -> dataProcess(out,in,money));
		System.out.println(msg);
	}

	/**
	 * 数据处理
	 * @param out
	 * @param in
	 * @param money
	 * @return
	 */
	private String dataProcess(String out, String in, double money) {
		accountDao.outMoney(out, money);
		accountDao.inMoney(in, money);
		//发生异常，事务回滚
		int i = 1/0;
		return "发生异常，事务回滚";
	}
}
