package edu.bit.ex.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import edu.bit.ex.Tmapper.Tmapper;

@Service
public class Tservice {

	@Inject
	Tmapper mapper;
	
	public List list() {
		
		return mapper.selectlist();
	}
	
}
