package com.tap.acad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("test")
public class Test {
	public Test() {
		System.out.println("test class object is created");
	}
	

	@RequestMapping("/first")
	public void testacceptre1()
	{
		System.out.println("first req");
	}
	@RequestMapping("/second")
	public String testacceptre2(Model model)
	{
		model.addAttribute("emp", new Employee("megha", "tap", "megha@gmail.com"));
		return "login.jsp";
	}
	@RequestMapping("/logincontroller")
	public String loginControll(@ModelAttribute("emp") Employee emp, Model model)
	{
//		System.out.println(un);
//		System.out.println(password);
//		System.out.println(email);
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPassword());
		model.addAttribute("msg", "addedsucessfully");
		return "loginconfirm.jsp";
	}
}
