import java.util.Scanner;

public class jarak {

    public static void main(String[] args) {
        // Deklarasi variabel kecepatan dan waktu
        double kecepatan = 60.0; // dalam km/jam
        double waktu = 1.5; // dalam jam

        // Menghitung jarak dalam kilometer
        double jarakKm = kecepatan * waktu;

        // Konversi jarak ke meter
        double jarakMeter = jarakKm * 1000;

        // Output hasil
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Waktu: " + waktu + " jam");
        System.out.println("Jarak: " + jarakKm + " km");
        System.out.println("Jarak dalam meter: " + jarakMeter + " meter");

    }
}