package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Investimentos;

@Component
public class Acoes implements Investimentos {

	@Override
	public String specification() {
		return "A chance de ganho é grande, mas o risco de perda é grande nas ações.";
	}

}
