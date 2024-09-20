package ru.valerii.astondz1.model;

public class Archer extends Hero{
    private int damage = 3;
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой Archer атакует врага");
        enemy.takeDamage(damage);
    }
}
