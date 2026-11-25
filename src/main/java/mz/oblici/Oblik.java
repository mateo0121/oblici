
package mz.oblici;


import java.util.Objects;

public abstract class Oblik {
    
    private String naziv;

    public Oblik(String naziv) {
        if (naziv == null || naziv.isBlank()) {
            throw new IllegalArgumentException("Naziv lika/oblik ne smije biti prazan.");
        }
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract double povrsina();
    public abstract double opseg();

    @Override
    public String toString() {
        return "naziv=" + naziv;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Oblik other = (Oblik) obj;
        return naziv.equals(other.naziv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naziv);
    }
}
