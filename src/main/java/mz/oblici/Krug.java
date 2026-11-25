
package mz.oblici;

import java.util.Objects;

public class Krug extends Oblik {
    
    private double polumjer;

    public Krug(String naziv, double polumjer) {
        super(naziv);
        if (polumjer <= 0) {
            throw new IllegalArgumentException("Polumjer mora biti pozitivan broj.");
        }
        this.polumjer = polumjer;
    }

    public double getPolumjer() {
        return polumjer;
    }

    public double promjer() {
        return 2 * polumjer;
    }

    @Override
    public double povrsina() {
        return Math.PI * polumjer * polumjer;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * polumjer;
    }

    @Override
    public String toString() {
        return "Krug[" + super.toString() + ", r=" + polumjer + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Krug other = (Krug) obj;
        return Double.compare(other.polumjer, polumjer) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), polumjer);
    }
}
