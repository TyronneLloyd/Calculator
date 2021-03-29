package za.ac.cput;

/**
 * @Author: Tyronne Lloyd Hendricks
 * @Student Number: 215141210
 * @Date: 25/03/2021
 * @Description: Junit Testing
 */
public class Calculator
{

    public int firstNumber;
    public int secondNumber;
    public int sum;

    public Calculator(int firstNumber1, int secondNumber1) {
        this.firstNumber = firstNumber1;
        this.secondNumber = secondNumber1;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "Sum of A: " + firstNumber + "+" + "B: "+ secondNumber+ "=" + sum;
    }

}
