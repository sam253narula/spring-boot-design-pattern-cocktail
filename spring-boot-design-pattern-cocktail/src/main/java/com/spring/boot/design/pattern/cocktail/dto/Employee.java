package com.spring.boot.design.pattern.cocktail.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author samarth narula
 *
 */
@Data
@Builder
public class Employee {
	private String name;
	private int age;
	private int salary;
	private String project;
	/**
	 * Below developerType is an example of strategy design pattern.
	 * Instead of creating an individual class for every employee object and implementing Developer interface of extending any of it's implementation,
	 * we have created an dynamic employee creation application and also setting the developer type dynamically, giving the application flexibility to change devloperType on the fly in future.
	 * This meets the real life expectation of employee, an employee who is web developer today can also become a android developer tomorrow.
	 */
	public Developer developerType;

	public String getDeveloperType() {
		return developerType.typeOfDeveloper();
	}
	
	
	/**
	 * @param developerType
	 * This method describes the ability to change your hot skill :-p
	 */
	public void setDeveloperType(Developer developerType) {
		this.developerType = developerType;
	}
}