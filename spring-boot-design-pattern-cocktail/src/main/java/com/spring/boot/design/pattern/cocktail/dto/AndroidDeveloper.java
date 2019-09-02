package com.spring.boot.design.pattern.cocktail.dto;

import org.springframework.stereotype.Service;

@Service
public class AndroidDeveloper implements Developer{

	@Override
	public String typeOfDeveloper() {
		return "Android Developer, uses Android Studio application";
	}

}
