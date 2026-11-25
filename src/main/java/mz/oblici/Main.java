
package mz.oblici;


public class Main {

    public static void main(String[] args) {
        Oblik[] oblici = {
            new Krug("kotac", 0.35),
            new Pravokutnik("stol", 1.20, 0.80),
            new Kvadrat("ploca", 1.0),
            new Trokut("trokut1", 3.0, 4.0, 5.0),
            new Krug("novcic", 0.05)
        };

        System.out.println("=== Popis oblika ===");
        for (Oblik oblik : oblici) {
            System.out.printf("%s, povrsina: %.2f, opseg: %.2f%n",
                    oblik, oblik.povrsina(), oblik.opseg());
        }

        double ukupnaPovrsina = 0;
        for (Oblik oblik : oblici) {
            ukupnaPovrsina += oblik.povrsina();
        }
        System.out.printf("\nUkupna povrsina svih oblika: %.2f%n", ukupnaPovrsina);

        Oblik najOpseg = najvecjiOpseg(oblici);
        System.out.println("Oblik s najvecim opsegom: " + najOpseg + 
                " (opseg: " + String.format("%.2f", najOpseg.opseg()) + ")");

        System.out.println("\n=== Posebnosti oblika ===");
        for (Oblik oblik : oblici) {
            if (oblik instanceof Krug k) {
                System.out.println(k.getNaziv() + " - promjer: " + k.promjer());
            } else if (oblik instanceof Pravokutnik p && !(oblik instanceof Kvadrat)) {
                System.out.println(p.getNaziv() + " - je lezeci: " + p.jeLezeci());
            }
        }
    }

    public static Oblik najvecjiOpseg(Oblik[] niz) {
        Oblik best = niz[0];
        for (Oblik oblik : niz) {
            if (oblik.opseg() > best.opseg()) {
                best = oblik;
            }
        }
        return best;
    }
}
