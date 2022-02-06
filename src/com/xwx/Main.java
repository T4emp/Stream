package com.xwx;
import java.io.*;

class Thread1 extends Thread {
    long minPrime;
    Thread1(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        //2 не смог сделать
        Thread1 thread1 = new Thread1(1);
        thread1.start();
    }
}