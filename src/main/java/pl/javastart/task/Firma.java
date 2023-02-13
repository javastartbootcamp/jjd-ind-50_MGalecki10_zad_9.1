package pl.javastart.task;

public class Firma {
    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    double[] wydatki = new double[10];
    double[] przychody = new double[10];
    int j = 0;
    int i = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania);
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow,
                sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sum = 0;
        for (double wydatek : wydatki) {
            sum += wydatek;
        }
        return sum;
    }

    private double zsumujPrzychody() {
        double sum = 0;
        for (double przychod : przychody) {
            sum += przychod;
        }
        return sum;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        przychody[i] = wartosc;
        i++;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        wydatki[j] = wartosc;
        j++;
    }
}
