package org.usach.TDA;

public class Pixel_198538736_GuajardoArias extends Abstract_Pixel_198538736_GuajardoArias{

    int bit;

    String hex;

    int r;

    int g;

    int b;


    public Pixel_198538736_GuajardoArias(int x, int y, int d, int bit) {
        super(x, y, d);
        this.bit = bit;
        this.hex = "";
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }

    public Pixel_198538736_GuajardoArias(int x, int y, int d, String hex) {
        super(x, y, d);
        this.bit = -1;
        this.hex = hex;
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }


    public Pixel_198538736_GuajardoArias(int x, int y, int d, int r, int g, int b) {
        super(x, y, d);
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


}
