package com.system.DigitalBankingApplication;

import gg.jte.TemplateEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DigitalBankingApplication {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Digital Banking App");
		model.addAttribute("message", "Welcome to your JTE-powered Spring Boot Application!");
		return "home"; // must match src/main/jte/home.jte
	}

	public static void main(String[] args) {
		SpringApplication.run(DigitalBankingApplication.class, args);
	}

}
