package com.android.a19110313_doanthithanhvan;
import java.lang.Math;

public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POWER, GIAITHUA}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double power(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand,secondOperand);
    }

    public double giaithua(double firstOperand) {

        double giai_thua = 1;
        if (firstOperand == 0 || firstOperand == 1)
        {
            return giai_thua;
        }

        else
        {
            for (int i = 2; i <= firstOperand; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }

    }


}
