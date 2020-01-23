package com.test.spring.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.spring.transaction.demo5.AccountService;
/**
 * Unit test base for load springcontext
 * 基于AspectJ注解的声明式事务管理单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transcation-demo05.xml")
public class JunitTestTransaction05{
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void testTransferAccount(){
		accountService.transferAccount("aaa", "bbb", 200d);
	}
}
