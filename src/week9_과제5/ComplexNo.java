package week9_과제5;
// 복소수 사칙연산
public class ComplexNo {
    private double real;
    private double imag;

    public ComplexNo() {
        this(0, 0);
    }

    public ComplexNo(double re, double im) {
        this.real = re;
        this.imag = im;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public void add(ComplexNo other) {
        this.real = this.real + other.real;
        imag = imag + other.imag;
    }

    public ComplexNo add2 (ComplexNo other) {
        double tempRe = real + other.real;
        double tempIm = imag + other.imag;
        ComplexNo temp = new ComplexNo(tempRe, tempIm);
        return temp;
    }

    public void substract(ComplexNo other) {
        real = this.real - other.real;
        imag = this.imag - other.imag;
    }

    public void multiply(ComplexNo other) {
        real = this.real * other.real - this.imag * other.imag;
        imag = this.real * other.imag + this.imag * other.real;
    }

    public void divide(ComplexNo other) {
        double denom = other.real * other.real + other.imag * other.imag;
        real = (this.real * other.real + this.imag * other.imag) / denom;
        imag = (this.imag * other.real - this.real * other.imag) / denom;
    }

    public static void main(String[] args) {
        ComplexNo cn = new ComplexNo();
        System.out.println(cn);

        ComplexNo cn2 = new ComplexNo(1, 2);
        System.out.println(cn2);

        ComplexNo cn3 = new ComplexNo(3, 4);
        System.out.println(cn3);

        cn2.add(cn3);
        System.out.println(cn2);

        cn2.substract(cn3);
        System.out.println(cn2);

        cn2.multiply(cn3);
        System.out.println(cn2);

        cn2.divide(cn3);
        System.out.println(cn2);
    }
}
