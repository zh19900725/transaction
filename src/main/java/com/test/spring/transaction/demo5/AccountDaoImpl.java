package com.test.spring.transaction.demo5;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/** 
 * @Description:转账DAO实现 ，需要继承JdbcDaoSupport，配置bean时注入dataSource数据源，子类即可通过this使用jdbc模版
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	//转出
	@Override
	public void outMoney(String out, double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql,money,out);
	}

	//转入
	@Override
	public void inMoney(String in, double money) {
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql,money,in);
	}
}
