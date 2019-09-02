package com.spring.boot.design.pattern.cocktail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.design.pattern.cocktail.dto.AndroidDeveloper;
import com.spring.boot.design.pattern.cocktail.dto.Developer;
import com.spring.boot.design.pattern.cocktail.dto.Iosdeveloper;
import com.spring.boot.design.pattern.cocktail.dto.WebDeveloper;
//Factory Design pattern
@Service
public class DeveloperFactory {

	@Autowired
	WebDeveloper webDeveloper;

	@Autowired
	AndroidDeveloper androidDeveloper;

	@Autowired
	Iosdeveloper iosdeveloper;

	public Developer getDevloper(String DeveloperType) {
		if (DeveloperType.equalsIgnoreCase("web")) {
			return webDeveloper;
		} else if (DeveloperType.equalsIgnoreCase("android")) {
			return androidDeveloper;
		} else if (DeveloperType.equalsIgnoreCase("ios")) {
			return iosdeveloper;
		}

		return null;

	}
}
