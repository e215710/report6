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

    /**
    * getterメソッド
    * nameを取得する
    * @return name
    */
    public String getName() {
        return this.name ;
    }

    /**
    * getterメソッド
    * hpを取得する
    * @return hp
    */
    public int getHp() {
        return this.hp ;
    }

    /**
    * getterメソッド
    * chakraを取得する
    * @return chakra
    */
    public int getChakra() {
        return this.chakra ;
    }

    /**
    * getterメソッド
    * attackを取得する
    * @return attack
    */
    public int getAttack() {
        return this.attack ;
    }

    /**
    * getterメソッド
    * deathを取得する
    * @return death
    */
    public String getDeath() {
        return this.death ;
    }

    /**
    * setterメソッド
    * nameを変更したい時に使う
    * @param name
    */
    public void setName(String name) {
        this.name = name ;
    }

    /**
    * setterメソッド
    * hpを変更したい時に使う
    * @param hp
    */
    public void setHp(int hp) {
        this.hp = hp ;
    }

    /**
    * setterメソッド
    * chakraを変更したい時に使う
    * @param chakra
    */
    public void setChakra(int chakra) {
        this.chakra = chakra ;
    }

    /**
    * setterメソッド
    * attackを変更したい時に使う
    * @param attack
    */
    public void setAttack(int attack) {
        this.attack = attack ;
    }

    /**
    * setterメソッド
    * deatheを変更したい時に使う
    * @param death
    */
    public void setDeath(String death) {
        this.death = death ;
    }

    public void kunai(Character cha) {
        int damageKunai = (int) (attack * 1.2) ;
        if (hp > 0 && cha.hp > 0) {
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
        if (hp > 0 && cha.hp > 0) {
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