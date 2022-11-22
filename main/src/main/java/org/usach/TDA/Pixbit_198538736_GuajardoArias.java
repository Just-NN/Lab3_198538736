package org.usach.TDA;
public class Pixbit_198538736_GuajardoArias extends Pixel_198538736_GuajardoArias {

    private int bit;


    public Pixbit_198538736_GuajardoArias(int x, int y, int d, int x1, int y1, int d1, int bit) {
        super(x, y, d);
        this.x = x1;
        this.y = y1;
        this.d = d1;
        this.bit = bit;
    }


    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }


}
