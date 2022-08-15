package com.bse.factoryDesign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bse.factoryDesign.factory.Investimentos;
import com.bse.factoryDesign.factory.InvestimentosFactoryImplementation;

@RestController
public class FactoryController {

	// private static final Logger Log = LoggerFactory.getLogger(FactoryController.class);

	@GetMapping("/investimento/{investimentos}")
	public String getInvestimentoTypeInfo(@PathVariable("investimentos") String investimento) throws Exception {

		Investimentos investimentoFactory = InvestimentosFactoryImplementation.createInstance(investimento);
		return investimentoFactory.specification();

	}

}
