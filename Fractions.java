package my.math;

public class Fractions {
    private int numerator, denominator, g;
    public Fractions(int numerator, int denominator){
        g = gcd(numerator, denominator);
        this.numerator = numerator/g;
        this.denominator = denominator/g;
    }

    public void output(){
        output(this.numerator, this.denominator);
    }

    private void output(int numerator, int denominator){
        if (numerator > 0 & denominator > 0 | numerator < 0 & denominator < 0){
            System.out.println("+ " + abs(numerator) + "/" + abs(denominator));
        } else System.out.println("- " + abs(numerator) + "/" + abs(denominator));
    }

    public void add(Fractions fraction){
        int commonDenominator = this.denominator * fraction.denominator;
        int commonNumerator = this.numerator*fraction.denominator +
                fraction.numerator * this.denominator;
        g = gcd(commonNumerator, commonDenominator);
        commonNumerator/=g;
        commonDenominator/=g;
        output(commonNumerator, commonDenominator);
    }

    public void sub(Fractions fraction){
        int commonDenominator = this.denominator * fraction.denominator;
        int commonNumerator = this.numerator*fraction.denominator -
                fraction.numerator * this.denominator;
        g = gcd(commonNumerator, commonDenominator);
        commonNumerator/=g;
        commonDenominator/=g;
        output(commonNumerator, commonDenominator);
    }

    public void mul(Fractions fraction){
        int commonDenominator = this.denominator * fraction.denominator;
        int commonNumerator = this.numerator * fraction.numerator;
        g = gcd(commonNumerator, commonDenominator);
        commonNumerator/=g;
        commonDenominator/=g;
        output(commonNumerator, commonDenominator);
    }

    public void dir(Fractions fraction){
        int commonDenominator = this.denominator * fraction.numerator;
        int commonNumerator = this.numerator * fraction.denominator;
        g = gcd(commonNumerator, commonDenominator);
        commonNumerator/=g;
        commonDenominator/=g;
        output(commonNumerator, commonDenominator);
    }

    public boolean equal(Fractions fraction){
        if(this.numerator*fraction.denominator == fraction.numerator*this.denominator)
            return true;
        return false;
    }

    private int abs(int number){
        if(0 > number){
            return -number;
        } else return number;
    }

    private static int gcd(int x,int y) {
        while (y !=0) {
            int tmp = x%y;
            x = y;
            y = tmp;
        }
        return x;
    }
}
