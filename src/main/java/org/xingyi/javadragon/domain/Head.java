package org.xingyi.javadragon.domain;

public class Head {
    public final int IQ;

    public Head(int IQ) {
        this.IQ = IQ;
    }

    public Head withIQ(int IQ){
        return new Head(IQ);
    }
}
