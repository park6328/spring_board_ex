 package edu.bit.ex.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.member.service.Mservice;
import edu.bit.ex.member.vo.MemberVO;

@Controller
public class MController {
	
	@Inject
	Mservice service;
	
	@RequestMapping("member/list")
	public String list(Model model) throws Exception {
		System.out.println("member/listȣ��");
		
		List list =service.selectMemberList();
		model.addAttribute("memberList", list);
		
		return "member/list";
	}

	@RequestMapping("member/insertMemberPage")
	public String insertMemberPage(Model model) throws Exception {
		System.out.println("member/insertMemberPageȣ��");
				
		return "member/insertMemberPage";
	}
	
	@RequestMapping(value="member/insert", method=RequestMethod.POST)
	public String insert(MemberVO memberVo) throws Exception {
		System.out.println("member/insertMemberPageȣ��");
		System.out.println(memberVo);
		
		// ����ڿ��� ���� �����͸� ����
		service.insertMember(memberVo);
		
		
		return "redirect:list";
	}
	
	
}
	   