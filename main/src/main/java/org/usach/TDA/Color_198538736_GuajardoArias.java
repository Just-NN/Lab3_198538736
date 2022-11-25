package org.usach.TDA;

public class Color_198538736_GuajardoArias {

    private int bit;

    private String hex;

    private int r;

    private int g;

    private int b;


    public Color_198538736_GuajardoArias(int bit) {
        this.bit = bit;
        this.hex = "";
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }

    public Color_198538736_GuajardoArias(String hex) {
        this.bit = -1;
        this.hex = hex;
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }

    public String toStringHex() {
        return "Color: " +
                "hex='" + hex;
    }

    public Color_198538736_GuajardoArias(int r, int g, int b) {
        this.bit = -1;
        this.hex = "";
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public String toStringBit() {
        return "Color: " +
                "bit=" + bit;
    }


    public String toStringRGB() {
        return "Color: " +
                "r=" + r +
                ", g=" + g +
                ", b=" + b;
    }

    public String toString(){
        if(isBit()){
            return toStringBit();
        }
        else if (isHex()) {
            return toStringHex();
        }
        else {
            return toStringRGB();
        }
    }

    public boolean isBit(){
        if(this.bit == -1){
            return false;
        }
        return true;
    }

    public boolean isHex(){
        if(this.hex == ""){
            return false;
        }
        return true;
    }
    public boolean isRGB(){
        if((this.r == -1) && (this.g ==-1) && (this.b == -1)){
            return false;
        }
        return true;
    }

    public void rgbToHex(){
        this.hex = String.format("#%02x%02x%02x", this.r, this.g, this.b);
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }


}
