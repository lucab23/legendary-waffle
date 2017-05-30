public class Character {

  private int hp;
  private int atk;
  private int hit;
  private String name;

  public Character(int hp, int atk, int hit, String name) {
    this.hp = hp;
    this.atk = atk;
    this.hit = hit;
    this.name = name;
  }

  int getHp() {
    return this.hp;
  }

  int getAtk() {
    return this.atk;
  }

  int getHit() {
    return this.hit;
  }

  String getName() {
    return this.name;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }

  public void setHit(int hit) {
    this.hit = hit;
  }

  public void setName(String name) {
    this.name = name;
  }



  public String toString() {
      String statement = name + "has " + this.hp + " hp";
      return statement;
  }

  public int calculateAttackDamage() {
      int hit = this.hit;
      int zufall = (int) (100 * Math.random());
      if (zufall > hit) {
          return -1;
      } else {
          return atk;
      }

  // public int takeDamage(int damage) {
  //         setHp(getHp() - getAtk());
  //         return damage;
  //     }



}
