package org.example.models;

public class Wizard extends Character{

    private int mana;

    private static final int MAX_HEALTH = 80;



    public Wizard() {
        super(MAX_HEALTH, 50, 3);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void increaseLive(){
        if(mana < 5){
            mana ++;
        }else{
            setLives(getLives() + 1);
            mana -= 5;
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
