package org.xingyi.javadragon.domain;


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
}
