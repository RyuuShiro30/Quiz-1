import java.util.Scanner;

public class jamperkuliahan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input waktu sekarang dan perkuliahan
        System.out.println("Masukkan jam, menit, detik sekarang (pisahkan spasi): ");
        int jam1 = input.nextInt(), m1 = input.nextInt(), s1 = input.nextInt();

        System.out.print("Masukkan jam, menit, detik perkuliahan (pisahkan spasi): ");
        int jam2 = input.nextInt(), m2 = input.nextInt(), s2 = input.nextInt();

        // Hitung selisih waktu dalam detik
        int sekarang = jam1 * 3600 + m1 * 60 + s1;
        int jamkelas = jam2 * 3600 + m2 * 60 + s2;
        int diff = (jamkelas - sekarang + 86400) % 86400;

        // Konversi kembali ke jam, menit, detik
        System.out.println("Menuju perkuliahan: " + diff / 3600 + " jam " + (diff % 3600) / 60 + " menit " + diff % 60
                + " detik.");

        input.close();
    }
}