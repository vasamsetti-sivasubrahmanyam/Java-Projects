package com.capgemini.service;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.AccountService#createAccount(int, int)
	 */
	
	AccountRepository accountRepository;
	
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}


	@Override
	public Account createAccount(int accountNumber,int amount) throws InsufficientInitialAmountException
	{
		int a,b,c;
		if(amount<500)
		{
			throw new InsufficientInitialAmountException();
		}
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		
		account.setAmount(amount);
		 
		if(accountRepository.save(account))
		{
			return account;
		}
	     
		return null;
		
	}
@Override
public Account depositAmount(int accountNumber,int amount) throws InvalidAccountNumberException
{
	Account account1=new Account();
	account1=accountRepository.searchAccount(accountNumber);
	if(account1==null) {
		throw new InvalidAccountNumberException();
	}
	account1.setAmount(account1.getAmount()-amount);
	if(accountRepository.save(account1)) {
		return account1;
	}else
	{
		return null;
	}
	
			}
@Override
public Account withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException,InsufficientBalanceException{
Account account2=new Account();
account2=accountRepository.searchAccount(accountNumber);
if(account2==null) {
	throw new InvalidAccountNumberException();
	

}if((account2.getAmount()-amount)<500);{
	throw new InsufficientBalanceException();
}account2.setAmount(account2.getAmount()-amount);
if(accountRepository.save()){
	
	
}
}
}
