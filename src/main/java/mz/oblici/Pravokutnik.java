
package mz.oblici;

public class Pravokutnik extends Oblik {
    
    protected double sirina;
    protected double visina;

    public Pravokutnik(String naziv, double sirina, double visina) {
        super(naziv);
        if (sirina <= 0 || visina <= 0) {
            throw new IllegalArgumentException("Širina i visina moraju biti pozitivni brojevi.");
        }
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public double getVisina() {
        return visina;
    }

    public boolean jeLezeci() {
        return sirina > visina;
    }

    @Override
    public double povrsina() {
        return sirina * visina;
    }

    @Override
    public double opseg() {
        return 2 * (sirina + visina);
    }

    @Override
    public String toString() {
        return "Pravokutnik[" + super.toString() + ", a=" + sirina + ", b=" + visina + "]";
    }
}