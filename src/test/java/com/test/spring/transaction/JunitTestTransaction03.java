package com.test.spring.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.spring.transaction.demo3.AccountService;
/**
 * Unit test base for load springcontext
 * 声明式事务管理单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transcation-demo03.xml")
public class JunitTestTransaction03{
	//@Resource(name="accountService")，使用被事务增强的业务代理对象
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void testTransferAccount(){
		accountService.transferAccount("aaa", "bbb", 200d);
	}
}
