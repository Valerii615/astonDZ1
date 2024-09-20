package ru.valerii.astondz1.model;

public abstract class Hero {
    private final String name;

    public Hero(String name) {
        this.name = name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }
}
