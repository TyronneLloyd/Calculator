package za.ac.cput;

/**
 * @Author: Tyronne Lloyd Hendricks
 * @Student Number: 215141210
 * @Date: 25/03/2021
 * @Description: Junit Testing
 */
public class App 
{
    private int a;
    private int b;

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
        return "App{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
