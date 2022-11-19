package cl.ayudantia.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.ayudantia.calculadora.controller.Calculadora1;
import cl.ayudantia.calculadora.controller.Calculadora2;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		/*
		SpringApplication.run(CalculadoraApplication.class, args);
		Calculadora1 calculadora1 = new Calculadora1();
		calculadora1.setOperandOne(12.5D);
		calculadora1.setOperation("+");
		calculadora1.setOperandTwo(143.5D);
		calculadora1.performOperation();
		System.out.println(calculadora1.getResult());
		*/

		Calculadora2 calculadora2 = new Calculadora2();
		calculadora2.setOperand(1D);
		calculadora2.setOperation("+");
		calculadora2.setOperand(2D);
		calculadora2.setOperation("+");
		calculadora2.setOperand(3D);
		calculadora2.setOperation("+");
		calculadora2.setOperand(4D);
		calculadora2.setOperation("-");
		calculadora2.setOperand(9D);
		System.out.println(calculadora2.getResult());
	}
}
