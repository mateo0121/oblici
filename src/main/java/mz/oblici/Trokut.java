
package mz.oblici;


public class Trokut extends Oblik {
    
    private double a;
    private double b;
    private double c;

    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Stranice trokuta moraju biti pozitivne.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Zadane stranice ne zadovoljavaju nejednakost trokuta.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    @Override
    public double povrsina() {
        double s = opseg() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double opseg() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Trokut[" + super.toString() + ", a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}
