package com.gzeinnumer.instrumentestedittext;

public class MyCalculator {

    private ServiceCalculator serviceCalculator;

    private int num1;
    private int num2;

    public ServiceCalculator getServiceCalculator() {
        return serviceCalculator;
    }

    public void setServiceCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return serviceCalculator.add(num1, num2);
    }

    public int substract() {
        return serviceCalculator.substract(num1, num2);
    }

    public int multiply() {
        return serviceCalculator.multiply(num1, num2);
    }

    public int divide() {
        return serviceCalculator.divide(num1, num2);
    }
}
