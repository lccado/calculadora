package cl.ayudantia.calculadora.controller;

public class Calculadora1 {

    private Double operandOne;
    private Double operandTwo;
    private Double result;
    private String operation;

    public void setOperandOne(Double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(Double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getResult() {
        return result;
    }

    public void setOperBinary(Double operandOne, String operation, Double operandTwo) {
        this.operation = operation;
        this.operandTwo = operandTwo;
        this.operandOne = operandOne;
    }

    public void performOperation() {
        if ("+".equals(operation)) {
            this.result = operandOne + operandTwo;
        } else if ("-".equals(operation)) {
            this.result = operandOne - operandTwo;
        }
    }
}
