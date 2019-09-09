package edu.bit.ex.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.service.Tservice;

@Controller
public class TController {
	
	@Inject
	Tservice service;

	@RequestMapping("/list")
	public String list(Model model) {
	
		List list = service.list();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		model.addAttribute("selectList",list);
		//model.addAttribute("selectList",service.list()); °°Àº°Å
		
	
		
		return "list";
	}
	
	@RequestMapping("/select")
	public String select(Model model, String id) {
		
		
		
		return "select";
	}
	
	@RequestMapping("/update")
	public String update() {
		
		return "update";
	}
	
	@RequestMapping("/insert")
	public String insert() {
		
		return "insert";
	}
	
}
