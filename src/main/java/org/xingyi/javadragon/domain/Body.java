package org.xingyi.javadragon.domain;

import org.xingyi.javadragon.Lens;

import java.util.Objects;

public class Body {
    public static Lens<Body, Chest> chestL = new Lens<>(b -> b.chest, (b, c) -> b.withChest(c));
    public final Chest chest;

    public Body(Chest chest) {
        this.chest = chest;
    }

    public Body withChest(Chest chest) {
        return new Body(chest);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return Objects.equals(chest, body.chest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chest);
    }


    @Override
    public String toString() {
        return "Body{" +
                "chest=" + chest +
                '}';
    }
}
