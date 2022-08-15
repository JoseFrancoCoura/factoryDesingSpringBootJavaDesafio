package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Investimentos;

@Component
public class Poupanca implements Investimentos{

	@Override
	public String specification() {
		return "O risco de perde é quase nulo, mas o ganho não é elecado na poupança.";
	}

}
