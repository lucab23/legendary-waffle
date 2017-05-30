final class Game3 {

  private int currentRound;
  private Player player;
  private Monster monster;


  private Game3(Player player, Monster monster) {
      this.currentRound = 0;
      this.player = player;
      this.monster = monster;

      Fight fight = new Fight(player, monster);
  }


  public static void main(String[] args) {


      int hp = Integer.parseInt(args[0]);
      int atk = Integer.parseInt(args[1]);
      int hit = Integer.parseInt(args[2]);
      int healPotions = 3;
      int maxHp = hp;
      String name = name;

      Player player = new Player(hp, atk, hit, "Player", healPotions, maxHp);
      Monster monster = new Monster(2 * hp, atk / 2, 50, "Monster");

      Game3 game3 = new Game3(player, monster);
      Fight fight = new Fight(player, monster);

  }

}
