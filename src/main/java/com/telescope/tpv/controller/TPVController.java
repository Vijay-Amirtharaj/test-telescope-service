package com.telescope.tpv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telescope.tpv.entity.TotalProcessingValue;
import com.telescope.tpv.service.TPVService;

@RestController
public class TPVController {

	@Autowired
	private TPVService tpvService;
	
	
	@GetMapping("/tpv/{accountId}")	
	public List<TotalProcessingValue> authenticateUser(@PathVariable Integer accountId) {
				
      return tpvService.findTPVByAccount(accountId);
	   
	}   	
}
