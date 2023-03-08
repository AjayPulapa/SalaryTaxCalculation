package com.mss.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mss.salary.IncomeTaxService;

@RestController
public class IncomeTaxController {

	@Autowired
	IncomeTaxService incomeTaxService;
	
	@GetMapping("/tax-calculation")
	public Map<String, Object> calculateTax(@RequestParam String regimeType, @RequestParam double totalAmount,
			@RequestParam double eightyC, @RequestParam double npsScheme, @RequestParam double eightyD,
			@RequestParam double twentyFourB, @RequestParam double lta, @RequestParam double standardDeduction) {
		return incomeTaxService.calculateTax(regimeType, totalAmount, eightyC, npsScheme, eightyD, twentyFourB, lta,
				standardDeduction);
	}

}
