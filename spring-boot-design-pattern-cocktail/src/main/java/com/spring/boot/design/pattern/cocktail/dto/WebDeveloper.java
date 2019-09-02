package com.spring.boot.design.pattern.cocktail.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class WebDeveloper implements Developer {
	
	@Override
	public String typeOfDeveloper() {
		return "Web Developer, can code in java,C#, HTML5, AngularJS, CSS3, any possible language that is or can come in market";
	}

}
