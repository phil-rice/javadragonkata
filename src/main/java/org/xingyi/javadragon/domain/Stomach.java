package org.xingyi.javadragon.domain;

import java.util.List;
import java.util.Objects;

public class Stomach {
    final List<Object> contents;

    public Stomach(List<Object> contents) {
        this.contents = contents;
    }

    public Stomach withContents(List<Object> contents){
        return new Stomach(contents);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stomach stomach = (Stomach) o;
        return Objects.equals(contents, stomach.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

    @Override
    public String toString() {
        return "Stomach{" +
                "contents=" + contents +
                '}';
    }
}
