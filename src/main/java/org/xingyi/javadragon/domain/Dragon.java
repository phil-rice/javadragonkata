package org.xingyi.javadragon.domain;


import java.util.Objects;

public class Dragon {
    final Chest chest;
    final Head head;

    public Dragon(Chest chest, Head head) {
        this.chest = chest;
        this.head = head;
    }

    public Dragon withChest(Chest chest){
        return new Dragon(chest, head);
    }

    public Dragon withHead(Head head){
        return new Dragon(chest, head);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "chest=" + chest +
                ", head=" + head +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return Objects.equals(chest, dragon.chest) &&
                Objects.equals(head, dragon.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chest, head);
    }
}
