package com.jbhunt;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = "/showData", method = RequestMethod.GET)
	// read the provided form data
	public String display(@RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("sal") String salary, Model m) {
		System.out.println("Controller class Called");
		System.out.println();
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		m.addAttribute("message", emp.toString());

		Date date = new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		System.out.println("Current Time Stamp: " + ts);

		return "viewpage";

	}
}