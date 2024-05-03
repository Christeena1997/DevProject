package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/follow")
public class DevProjectController {
@GetMapping(value="/done")
public String getup() {
	return "I love u ";
}
}
