package com.sangamone.controller;

import java.beans.Customizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Customer1;
import com.sangamone.repo.CustomerRepo;



@Controller

public class HomeController {
@Autowired
	CustomerRepo customerRepo;
	@RequestMapping("/home")
	public String saveData(Customer1 customer) {
		
		 customerRepo.save(customer);
		 return "addName.jsp";
	}

	
	
}
