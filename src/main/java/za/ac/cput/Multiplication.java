package za.ac.cput;
/*
215138848
Grant Hendricks
28 March 2021
 */
public class Multiplication {

    public int a;
    public int b;

    public Multiplication(int num1, int num2){
        this.a = num1;
        this.b = num2;
    }

    public double multiply (final int a, final int b){
        return a*b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " x " + b + " = " + (a*b);
    }
}
