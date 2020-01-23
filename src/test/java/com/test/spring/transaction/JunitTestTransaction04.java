package com.test.spring.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.spring.transaction.demo4.AccountService;
/**
 * Unit test base for load springcontext
 * AOP基于配置的声明式事务管理单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transcation-demo04.xml")
public class JunitTestTransaction04{
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void testTransferAccount(){
		accountService.transferAccount("aaa", "bbb", 200d);
	}
}
