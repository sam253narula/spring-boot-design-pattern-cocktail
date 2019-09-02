package com.spring.boot.design.pattern.cocktail.dto;

import org.springframework.stereotype.Service;

@Service
public class Iosdeveloper implements Developer {

	@Override
	public String typeOfDeveloper() {
		return "IOS Developer, can code in Swift Llanguage";
	}

}
