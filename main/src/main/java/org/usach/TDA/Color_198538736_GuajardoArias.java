package org.usach.TDA;

import java.util.Objects;

/* Descripcion: Color es la clase que usaremos para identificar los posibles valores que tendrá cada pixel.
   Sus atributos son
 */

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

    public String getHex() {
        return hex;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }




    public boolean isBit(){
        return this.bit != -1;
    }

    public boolean isHex(){
        return !this.hex.equals("");
    }
    public boolean isRGB(){
        return (this.r != -1) || (this.g != -1) || (this.b != -1);
    }



    public boolean sameColor(Color_198538736_GuajardoArias c){
        return (this.bit == c.getBit()) &&
                (this.r == c.getR()) &&
                (this.g == c.getG()) &&
                (this.b == c.getB()) &&
                (Objects.equals(this.hex, c.getHex()));
    }

    public Color_198538736_GuajardoArias rgbToHex(){
        return new Color_198538736_GuajardoArias(this.hex.format("#%02x%02x%02x", this.r, this.g, this.b));
    }
    public String toStringBit() {
        return "Color: " +
                "bit=" + bit;
    }

    public String toStringHex() {
        return "Color: " +
                "hex=" + hex;
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
}
