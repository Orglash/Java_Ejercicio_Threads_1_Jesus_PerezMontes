package com.company;

public class Main {

    public static void main(String[] args) {

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        Hilo hilo1 = new Hilo(1, initialTime);
        Hilo hilo2 = new Hilo(2, initialTime);
        Hilo hilo3 = new Hilo(3, initialTime);
        Hilo hilo4 = new Hilo(4, initialTime);
        Hilo hilo5 = new Hilo(5, initialTime);
        Hilo hilo6 = new Hilo(6, initialTime);


        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
    }
}
