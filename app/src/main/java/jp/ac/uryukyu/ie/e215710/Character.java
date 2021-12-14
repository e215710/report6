package jp.ac.uryukyu.ie.e215710;

public class Character {
    String name ;
    int hp ;
    int chakra ;
    int attack ;

    Character(String name, int hp, int chakra, int attack) {
        this.name = name ;
        this.hp = hp ;
        this.chakra = chakra ;
        this.attack = attack ;
        System.out.println(name + "の登場!!") ;
        System.out.println(name + "のHPは" + hp + "、チャクラは" + chakra + "である。") ;
    }

    public String getName() {
        return this.name ;
    }

    public void kunai(Character cha) {
        int damageKunai = (int)(Math.random() * attack * 1.2) ;
        if (hp > 0) {
            cha.injuredKunai(damageKunai);
            System.out.println(name + "は" + cha.getName() + "にクナイで攻撃した！") ;
        }
    }

    public void syuriken(Character cha) {
        int damageShuriken = (int)(Math.random() * attack) ;
        if (hp > 0) {
            cha.injuredShuriken(damageShuriken);
            System.out.println(name + "は" + cha.getName() + "に手裏剣で攻撃した！") ;
        }
    }

    public void injuredKunai(int damageKunai) {
        if (hp <= 0) {
            hp -= damageKunai ;
            System.out.println(name + "は力尽きた...") ;
        }
    }

    public void injuredShuriken(int damageShuriken) {
        if (hp <= 0) {
            hp -= damageShuriken ;
            System.out.println(name + "は力尽きた...") ;
        }
    }
}