package org.usach.TDA;


public abstract class Abstract_Pixel_198538736_GuajardoArias {

    int x;

    int y;

    int d;

    public Abstract_Pixel_198538736_GuajardoArias(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getD() {
        return d;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setD(int d) {
        this.d = d;
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


}
