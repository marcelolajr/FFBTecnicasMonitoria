import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MissionTest {
	@Test public void TestarSeARecompensaEMaiorDoQueZero(){
		Mission classUnderTest = new Mission();
		classUnderTest.setRecompensa(-1);
		
		assertTrue("TestarSeARecompensaEstaPreenchida should return 'true'",classUnderTest.getRecompensa()==null);
	}
	@Test public void TestarSeARecompencaEPositiva (){
		Mission classUnderTest = new Mission();
		classUnderTest.setRecompensa(1);
		assertTrue("TestarSeARecompensaEstaPreenchida should return 'true'",classUnderTest.getRecompensa()==1);
	}
	
	@Test public void TestarSeObjetoEstaPreenchidoCorretamente() {
		Mission classUnderTest = new Mission();
		classUnderTest.setObjetivo("Blazão");
		classUnderTest.setRecompensa(10);
		classUnderTest.setResumo("Blazinho");
		classUnderTest.setLocalisacao("Fortaleza");
		
		assertTrue("O teste de preencher corretamente deve retornar verdadeiro", classUnderTest.validar() );
	}
	
	@Test public void TesterSeDaFalsoComObjetoVazio() {
		Mission classUnderTest = new Mission();
		
		assertTrue("O objeto está preenchido errado e a validação voltou falso", !classUnderTest.validar());
	}
    @Test public void TestarSeOResumoNaoEstaPeenchido(){
    	Mission classUnderTest = new Mission();
    	classUnderTest.setResumo("jesus");
    	assertTrue("TestarSeOResumoNaoEstaPeenchido should return 'true'", classUnderTest.getResumo().equals("jesus"));
    }
    @Test public void TestarSeALocalisacaoEstaValida(){
    	Mission classUnderTest = new Mission();
    	classUnderTest.setLocalisacao("Nazare");
    	assertTrue("TestarSeALocalisacaoEstaValida should return 'true'", classUnderTest.getLocalisacao().equals("Nazare"));
    	}
}
