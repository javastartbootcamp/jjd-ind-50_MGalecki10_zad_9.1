package pl.javastart.task;

public class FormaOpodatkowania {
    private String name;

    public double wyliczPodatek(double przychody, double koszty) {
        System.out.println("Metoda z wyliczaniem podatku nie została nadpisana");
        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
