package org.usach.TDA;

public class Pixhex_198538736_GuajardoArias extends Pixel_198538736_GuajardoArias {





    private String hex;



    public Pixhex_198538736_GuajardoArias(int x, int y, int d, int x1, int y1, String hex, int d1) {
        super(x, y, d);
        this.x = x1;
        this.y = y1;
        this.hex = hex;
        this.d = d1;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }



}
