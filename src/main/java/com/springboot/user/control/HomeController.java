package com.springboot.user.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.user.resp.UserRepository;

@Controller
public class HomeController
{
	@Autowired UserRepository userRepository;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("users", userRepository.findAll());
		return "index";
	}
}