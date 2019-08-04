package br.tdd.crud;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class PropostaTeste {
	final static Logger logger = Logger.getLogger(PropostaTeste.class);
	Proposta p;
	private ControleDeAcesso controleDeAcesso;

	@Before
	public void setUp() {
		System.out.println("Iniciando método setUP()...");
		controleDeAcesso = new ControleDeAcesso();
		p = new Proposta("Marcelo Mariath", "Masculino", "005.394.690-17", 2536859, "11/01/1985", 4085791, "SJS",
				"01/02/2002", "51-3032-3599", "51-98452-6699", "teste@teste.com.br", "rua teste", 200, "92415-999",
				"RS", "SIAPE", 1757, (float) 10.000);
	}

	@Test
	public void testarAcessoPorMatricula() {
		/**
		 * Uma proposta somente poderá ser excluída por usuários Administradores do
		 * sistema.
		 */
		System.out.println("Iniciando testes do método testarAcessoPorMatricula()...");
		assertEquals(true, controleDeAcesso.verificaListaContemAdministrador("11239"));
	}

	@Test
	public void deveIncluirPropostacomSucessoeAlterarStatuspara10() throws Exception {
		System.out.println("Iniciando testes do método deveIncluirPropostacomSucessoeAlterarStatuspara10()...");
		p.IncluirProposta();
		assertTrue(p.getStatus() == 10);
	}

	@Test
	public void deveInformaraMensagemPropostaIncluidaComSucesso() {
		System.out.println("Iniciando testes do método deveInformaraMensagemPropostaIncluidaComSucesso()...");
		p.IncluirProposta();
		assertEquals("Proposta Incluída com Sucesso", p.getMensagem());
	}

	@Test
	public void deveMostrarMensagemCampoNullEAlterarStatus() {
		System.out.println("Iniciando testes do método deveMostrarMensagemCampoNullEAlterarStatus()...");
		p.setCpf(null);
		p.IncluirProposta();
		assertEquals("Favor informar o CPF", p.getMensagem());
		assertTrue(p.getStatus() == 11);
	}
	
	@Test
	public void deveAlterarPropostacomSucessoeAlterarStatuspara30() throws Exception {
		p.setStatus(20);
		p.AlterarProposta();
		assertTrue(p.getStatus() == 30);
	}

	@Test
	public void deveAlterarPropostacomSucessoeAlterarStatuspara30() throws Exception {
		System.out.println("Iniciando testes do método deveAlterarPropostacomSucessoeAlterarStatuspara30()...");
		p.setStatus(20);
		p.AlterarProposta();
		assertTrue(p.getStatus() == 30);
	}

	@Test
	public void testarRemocaoPropostaPorNome() {
		System.out.println("Iniciando testes do método testarRemocaoPropostaPorNome()...");
		String motivoRemocao = "Escrever_aqui_o_motivo_da_exclusão";

		if (motivoRemocao.replace(" ", "").length() > 10) {
			assertEquals(true, p.removeProposta("Fulano"));
		} else {
			System.out.println(motivoRemocao.length());
			fail();
		}
	}

}
