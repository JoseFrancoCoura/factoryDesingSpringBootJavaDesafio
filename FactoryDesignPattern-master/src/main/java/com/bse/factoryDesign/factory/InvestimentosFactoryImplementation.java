package com.bse.factoryDesign.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.factoryDesign.factory.constants.InvestimentosTipoConstantes;
import com.bse.factoryDesign.factory.impl.Poupanca;
import com.bse.factoryDesign.factory.impl.CDB;
import com.bse.factoryDesign.factory.impl.LCI;
import com.bse.factoryDesign.factory.impl.Acoes;

@Service
public class InvestimentosFactoryImplementation {

	@Autowired
	private CDB cdb;
	@Autowired
	private Poupanca poupanca;
	@Autowired
	private Acoes acoes;
	@Autowired
	private LCI lci;

	private static final Map<String, Investimentos> handler = new HashMap<String, Investimentos>();

	@PostConstruct
	private Map<String, Investimentos> getObject() {
		handler.put(InvestimentosTipoConstantes.Acoes, acoes);
		handler.put(InvestimentosTipoConstantes.CDB, cdb);
		handler.put(InvestimentosTipoConstantes.LCI, lci);
		handler.put(InvestimentosTipoConstantes.Poupanca, poupanca);
		return handler;
	}

	public static Investimentos createInstance(String investimento) throws Exception {
		return Optional.ofNullable(handler.get(investimento)).orElseThrow(() -> new IllegalArgumentException("Investimento Invalido"));
	}

}
