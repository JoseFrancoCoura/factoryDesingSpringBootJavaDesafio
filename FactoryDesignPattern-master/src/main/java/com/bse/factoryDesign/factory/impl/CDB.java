package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Investimentos;

@Component
public class CDB implements Investimentos {

	@Override
	public String specification() {
		return "O ganho é médio e você pode espcificar o risco que quer correr no investimento CDB.";
	}

}
