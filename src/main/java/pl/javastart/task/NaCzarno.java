package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return 0;
    }

    @Override
    public String toString() {
        return "Na Czarno";
    }
}
