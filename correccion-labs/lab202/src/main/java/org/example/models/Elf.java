package org.example.models;


public class Elf extends Character {

    private int potions;

    private static final int MAX_HEALTH = 50;

    public Elf() {
        super(MAX_HEALTH, 60, 3);
        this.potions = 3;
    }

    public int getPotions() {
        return potions;
    }

    public void setPotions(int potions) {
        this.potions = potions;
    }

    public void increaseHealth(){
        if(potions == 0){
            potions ++;
        }else{
            setHealth(getHealth() + 20);
            potions -= 1;
        }
    }
    @Override
    public void decreaseLives() {
        if(super.getLives() > 0) {
            super.decreaseLives();
            super.setHealth(MAX_HEALTH);
        }else{
            System.out.println("The warriro is dead.");
        }
    }
}
