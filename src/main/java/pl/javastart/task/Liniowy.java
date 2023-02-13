package pl.javastart.task;

public class Liniowy extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        double dochod = przychody - koszty;
        return dochod * 0.19;
    }

    @Override
    public String toString() {
        return "Liniowy";
    }
}
