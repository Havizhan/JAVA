package com.tutorial;

class Display {
    static String singkatan = "Alpha";
    public String name;

    Display(String name) {
        this.name = name;
    }

    // Menambahkan pengubah nilai
    void setSingkatan(String inputSingkatan) {
        // singkatan = inputSingkatan; //alternatif pertama
        // this.singkatan = inputSingkatan; //alternatif kedua
        Display.singkatan = inputSingkatan;
    }

    public void show() {
        System.out.println("Namaku adalah : " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display("Hazan");
        Display display2 = new Display("Rhavizhan");

        // Menampilkan Display
        display1.show();
        display2.show();

        // mencoba mengganti nilai variabel dengan veriabel static awal
        System.out.println("\nMengubah variabel static : ");
        System.out.println("Nama lainku ke-1 adalah = " + display1.singkatan);
        System.out.println("Nama lainku ke-2 adalah = " + display2.singkatan);
        System.out.println("Nama lainku ke-3 adalah = " + Display.singkatan);

        // Mengganti variabel static
        Display.singkatan = "Beta";

        System.out.println("\nMengubah variabel static : ");
        System.out.println("Nama lainku ke-4 adalah = " + display1.singkatan);
        System.out.println("Nama lainku ke-5 adalah = " + display2.singkatan);
        System.out.println("Nama lainku ke-6 adalah = " + Display.singkatan);

        // Mengganti variabel static dengan menggunakan method di dalam class
        display1.setSingkatan("Delta");
        // display1.setSingkatan("Gamma");

        System.out.println("\nMengubah variabel static : ");
        System.out.println("Nama lainku ke-7 adalah = " + display1.singkatan);
        System.out.println("Nama lainku ke-8 adalah = " + display2.singkatan);
        System.out.println("Nama lainku ke-9 adalah = " + Display.singkatan);

    }
}
