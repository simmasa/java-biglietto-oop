package jana60.bonus;

public class Biglietto {
    private double km;
    private int age;
    private double euroPk = 0.21;
    private double euroMin = euroPk-(euroPk*0.2);
    private double euroOver = euroPk-(euroPk*0.4);


    //setter
    public void setKm(double km) {
        if (km>0) {
            this.km=km;
        } else
            System.out.println("Valore non valido");
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        } else
            System.out.println("Valore non valido");

    }
    //no getter perchè all'utente non serve sapere questi dati

    //methods
    private double calcolaPrezzo() {
        double prezzo;
        if (age<18) {
            prezzo = km*euroMin;
        } else if (age>64) {
            prezzo = km*euroOver;
        } else
            prezzo=km*euroPk;

        return prezzo;
    }
    public String prezzoFormat() {
        return String.format("%.2f",calcolaPrezzo());
    }

}
