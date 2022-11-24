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

    public void move_pix_h(int width) {
        if(x+1>=width){
            setX(0);
        }
        else{
            setX(x+1);
        }
    }

    public void move_pix_v(int height) {
        if(x+1>=height){
            setY(0);
        }
        else{
            setY(y+1);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
