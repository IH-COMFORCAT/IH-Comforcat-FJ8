package org.example.models;

public class Warrior extends Character{

    private int stamina;
    private static final int MAX_HEALTH = 100;


    public Warrior() {
        super(MAX_HEALTH, 100, 3);
    }



    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void increaseStrength(){
        if(stamina <= 0) {
            stamina++;
        }else {
            setStrength(getStrength() + 1);
            stamina --;

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
