package md.curs.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import md.curs.model.User;

@Controller
public class SignupController {

	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String doSignUp(@Valid @ModelAttribute("user") User user, BindingResult result) {
		
		System.out.println("Page has errors: " + result.hasErrors());
		
		return "signup";
	}

}
