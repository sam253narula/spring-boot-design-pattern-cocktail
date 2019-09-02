package com.spring.boot.design.pattern.cocktail.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Organization {
	private String name;
	List<Employee> employees;
	List<Project> projects;
	private int marketValue;
}
