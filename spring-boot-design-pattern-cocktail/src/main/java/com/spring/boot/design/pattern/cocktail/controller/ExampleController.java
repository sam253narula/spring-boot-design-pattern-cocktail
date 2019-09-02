package com.spring.boot.design.pattern.cocktail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.design.pattern.cocktail.dto.Employee;
import com.spring.boot.design.pattern.cocktail.dto.Organization;
import com.spring.boot.design.pattern.cocktail.dto.WebDeveloper;
import com.spring.boot.design.pattern.cocktail.service.ServiceExample;

@RestController
@RequestMapping("/haveFunCreatingOrganizations")
public class ExampleController {

	@Autowired
	ServiceExample serviceExample;

	/**
	 * @param organization
	 * @return List of organizations
	 */
	@PostMapping("/createOrganization")
	public List<Organization> createOrganization(@RequestBody Organization organization) {
		return serviceExample.createOrganization(organization);
	}

	/**
	 * @return List of organizations
	 */
	@GetMapping("/getOrganizations")
	public List<Organization> getOrganizations() {
		return serviceExample.getAllOrganizations();
	}

	@PostMapping("/CreateEmployee/{name}/{age}/{salary}/{developerType}")
	public Employee createEmployee(@PathVariable("name") String name, @PathVariable("age") int age,
			@PathVariable("salary") int salary, @PathVariable("developerType") String developerType) {
		return serviceExample.createEmployee(name, age, salary, developerType);
	}

	@GetMapping("/getEmployees")
	public List<Employee> getEmployee() {
		return serviceExample.getEmplpyees();
	}

}
