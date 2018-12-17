package org.xingyi.javadragon.domain;

import java.util.List;

public class Stomach {
    final List<Object> contents;

    public Stomach(List<Object> contents) {
        this.contents = contents;
    }

    public Stomach withContents(List<Object> contents){
        return new Stomach(contents);
    }
}
