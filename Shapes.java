import java.lang.Math;

interface geometry {
    public void berechneFlaeche();
    public void berechneUmfang();
}

abstract class Figur implements geometry {

    //Kreis
    float radius = 3.2F;
    float pi = 3.14F;

    //Rechtwinkliges Dreieck
    float AC = 5.6F;
    float BC = 7.2F;
    double c = Math.pow(AC, 2) + Math.pow(BC, 2);
    double C = Math.sqrt(c);

    //Rechteck
    float laenge = 10.3F;
    float breite = 4.9F;
}

class Kreis extends Figur {

    public void berechneFlaeche() {
        float flaeche = pi * (radius * radius);
        System.out.println("Fläche = " + flaeche);
    }

    public void berechneUmfang() {
        float umfang = 2 * radius * pi;
        System.out.println("Umfang = " + umfang);
    }
}

class RechtWinkDreieck extends Figur {

    public void berechneFlaeche() {
        float flaeche = AC * BC / 2;
        System.out.println("Fläche = " + flaeche);
    }

    public void berechneUmfang() {
        double umfang = AC + BC + C;
        System.out.println("Umfang = " + umfang);
    }
}

class Rechteck extends Figur {

    public void berechneFlaeche() {
        float flaeche = laenge * breite;
        System.out.println("Fläche = " + flaeche);
    }

    public void berechneUmfang() {
        float umfang = laenge * 2 + breite * 2;
        System.out.println("Umfang = " + umfang);
    }
}

class Main {

    public static void main(String[] args) {

        Kreis myKreis = new Kreis();
        System.out.println("Kreis");
        myKreis.berechneFlaeche();
        myKreis.berechneUmfang();
        System.out.println("\n");

        RechtWinkDreieck myRWD = new RechtWinkDreieck();
        System.out.println("Rechtwinkliges Dreieck");
        myRWD.berechneFlaeche();
        myRWD.berechneUmfang();
        System.out.println("\n");

        Rechteck myRechteck = new Rechteck();
        System.out.println("Rechteck");
        myRechteck.berechneFlaeche();
        myRechteck.berechneUmfang();
        System.out.println("\n");
    }
}
