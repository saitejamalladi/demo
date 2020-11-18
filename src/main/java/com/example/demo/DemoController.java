package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	DemoConfig demoConfig;

	@RequestMapping(path="/", method = RequestMethod.GET)
	public String welcome() {
		return "Hello Hello New World!!! ";
	}

	@RequestMapping(path="/config1", method = RequestMethod.GET)
	public String getConfig1() {
		return demoConfig.getMyParam1();
	}
	@RequestMapping(path="/config2", method = RequestMethod.GET)
	public String getConfig2() {
		return demoConfig.getMyParam2();
	}

}
