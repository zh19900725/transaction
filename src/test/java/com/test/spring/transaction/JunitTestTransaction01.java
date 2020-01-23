package com.test.spring.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.spring.transaction.demo1.AccountService;
/**
 * Unit test base for load springcontext
 * 无任何事务管理单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transcation-demo01.xml")
public class JunitTestTransaction01{
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void testTransferAccount(){
		accountService.transferAccount("aaa", "bbb", 200d);
	}
}
