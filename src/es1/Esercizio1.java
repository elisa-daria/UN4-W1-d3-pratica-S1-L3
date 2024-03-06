package es1;

import entities.Rettangolo;

public class Esercizio1 {
    public static void main(String[] args) {
        Rettangolo a=new Rettangolo(10,5);
        a.getArea();
        a.getPerimeter();
        a.stampaRettangolo();
        Rettangolo b=new Rettangolo(25,10);

        Rettangolo.stampaDueRettangoli(a,b);

    }
}
