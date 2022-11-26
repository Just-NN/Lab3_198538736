package org.usach.TDA;

import java.awt.*;

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
        this.hex = hex;
        this.bit = -1;
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }


    public String toStringHex() {
        return "Color: " +
                "hex=" + hex;
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

    public Color_198538736_GuajardoArias rgbToHex(){
        Color_198538736_GuajardoArias newC = new Color_198538736_GuajardoArias(this.hex.format("#%02x%02x%02x", this.r, this.g, this.b));
        return newC;
    }

    public boolean sameBit(int bit){
        if(getBit() == bit){
            return true;
        }
        return false;
    }
    public boolean sameHex(String hex){
        if(getHex() == hex){
            return true;
        }
        return false;
    }

    public boolean sameRGB(String rgb){
        if(toStringRGB() == rgb){
            return true;
        }
        return false;
    }

    public boolean sameColor(Color_198538736_GuajardoArias C){
        if(
                (this.bit == C.getBit()) &&
                (this.r == C.getR()) &&
                (this.g == C.getG()) &&
                (this.b == C.getB()) &&
                (this.hex == C.getHex())
        ){
            return true;
        }
        return false;
    }

}
