package br.tdd.crud;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class PropostaTeste {
	
	Proposta p;

	@Before
	public void setUp() {
		p = new Proposta("Marcelo Mariath", "Masculino", "005.394.690-17", 2536859, "11/01/1985", 4085791,
				"SJS", "01/02/2002", "51-3032-3599", "51-98452-6699", "teste@teste.com.br", "rua teste", 200,
				"92415-999", "RS", "SIAPE", 1757, (float) 10.000);
	}

	@Test
	public void deveIncluirPropostacomSucessoeAlterarStatuspara10() throws Exception {
		p.IncluirProposta();
		assertTrue(p.getStatus() == 10);
	}

	@Test
	public void deveInformaraMensagemPropostaIncluidaComSucesso() {
		p.IncluirProposta();
		assertEquals("Proposta Incluída com Sucesso", p.getMensagem());
	}

	@Test
	public void deveMostrarMensagemCampoNullEAlterarStatus() {
		p.setCpf(null);
		p.IncluirProposta();
		assertEquals("Favor informar o CPF", p.getMensagem());
		assertTrue(p.getStatus() == 11);
	}

}
