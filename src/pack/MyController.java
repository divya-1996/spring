package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model.Calculator;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		int num1 = Integer.parseInt(arg0.getParameter("n1"));
		int num2 = Integer.parseInt(arg0.getParameter("n2"));
		Calculator c = new Calculator();
		c.setN1(num1);
		c.setN2(num2);
		int res = c.getAddition();
		System.out.println("test1");
		ModelAndView mv = new ModelAndView("index");
		System.out.println("test2");
		mv.addObject("result", res);
		System.out.println("test3");
		return mv;
				
		
	}

}
