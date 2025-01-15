package Exercise.OOPSs;

public class EXercise {

    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        //print results
        System.out.println("Addition");
        e.printComplex();
        System.out.println("Difference");
        f.printComplex();
        System.out.println("Product");
        g.printComplex();
    }
}

class Complex {

    int real;
    int img;

    Complex(int r, int i) {
        real = r;
        img = i;

    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.img) + (a.img * b.real)));
    }

    //method to print the complex number
    public void printComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (img == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + (img >= 0 ? "+" : "") + img + "i");
        }
    }
}
