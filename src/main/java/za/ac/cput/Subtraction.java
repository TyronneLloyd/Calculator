package za.ac.cput;


public class Subtraction
{
        public int numOne;
        public int numTwo;
        public int difference;

    public Subtraction() {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.difference = difference;
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    @Override
    public String toString() {
        return "Difference of number one: " + numOne + "-" + "number two: "+ numTwo+ "=" + difference;
    }
}
