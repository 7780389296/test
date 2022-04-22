package com.zensar.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeId;
	String name;
	double basicsalary;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	Address address;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "skil_Name", nullable = false)//
	List<Skill> skillList;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bank_Id",referencedColumnName = " bankId")

	BankAccount account;
	public Employee(int employeeId, String name, double basicsalary, Address address, List<Skill> skillList,
			BankAccount account) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.basicsalary = basicsalary;
		this.address = address;
		this.skillList = skillList;
		this.account = account;
	}
	public Employee(String name, double basicsalary, Address address, List<Skill> skillList, BankAccount account) {
		super();
		this.name = name;
		this.basicsalary = basicsalary;
		this.address = address;
		this.skillList = skillList;
		this.account = account;
	}
	
	public Employee(String name, double basicsalary) {
		super();
		this.name = name;
		this.basicsalary = basicsalary;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicsalary=" + basicsalary + ", address="
				+ address + ", skillList=" + skillList + ", account=" + account + "]";
	}
	public void addSkill(Skill skill) {
		this.skillList.add(skill);
		}
	

}
