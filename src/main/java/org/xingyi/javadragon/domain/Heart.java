package org.xingyi.javadragon.domain;

import java.util.Objects;

public class Heart {
    final int beatsPerMin;

    public Heart(int beatsPerMin) {
        this.beatsPerMin = beatsPerMin;
    }

    public Heart withBeatsPerMin(int beatsPerMin){
        return new Heart(beatsPerMin);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heart heart = (Heart) o;
        return beatsPerMin == heart.beatsPerMin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(beatsPerMin);
    }

    @Override
    public String toString() {
        return "Heart{" +
                "beatsPerMin=" + beatsPerMin +
                '}';
    }
}
