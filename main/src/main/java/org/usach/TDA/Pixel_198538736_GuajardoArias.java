package org.usach.TDA;

public class Pixel_198538736_GuajardoArias{

    public int x;

    public int y;

    public int d;

    public Color_198538736_GuajardoArias Color;

    public Pixel_198538736_GuajardoArias(int x, int y, int d, Color_198538736_GuajardoArias Color) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.Color = Color;
    }


    public int getBit() {
        return this.Color.getBit();
    }

    public void setBit(int bit) {
        this.Color.setBit(bit);
    }

    public String getHex() {
        return this.Color.getHex();
    }

    public void setHex(String hex) {
        this.Color.setHex(hex);
    }

    public int getR() {
        return this.Color.getR();
    }

    public void setR(int r) {
        this.Color.setR(r);
    }

    public int getG() {
        return this.Color.getG();
    }

    public void setG(int g) {
        this.Color.setG(g);
    }

    public int getB() {
        return this.Color.getB();
    }

    public void setB(int b) {
        this.Color.setB(b);
    }

    public boolean isBit(){
        return this.Color.isBit();
    }

    public boolean isHex(){
        return this.Color.isHex();
    }

    public boolean isRGB(){
        return this.Color.isRGB();
    }



    public void printPix(){
        System.out.println("X: " + this.x + " " + "Y: " + this.y + " " + this.Color.toString() + " " + "Depth: " + this.d + "\n");
    }

}
