package com.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	/*
	 * Spring automatically supplies ProfileDaoImpl object
	 */
	@Autowired
	private ProfileDaoImpl dao;
	
	@RequestMapping(path = "/findAll", method = RequestMethod.GET)
	public ModelAndView findProfiles() {
		List<Profile> list = dao.fetchProfiles(); 
		ModelAndView mav = new ModelAndView("display", "profiles", list);
		return mav;
	}

	/*x
	 * Controller must invoke business logic and return ModelAndView
	 * spring/profile/hello
	 */
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView test() {
		// WEB-INF/pages/display.jsp
		ModelAndView mav = new ModelAndView("display", "obj", "Welcome to spring");
		return mav;
	}
}
