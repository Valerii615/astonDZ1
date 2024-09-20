package ru.valerii.astondz1.model;

public class Mage  extends Hero{
    private int damage = 4;
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой Mage атакует врага");
        enemy.takeDamage(damage);
    }
}
