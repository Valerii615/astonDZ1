package ru.valerii.astondz1.model;

public class Warrior extends Hero{
    private int damage = 2;
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой Warrior атакует врага");
        enemy.takeDamage(damage);
    }
}
