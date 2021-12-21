package jp.ac.uryukyu.ie.e215710;

public class Character {
    String name ; //キャラクター名
    int hp ; //HP
    int chakra ; //チャクラ
    int attack ; //攻撃力
    String death ; //生死状態

    Character(String name, int hp, int chakra, int attack) {
        this.name = name ;
        this.hp = hp ;
        this.chakra = chakra ;
        this.attack = attack ;
        this.death = "生" ;
        System.out.println(name + "の登場!!") ;
        System.out.println(name + "のHPは" + hp + "、チャクラは" + chakra + "である。") ;
        System.out.println() ;
    }

    public String getName() {
        return this.name ;
    }

    public int getHp() {
        return this.hp ;
    }

    public int chakra() {
        return this.chakra ;
    }

    public int attack() {
        return this.attack ;
    }

    public String getDeath() {
        return this.death ;
    }

    public void kunai(Character cha) {
        int damageKunai = (int) (attack * 1.2) ;
        if (hp > 0) {
            System.out.println(name + "は" + cha.getName() + "にクナイで攻撃した！") ;
            System.out.println(name +"は" + cha.getName() + "に" + damageKunai + "ダメージ与えた") ;
            cha.injuredKunai(damageKunai);
            if (cha.hp > 0) {
                System.out.println(name + "のHPは" + hp + "、" + cha.getName() + "のHPは" + cha.getHp()) ;
            }
            System.out.println() ;
        }
    }

    public void syuriken(Character cha) {
        int damageShuriken = attack ;
        if (hp > 0) {
            System.out.println(name + "は" + cha.getName() + "に手裏剣で攻撃した！") ;
            System.out.println(name +"は" + cha.getName() + "に" + damageShuriken + "ダメージ与えた") ;
            cha.injuredShuriken(damageShuriken);
            if (cha.hp > 0) {
                System.out.println(name + "のHPは" + hp + "、" + cha.getName() + "のHPは" + cha.getHp()) ;
            }
            System.out.println() ;
        }
    }

    public void injuredKunai(int damageKunai) {
        
    }

    public void injuredShuriken(int damageShuriken) {
        
    }
}