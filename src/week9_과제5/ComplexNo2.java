package week9_과제5;

public class ComplexNo2 {
    private double real;
    private double imag;

    public ComplexNo2() {
        this(0, 0);
    }

    public ComplexNo2(double re, double im) {
        this.real = re;
        this.imag = im;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public ComplexNo2 add(ComplexNo2 other) {
        return new ComplexNo2(this.real + other.real, this.imag + other.imag);
    }

    public ComplexNo2 substract(ComplexNo2 other) {
        return new ComplexNo2(this.real - other.real, this.imag - other.imag);
    }

    public ComplexNo2 multiply(ComplexNo2 other) {
        double re = this.real * other.real - this.imag * other.imag;
        double im = this.real * other.imag + this.imag * other.real;
        return new ComplexNo2(re, im);
    }

    public ComplexNo2 divide(ComplexNo2 other) {
        double denom = other.real * other.real + other.imag * other.imag;
        double re = (this.real * other.real + this.imag * other.imag) / denom;
        double im = (this.imag * other.real - this.real * other.imag) / denom;
        return new ComplexNo2(re, im);
    }

    public static void main(String[] args) {
        ComplexNo2 cn = new ComplexNo2();
        System.out.println(cn);

        ComplexNo2 cn2 = new ComplexNo2(1, 2);
        System.out.println(cn2);

        ComplexNo2 cn3 = new ComplexNo2(3, 4);
        System.out.println(cn3);

        ComplexNo2 cn4 = cn2.add(cn3);
        System.out.println(cn2);

        cn2.substract(cn3);
        System.out.println(cn2);

        cn2.multiply(cn3);
        System.out.println(cn2);

        cn2.divide(cn3);
        System.out.println(cn2);
    }
}
