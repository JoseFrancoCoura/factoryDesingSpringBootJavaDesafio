package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Investimentos;

@Component
public class LCI implements Investimentos{

	@Override
	public String specification() {
		return "Há risco de perda, mas a LCI oferece um bom rendimento";
	}
}
