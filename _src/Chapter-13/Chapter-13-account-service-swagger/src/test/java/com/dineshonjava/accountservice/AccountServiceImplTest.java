/**
 * 
 */
package com.dineshonjava.accountservice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.dineshonjava.accountservice.repository.StubAccountRepository;
import com.dineshonjava.accountservice.service.AccountService;
import com.dineshonjava.accountservice.service.AccountServiceImpl;

/**
 * @author Dinesh.Rajput
 *
 */
public class AccountServiceImplTest {
	
	AccountService accountService;
	
	@Before 
	public void setUp() {
		accountService = new AccountServiceImpl( new StubAccountRepository() );
	}
	
	@Test 
	public void findAccountByAccountId() {
		assertTrue(accountService.findAccountByAccountId(100).getBalance().intValue() == 121);
	}
	
	@Test 
	public void findAllByCustomerId() {
		assertFalse(accountService.findAllByCustomerId(1000).size() == 3);
	}
}
