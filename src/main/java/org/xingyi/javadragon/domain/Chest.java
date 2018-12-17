package org.xingyi.javadragon.domain;

public class Chest {
    final Stomach stomach;
    final Heart heart;

    public Chest(Stomach stomach, Heart heart) {
        this.stomach = stomach;
        this.heart = heart;
    }

    public Chest withStomach(Stomach stomach){
        return new Chest(stomach, heart);
    }
    public Chest withHeart(Heart heart){
        return new Chest(stomach, heart);
    }
}
