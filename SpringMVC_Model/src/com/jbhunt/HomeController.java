package com.jbhunt;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbhunt.beans.Employee;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	public String display(HttpServletRequest req, Model m) {
		// read the provided form data
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if (pass.equals("krish@123")) {
			String msg = "Hello " + name;
			// add a message to the model
			m.addAttribute("message", msg);
			return "viewpage";
		} else {
			String msg = "Sorry " + name + ". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorpage";
		}
	}

	@RequestMapping("/showData")
	public String setInfo(HttpServletRequest req, Model m) {
		// read the provided form data
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String salary = req.getParameter("sal");

		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		String msg = emp.toString();
		m.addAttribute("message", msg);
		return "viewpage";
	}
}