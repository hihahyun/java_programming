package week9;

/*
   3 + 4i
 */
public class e_ComplexNo {
    private double real;
    private double imag;
    public e_ComplexNo() {
        this(0,0);
    }
    public e_ComplexNo(double re, double im){
        this.real = re;
        imag = im;
    }
    public String toString() {
        return real + " + " + imag + "i";
    }
    public void increment(e_ComplexNo other){
        real = real + other.real;
        imag = imag + other.imag;
    }

    public e_ComplexNo add(e_ComplexNo other) {
        double tempRe = real + other.real;
        double tempIm = imag + other.imag;
        e_ComplexNo temp = new e_ComplexNo(tempRe, tempIm);
        return temp;
    }

    public static void main(String[] args) {
        e_ComplexNo cn = new e_ComplexNo();
        System.out.println(cn);

        e_ComplexNo cn2 = new e_ComplexNo(3, 5);
        System.out.println(cn2);

        e_ComplexNo cn3 = new e_ComplexNo(-1, 10);
        System.out.println(cn3);

        cn2.increment(cn3);
        System.out.println(cn2);

        e_ComplexNo cn4 = cn2.add(cn3);
        System.out.println(cn4);

        cn2.add(cn3);
        System.out.println(cn2);


    }
}