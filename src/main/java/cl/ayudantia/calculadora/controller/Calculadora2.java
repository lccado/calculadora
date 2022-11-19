package cl.ayudantia.calculadora.controller;

import java.util.ArrayList;
import java.util.List;

public class Calculadora2 {
    private List<Object> list;

    public Calculadora2() {
        list = new ArrayList<Object>();
    }

    public void setOperand(Double operandOne) {
        if (list.size() > 0 && list.get(list.size() - 1) instanceof Double) {
            System.out.println("Error tienes que ingresar un operacion");
        } else {
            list.add(operandOne);
        }
    }

    public void setOperation(String operation) {
        if (list.size() > 0 && list.get(list.size() - 1) instanceof String) {
            System.out.println("Error tienes que ingresar un operador");
        } else {
            list.add(operation);
        }
    }

    public Double getResult() {
        Calculadora1 calculadora1 = new Calculadora1();
        Double result = null;
        int index = 0;
        if (list.size() >= 3) {
            calculadora1.setOperBinary(
                    (Double) list.get(index++),
                    (String) list.get(index++),
                    (Double) list.get(index++));
            calculadora1.performOperation();
            result = calculadora1.getResult();

            if (list.size() > 3 && (list.size() - 3) % 2 == 0) {
                do {
                    calculadora1.setOperBinary(
                            result,
                            (String) list.get(index++),
                            (Double) list.get(index++));
                    calculadora1.performOperation();
                    result = calculadora1.getResult();
                } while (index < list.size());
            }
        }
        return result;
    }
}
