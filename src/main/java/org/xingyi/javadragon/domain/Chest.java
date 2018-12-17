package org.xingyi.javadragon.domain;

import org.xingyi.javadragon.Lens;

import java.util.Objects;

public class Chest {
    final Stomach stomach;
    final Heart heart;
    public static Lens<Chest, Stomach> stomachL = new Lens<>(c -> c.stomach, (c, s) -> c.withStomach(s));

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chest chest = (Chest) o;
        return Objects.equals(stomach, chest.stomach) &&
                Objects.equals(heart, chest.heart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stomach, heart);
    }

    @Override
    public String toString() {
        return "Chest{" +
                "stomach=" + stomach +
                ", heart=" + heart +
                '}';
    }
}
