package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class DemoConfig {

	@Value("${my-param1}")
	private String myParam1;

	@Value("${my-param2}")
	private String myParam2;

}
