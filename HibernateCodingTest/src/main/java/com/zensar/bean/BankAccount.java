package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BankAcount")
public class BankAccount {
	@Id
	int bankId;
	String accountId;
	public BankAccount(int bankId, String accountId) {
		super();
		this.bankId = bankId;
		this.accountId = accountId;
	}
	public BankAccount() {
		super();
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "BankAccount [bankId=" + bankId + ", accountId=" + accountId + "]";
	}
	

}
