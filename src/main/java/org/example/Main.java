package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//
//        System.out.println("distance(0,0)= " + first.distance());
//
//        System.out.println("distance(second)= " + first.distance(second));
//
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//
//        Point point = new Point(0,0);
//
//        System.out.println("distance()= " + point.distance());

        Player player = new Player("emrah",100,Weapon.AXE);
        System.out.println("healthremaining: "+ player.healthRemaining());

        Player player2 = new Player("hasan", 90,Weapon.SWORD);
        System.out.println("healthremaining: "+ player2.healthRemaining());

        player.loseHealth((int) (player2.getWeapon().getDamage() * player2.getWeapon().getAttackSpeed()));
        System.out.println("healthremaining after damage: "+ player2.healthRemaining());

        player.restoreHealth(70);
        System.out.println("healthremaining after restore: "+ player2.healthRemaining());
    }
}