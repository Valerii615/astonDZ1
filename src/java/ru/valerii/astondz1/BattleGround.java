package ru.valerii.astondz1;

import ru.valerii.astondz1.model.*;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("warrior");
        Hero mage = new Mage("mage");
        Hero archer = new Archer("archer");
        Enemy enemy = new Enemy(10);

        warrior.attackEnemy(enemy);
        System.out.println("Враг жив?" + enemy.isAlive());

        mage.attackEnemy(enemy);
        System.out.println("Враг жив?" + enemy.isAlive());

        archer.attackEnemy(enemy);
        System.out.println("Враг жив?" + enemy.isAlive());

        warrior.attackEnemy(enemy);
        System.out.println("Враг жив?" + enemy.isAlive());


    }
}
