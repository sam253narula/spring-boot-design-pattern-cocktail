package com.spring.boot.design.pattern.cocktail.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.design.pattern.cocktail.dto.Developer;
import com.spring.boot.design.pattern.cocktail.dto.Employee;
import com.spring.boot.design.pattern.cocktail.dto.Organization;
import com.spring.boot.design.pattern.cocktail.dto.Project;
import com.spring.boot.design.pattern.cocktail.dto.WebDeveloper;

@Service
public class ServiceExample {

	@Autowired
	DeveloperFactory developerFactory;

	private List<Organization> organizations = new ArrayList<Organization>();
	private List<Employee> employees = new ArrayList<>();

	public List<Organization> createOrganization(Organization organization) {
		organizations.add(organization);
		return organizations;
	}

	public List<Organization> getAllOrganizations() {
		Organization mockOrgnizatiion = Organization.builder().name("Some Investment Bank").employees(Arrays.asList(Employee.builder()
				.name("Samarth Narula").age(24).salary(60000).project("JPMC").developerType(new Developer() {
					@Override
					public String typeOfDeveloper() {
						return "Full Stack Developer";
					}
				}).build(), Employee.builder().name("Shakil Ansari").age(28).salary(60000).project("JPMC")
						.developerType(new Developer() {
							@Override
							public String typeOfDeveloper() {
								return "Mean Stack Developer";
							}
						}).build()))
				.projects(Arrays.asList(
						Project.builder().name("Payment Gateway Network").capacity(50).budget(999999).build(),
						Project.builder().name("Capital Market").capacity(100).budget(999959999).build(),
						Project.builder().name("Wealth Management").capacity(500).budget(979999).build())).marketValue(99999).build();
		organizations.add(mockOrgnizatiion);
		return organizations;
	}

	public Employee createEmployee(String name, int age, int salary, String developerType) {
		Developer developerType1 = developerFactory.getDevloper(developerType);
		// Below is example of builder design pattern
		Employee employee = Employee.builder().age(age).name(name).salary(salary).developerType(developerType1).build();
		employees.add(employee);
		return employee;
	}
	
	public List<Employee> getEmplpyees(){
		return employees;
	}

}
