package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 1000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        Firma zbigniewFryzjer = new Firma("ZbigniewFryzjer", new Liniowy());

        zbigniewFryzjer.dodajPrzychod("Kolorowanie i cięcie", 700);
        zbigniewFryzjer.dodajWydatek("farby", 100);

        zbigniewFryzjer.wyswietlPodsumowanie();

        Firma wykonczeniowkaKowalski = new Firma("Wykonczeniowka", new SkalaPodatkowa());

        wykonczeniowkaKowalski.dodajPrzychod("Wykonczenie willi", 100_000);
        wykonczeniowkaKowalski.dodajPrzychod("Odnowa Hali", 50_000);
        wykonczeniowkaKowalski.dodajWydatek("Materialy i Paliwo", 20_000);

        wykonczeniowkaKowalski.wyswietlPodsumowanie();
    }

}
