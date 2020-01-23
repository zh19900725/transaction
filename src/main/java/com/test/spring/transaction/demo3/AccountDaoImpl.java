package com.test.spring.transaction.demo3;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/** 
 * @Description:转账DAO实现 
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String out, double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql,money,out);
	}

	@Override
	public void inMoney(String in, double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql,money,in);
	}

	

}
