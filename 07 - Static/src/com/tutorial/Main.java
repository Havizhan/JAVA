package com.tutorial;

import java.util.ArrayList;

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


// Static Method
class Player {
    // Membuat array list
    private static ArrayList<String> nameList = new ArrayList<String>();

    private static int numberOfPlayer;
    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name); // Memasukkan Nama ke ArrayList
    }

    static void showNumberOfPlayer(){
        System.out.println("Number of palyer : " + Player.numberOfPlayer);
    }

    void tampilkan(){
        System.out.println("Namaku adalah : " + this.name);
    }

    static ArrayList<String> getName(){
        return Player.nameList;
    }
}

class Main {
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
        System.out.println("\n");


        // Static ke 2
        Player player1 = new Player("Ipul");
        Player player2 = new Player("Hamzah");
        Player player3 = new Player("Kaipul");
        Player player4 = new Player("Rendy");

        Player.showNumberOfPlayer();
        System.out.println("Names : " + Player.getName());


    }
}
