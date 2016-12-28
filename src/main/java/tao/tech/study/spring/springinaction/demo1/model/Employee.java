package tao.tech.study.spring.springinaction.demo1.model;

import java.math.BigDecimal;

public class Employee {
	
	private Long id;
	private String firstName;
	private String lastName;
	private BigDecimal salary;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName+ ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
}
