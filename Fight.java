import java.util.Scanner;

public class Fight {

    private Player player;
    private Monster monster;

/**
*Konstruktor für sFight mit den Parametern:
*@param p p
*@param m m
*/
    public Fight(Player p, Monster m) {
        this.player = p;
        this.monster = m;

        playerMove();
    }

/**
*Methode zum Start einer neuen Runde
*/
    void playerMove() {

        if (isGameOver() == false) {
            System.out.println("Attack(1) | Potion(0)");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 1) {
                playerAttack();
            } else if (choice == 0) {
                if (player.getHealPotions() <= 0) {
                    System.out.println("No more potions");
                    monsterMove();
                } else {
                    player.usePotion();
                    System.out.println("---------------");
                    System.out.println(player.toString());
                    System.out.println("Luca used potion (+50HP)");
                    monsterMove();
                }
            } else {
                System.out.println("Input not recognized");
                playerMove();
            }
        }
    }

/**
*Methode zur Darstellung und Ausführung des Kampfes (Spieler am Zug)
*/
    void playerAttack() {

        System.out.println("---------------");
        System.out.println(player.toString());

        if (player.calculateAttackDamage() != -1) {
            monster.setHp(monster.getHp() - player.getAtk());
            System.out.println("Luca hit Monster for " + player.getAtk() + " damage!");
        } else {
            System.out.println("Luca missed!");
        }
        if (monster.getHp() > 0) {
            monsterMove();
        } else {
            System.out.println("---------------");
            System.out.println("Luca has won the battle!");
        }

    }

/**
*Überprüft vor Rundenstart ob Spiel vorbei ist
*@return true or false
*/
    boolean isGameOver() {
        if (player.getHp() <= 0 || monster.getHp() <= 0) {
            return true;
        } else {
            return false;
        }
    }

/**
*Methode zur Darstellung und Ausführung des Kampfes (Monster am Zug)
*/
    void monsterMove() {

        System.out.println(monster.toString());

        if (monster.calculateAttackDamage() != -1) {
            player.setHp(player.getHp() - monster.getAtk());
            System.out.println("Monster hit Luca for " + monster.getAtk() + " damage!");
        } else {
            System.out.println("Monster missed!");
        }
        if (player.getHp() > 0) {
            playerMove();
        } else {
            System.out.println("---------------");
            System.out.println("Monster won the battle!");
        }

    }
}
