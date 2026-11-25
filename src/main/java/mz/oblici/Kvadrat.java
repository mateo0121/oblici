
package mz.oblici;

public class Kvadrat extends Pravokutnik {

    public Kvadrat(String naziv, double stranica) {
        super(naziv, stranica, stranica);
    }

    @Override
    public String toString() {
        return "Kvadrat[naziv=" + getNaziv() + ", a=" + sirina + "]";
    }
}
