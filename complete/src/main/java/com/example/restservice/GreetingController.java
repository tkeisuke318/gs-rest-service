package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	//テスト
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		if (true == true) {
			return new Greeting(counter.incrementAndGet(), String.format(template, name));
		}
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
