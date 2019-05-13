package com.company;

public class Hilo extends Thread {
    private int idNumber;

    private long initialTime;


    public Hilo() {
    }

    public Hilo(int id, long initialTime) {
        this.idNumber = id;
        this.initialTime = initialTime;
    }

    public int getIdnumber() {
        return idNumber;
    }

    public void setNombre(int id) {
        this.idNumber = id;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }


    @Override
    public void run() {
        esperarXsegundos(this.idNumber);
        System.out.println("Hilo: "+this.idNumber);
        System.out.println("Hola mundo");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public void start(){
        run();
    }

}
