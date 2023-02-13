package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return przychody * 0.15;
    }

    @Override
    public String toString() {
        return "Ryczalt Ewidencyjny";
    }
}
