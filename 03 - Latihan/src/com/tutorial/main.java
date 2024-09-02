package com.tutorial;

// Player
class Player {
    String nama;
    double HP;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String nama, double HP) {
        this.nama = nama;
        this.HP = HP;
    }

    void attack(Player oppenent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.nama + " attacking " + oppenent.nama + " with power " + attackPower);
        oppenent.defence(attackPower);
    }

    void defence(double attackPower){
        // Akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }
        this.HP -= damage;
        System.out.println(this.nama + " Gets damage " + damage);
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nNama   : " + this.nama);
        System.out.println("HP     : " + this.HP + " Hp");
        this.weapon.display();
        this.armor.display();
    }
}

// Senjata
class Weapon {
    String nama;
    double attackPower;

    Weapon(String nama, double attackPower) {
        this.nama = nama;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.nama + " , attack : " + this.attackPower);
    }

}

// Armor
class Armor {
    String nama;
    double defencePower;

    Armor(String nama, double defencePower) {
        this.nama = nama;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Defence : " + this.nama + " , defence : " + this.defencePower);
    }
}

public class main {
    public static void main(String[] args) {
        // Player
        Player player1 = new Player("Karina", 100);
        Player player2 = new Player("Eka", 70);

        // Membuat object senjata
        Weapon pedang = new Weapon("Pedang", 20);
        Weapon tongkatSihir = new Weapon("Tongkat Sihir", 10);

        // Membuat object armor
        Armor besi = new Armor("Besi", 15);
        Armor baju = new Armor("baju", 1);

        // Equip senjata dan armorls

        // PLayer 1
        player1.equipWeapon(pedang);
        player1.equipArmor(besi);
        player1.display();

        // Player 2
        player2.equipWeapon(tongkatSihir);
        player2.equipArmor(baju);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();  
    }
}
