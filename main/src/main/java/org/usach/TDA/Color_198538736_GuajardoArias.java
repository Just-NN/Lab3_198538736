package org.usach.TDA;

import java.util.Objects;



/***
 * Clase que representa los colores de cada pixel
 * @author ivang
 */
public class Color_198538736_GuajardoArias {

    /***
     * valor que simboliza el bit para un pixbit
     */
    private int bit;

    /***
     * valor que simboliza el hex para un pixhex
     */
    private String hex;

    /***
     * valores que representan r, g y b para un pixrgb
     */
    private int r;

    /***
     * valores que representan g para un pixrgb
     */

    private int g;

    /***
     * valores que representan b para un pixrgb
     */
    private int b;

    /***
     * constructor para el caso de que se solicite un pixbit
     * @param bit
     */
    public Color_198538736_GuajardoArias(int bit) {
        this.bit = bit;
        this.hex = "";
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }

    /***
     * constructor para el caso de que se solicite un pixhex
      * @param hex
     */
    public Color_198538736_GuajardoArias(String hex) {
        this.hex = hex;
        this.bit = -1;
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }


    /**
     * constructor para el caso de que se solicite un pixrgb
     * @param r
     * @param g
     * @param b
     */
    public Color_198538736_GuajardoArias(int r, int g, int b) {
        this.bit = -1;
        this.hex = "";
        this.r = r;
        this.g = g;
        this.b = b;
    }

    /***
     * los getters de cada caso
     * @return bit
     */
    public int getBit() {
        return bit;
    }


    /***
     * el getter para hex
     * @return hex
     */
    public String getHex() {
        return hex;
    }

    /***
     * el getter para r
     * @return r
     */
    public int getR() {
        return r;
    }

    /***
     * el getter para g
     * @return g
     */
    public int getG() {
        return g;
    }

    /***
     * el getter para b
     * @return b
     */
    public int getB() {
        return b;
    }



    /***
     * checkers que se utilizan para saber el tipo de pixel dependiendo del color
     * @return boolean
     */
    public boolean isBit(){
        return this.bit != -1;
    }

    /***
     * checkers que se utilizan para saber el tipo de pixel dependiendo del color
     * @return boolean
     */
    public boolean isHex(){
        return !this.hex.equals("");
    }
    /***
     * checkers que se utilizan para saber el tipo de pixel dependiendo del color
     * @return boolean
     */
    public boolean isRGB(){
        return (this.r != -1) || (this.g != -1) || (this.b != -1);
    }




    /***
     * Método que retorna si el color es el mismo que el del objeto
     * @param c
     * @return
     */
    public boolean sameColor(Color_198538736_GuajardoArias c){
        return (this.bit == c.getBit()) &&
                (this.r == c.getR()) &&
                (this.g == c.getG()) &&
                (this.b == c.getB()) &&
                (Objects.equals(this.hex, c.getHex()));
    }

    //

    /***
     * método que construye un nuevo color utilizando el rgb para convertirlo a hex
     * @return Color_198538736_GuajardoArias
     */
    public Color_198538736_GuajardoArias rgbToHex(){
        return new Color_198538736_GuajardoArias(this.hex.format("#%02x%02x%02x", this.r, this.g, this.b));
    }



    /***
     * toString para cada caso y uno que los engloba
     * @return String
     */
    public String toStringBit() {
        return "Color: " +
                "bit=" + bit;
    }

    /***
     * toString para cada caso y uno que los engloba
     * @return String
     */
    public String toStringHex() {
        return "Color: " +
                "hex=" + hex;
    }

    /***
     * toString para cada caso y uno que los engloba
     * @return String
     */
    public String toStringRGB() {
        return "Color: " +
                "r=" + r +
                ", g=" + g +
                ", b=" + b;
    }

    /***
     * toString para cada caso y uno que los engloba
     * @return String
     */
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
