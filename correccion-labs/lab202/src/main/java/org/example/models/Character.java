package org.example.models;

public class Character {

    private int health;
    private int strength;
    private int lives;

    public Character(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decreaseLives() {
        this.lives --;
    }

    public void attack(Character enemy) {
        enemy.setHealth(enemy.getHealth() - strength);
        System.err.println("LA SALUD DE EL ENEMIGO ES " + enemy.getHealth());
        if(enemy.getHealth() <= 0) enemy.decreaseLives();
    }
}
