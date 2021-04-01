package za.ac.cput.za.ac.cput.Calculator;

/**
 * @Author:Asiphiwe Hanjiwe 218336675
 * This program calculates fraction.
 */
public class Fraction
{

   public double numerator,denominator,fraction;

    public Fraction(double v, double v1)
    {
          this.numerator = v;
          this.denominator=v1;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                ", fraction=" + fraction +
                '}';
    }
}

