public class Player extends Character {

  private int healPotions;
  private int maxHP;

  public Player(int hp, int atk, int hit, String name, int healPotions, int maxHP) {
    super(hp, atk, hit, name);
    this.healPotions = healPotions;
    this.maxHP = maxHP;

  }

  int getHealPotions() {
    return this.healPotions;
  }

  int getMaxHP() {
    return this.maxHP;
  }

  void setHealPotions() {
    this.healPotions = healPotions;
  }

  void setMaxHP() {
    this.maxHP = maxHP;
  }

  int usePotion() {
      if (healPotions > 0) {
          if ((getMaxHp() - getHp()) < 50) {
              setHp(getMaxHp());
              healPotions--;
          } else {
              setHp(getHp() + 50);
              healPotions--;
          }
      } else {
          return -1;
      }
      return healPotions;
  }

}
