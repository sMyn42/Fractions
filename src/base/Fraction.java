package base;

public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    //TODO default constructor (no arguments)
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }

    public Fraction(String frac){
        numerator = Integer.parseInt(frac.split("/")[0]);
        denominator = Integer.parseInt(frac.split("/")[1]);
    }

    // TODO toString()
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO  subtract()

    public Fraction subtract(Fraction other) /* subtract the other fraction from this fraction */
    {
        int n = this.numerator * other.getDenom() - this.denominator * other.getNum();
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO multiply()

    public Fraction multiply(Fraction other)
    {
        int n = this.numerator * other.getNum();
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO reciprocal()

    public Fraction reciprocal()
    {
        int n = this.denominator;
        int d = this.numerator;

        Fraction result = new Fraction(n,d);
        return result;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println(f1 + " + " + f2 + " = " + f3);	// print the answer


		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

        Fraction f5 = f1.multiply(f2);			// multiply 2 fractions
        System.out.println(f1 + " * " + f2 + " = " + f5);	// print the answer
	    
	Fraction f9 = f1.reciprocal();
	System.out.println("The reciprocal of " + f1 + " is: " + f9);

        Fraction f6 = new Fraction("3/7");
        Fraction f7 = new Fraction(11, 4);

        Fraction f8 = f6.add(f7);			// add 2 fractions
        System.out.println(f6 + " + " + f7 + " = " + f8);	// print the answer

		/*

		Add code to multiply f1 and f2 here

		Add code to call reciprocal here

		create 2 new fractions and add them here.

        */

    }
}
