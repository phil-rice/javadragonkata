package org.xingyi.javadragon.domain;


import org.xingyi.javadragon.Lens;

import java.util.List;
import java.util.Objects;

public class Dragon {
    final Body body;
    final Head head;

    @Override
    public String toString() {
        return "Dragon{" +
                "body=" + body +
                ", head=" + head +
                '}';
    }

    public Dragon(Body body, Head head) {
        this.body = body;
        this.head = head;
    }


    public static Lens<Dragon, Body> bodyL = new Lens<>(d -> d.body, (d, b) -> d.withBody(b));
    public static Lens<Dragon, List<Object>> contentsL = Dragon.bodyL.andThen(Body.chestL).andThen(Chest.stomachL).andThen(Stomach.contentsL);


    public Dragon withBody(Body body) {
        return new Dragon(body, head);
    }

    public Dragon withHead(Head head) {
        return new Dragon(body, head);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return Objects.equals(body, dragon.body) &&
                Objects.equals(head, dragon.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, head);
    }
}
