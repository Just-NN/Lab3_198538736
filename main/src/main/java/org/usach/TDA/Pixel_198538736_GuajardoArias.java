package org.usach.TDA;

public class Pixel_198538736_GuajardoArias{

    private int x;

    private int y;

    private int d;

    private Color_198538736_GuajardoArias color;

    public Pixel_198538736_GuajardoArias(int x, int y, int d, Color_198538736_GuajardoArias color) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.color = color;
    }



    public boolean isBit(){
        return this.color.isBit();
    }

    public boolean isHex(){
        return this.color.isHex();
    }

    public boolean isRGB(){
        return this.color.isRGB();
    }



    public void printPix(){
        System.out.println("X: " + this.x + " " + "Y: " + this.y + " " + this.color.toString() + " " + "Depth: " + this.d + "\n");
    }

    public void move_pix_h(int width) {
        int width1 = width-1-this.x;
        setX(width1);
    }

    public void move_pix_v(int height) {
        int height1 = height-1-this.y;
        setY(height1);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean inRange(int x1, int y1, int x2, int y2){
        return (this.x >= x1) && (this.x <= x2) && (this.y >= y1) && (this.y <= y2);
    }


    public Color_198538736_GuajardoArias getColor() {
        return this.color;
    }


    public Pixel_198538736_GuajardoArias pixRGBToHex() {
        Color_198538736_GuajardoArias C = this.color.rgbToHex();
        return new Pixel_198538736_GuajardoArias(this.x, this.y, this.d, C);
    }

    public Pixel_198538736_GuajardoArias swapPositions(){
        int newX = this.y;
        int newY = this.x;
        System.out.println("PIXEL ANTES DEL SWAP");
        printPix();
        Pixel_198538736_GuajardoArias newPix = new Pixel_198538736_GuajardoArias( newX, newY, this.d, this.color);
        System.out.println("Nuevo pixel swapeado");
        newPix.printPix();
        return newPix;
    }
}
