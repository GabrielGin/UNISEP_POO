package calculadora_herenca;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Soma extends calculadora {

	public Soma(double valor1, double valor2) {
		super(valor1,valor2);
	}
	
	
	public void soma() {
		double resultado = valor1 + valor2;
		
		
		System.out.println("RESULTADO DA SOMA: " + resultado);
		
	}
	
		
	}

 

}