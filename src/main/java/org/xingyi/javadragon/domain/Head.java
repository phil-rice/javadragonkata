package org.xingyi.javadragon.domain;

import java.util.Objects;

public class Head {
    public final int IQ;

    public Head(int IQ) {
        this.IQ = IQ;
    }

    public Head withIQ(int IQ){
        return new Head(IQ);
    }

    @Override
    public String toString() {
        return "Head{" +
                "IQ=" + IQ +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Head head = (Head) o;
        return IQ == head.IQ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IQ);
    }
}
