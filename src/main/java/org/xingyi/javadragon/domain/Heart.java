package org.xingyi.javadragon.domain;

public class Heart {
    final int beatsPerMin;

    public Heart(int beatsPerMin) {
        this.beatsPerMin = beatsPerMin;
    }

    public Heart withBeatsPerMin(int beatsPerMin){
        return new Heart(beatsPerMin);
    }
}
