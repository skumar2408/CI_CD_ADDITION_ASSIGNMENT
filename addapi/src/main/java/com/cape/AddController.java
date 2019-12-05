package com.cape;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cape.addsvc.AddSvcBuisness;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		
		int i= Integer.parseInt(req.getParameter("t1"));
		
		int j= Integer.parseInt(req.getParameter("t2"));
		
		AddSvcBuisness result =new AddSvcBuisness();
		int k= result.addition(i, j);
		
		System.out.println("sameer kumar");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", k);
		return mv;

		
	}

}
