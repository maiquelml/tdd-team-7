package br.tdd.crud;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PropostaTeste {

	Proposta p;

	@Before
	public void setUp() {

		p = new Proposta();
		p.IncluirProposta();
	}

	@Test
	public void deveIncluirPropostacomSucessoeAlterarStatuspara10() throws Exception {
		assertTrue(p.getStatus() == 10);
	}

	@Test
	public void deveInformaraMensagemPropostaIncluidaComSucesso() {
		assertEquals("Proposta Incluída com Sucesso", p.getMensagem());
	}

	@Test
	public void deveMostrarExceptionSeAlgumParametroforNull() {

	}

}
