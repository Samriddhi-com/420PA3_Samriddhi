package com.Assignment2;

// Define the interface
public interface IShootable {
    void onHit(int damage); // Abstract method
}

// Implementing the interface in a Player class
 class Player implements IShootable {
    private int health;

    public Player(int health) {
        this.health = health;
    }

    @Override
    public void onHit(int damage) {
        health -= damage;
        System.out.println("Player takes " + damage + " damage. Remaining health: " + health);
    }
}

// Implementing the interface in a Wall class
class Wall implements IShootable {
    private int durability;

    public Wall(int durability) {
        this.durability = durability;
    }

    @Override
    public void onHit(int damage) {
        durability -= damage;
        System.out.println("Wall takes " + damage + " damage. Remaining durability: " + durability);
    }
}

// Implementing the interface in a Trap class
 class Trap implements IShootable {
    private boolean disarmed = false;

    @Override
    public void onHit(int damage) {
        disarmed = true;
        System.out.println("Trap is disarmed!");
    }
}

// Bullet class that shoots IShootable objects
 class Bullet {
    public void shoot(IShootable target, int damage) {
        target.onHit(damage);
    }
}

// Using the interface
/*public class Main {
    public static void main(String[] args) {
        IShootable player = new Player(100);
        IShootable wall = new Wall(50);
        IShootable trap = new Trap();

        Bullet bullet = new Bullet();

        // Shooting different objects
        bullet.shoot(player, 20);
        bullet.shoot(wall, 15);
        bullet.shoot(trap, 10);
    }
}*/
