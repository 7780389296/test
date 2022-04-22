package com.zensar;

import javax.persistence.EntityManager;

import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;
import com.zensar.bean.util.JPAUtil;

public class App {
	public static void insertTesting() {
		//write code here to persist employee object
		EntityManager em = JPAUtil.createEntityManager("PU");
		Employee emp=new Employee("subahsh",20000);
		Address add=new Address("pune","456720");
		BankAccount account=new BankAccount(12,"55455678");
		
		emp.setAddress(add);
		emp.setAccount(account);
		emp.addSkill(new Skill("java",8));
		emp.addSkill(new Skill("spring",6));
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	public static void loadTesting() {
		//write code here to load employee object
		EntityManager em = JPAUtil.createEntityManager("PU");
		Employee emp = em.find(Employee.class, 1);
		System.out.println(emp);
		JPAUtil.shutDown();
	}

  public static void main(String[] args) {
    insertTesting();
    loadTesting();
  }
}
