package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final int pierwszyProgPodatkowy = 10_000;
    private static final int drugiProgPodatkowy = 100_000;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        double dochod = przychody - koszty;
        if (dochod <= pierwszyProgPodatkowy) {
            return 0;
        } else if (dochod <= drugiProgPodatkowy) {
            double kwotawPierwszymProguPodatkowym = dochod - pierwszyProgPodatkowy;
            return kwotawPierwszymProguPodatkowym * 0.18;
        } else {
            double kwotawDrugimProguPodatkowym = dochod - drugiProgPodatkowy;
            double kwotaPonizej100000 = drugiProgPodatkowy - pierwszyProgPodatkowy;
            return (kwotawDrugimProguPodatkowym * 0.32) + (kwotaPonizej100000 * 0.18);
        }
    }

    @Override
    public String toString() {
        return "Skala Podatkowa";
    }
}
