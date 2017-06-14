package com.jme3.post;

public class LumShaderHelperDto {

    private int srcW;

    private int srcH;

    private int bufW;

    private int bufH;

    public LumShaderHelperDto(int srcW, int srcH, int bufW, int bufH) {
        this.srcW = srcW;
        this.srcH = srcH;
        this.bufW = bufW;
        this.bufH = bufH;
    }

    public int getSrcW() {
        return srcW;
    }

    public void setSrcW(int srcW) {
        this.srcW = srcW;
    }

    public int getSrcH() {
        return srcH;
    }

    public void setSrcH(int srcH) {
        this.srcH = srcH;
    }

    public int getBufW() {
        return bufW;
    }

    public void setBufW(int bufW) {
        this.bufW = bufW;
    }

    public int getBufH() {
        return bufH;
    }

    public void setBufH(int bufH) {
        this.bufH = bufH;
    }
}
