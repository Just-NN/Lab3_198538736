package org.usach.TDA;

import java.util.Objects;

/* Descripcion: Color es la clase que usaremos para identificar los posibles valores que tendrá cada pixel.
    Permite una mayor manipulación de estos valores y mayor orden en el código
 */

public class Color_198538736_GuajardoArias {

    // valor que simboliza el bit para un pixbit
    private int bit;

    // valor que simboliza el hex para un pixhex
    private String hex;

    // valores que representan r, g y b para un pixrgb
    private int r;

    private int g;

    private int b;

    // en caso de construir un tipo de pixel, se asignan valores por defecto
    // a cada atributo que no se utilizará

    // constructor para el caso de que se solicite un pixbit
    public Color_198538736_GuajardoArias(int bit) {
        this.bit = bit;
        this.hex = "";
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }

    // constructor para el caso de que se solicite un pixhex
    public Color_198538736_GuajardoArias(String hex) {
        this.hex = hex;
        this.bit = -1;
        this.r = -1;
        this.g = -1;
        this.b = -1;
    }



    // constructor para el caso de que se solicite un pixrgb
    public Color_198538736_GuajardoArias(int r, int g, int b) {
        this.bit = -1;
        this.hex = "";
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // los getters de cada caso
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



    // checkers que se utilizan para saber el tipo de pixel dependiendo del color

    public boolean isBit(){
        return this.bit != -1;
    }

    public boolean isHex(){
        return !this.hex.equals("");
    }
    public boolean isRGB(){
        return (this.r != -1) || (this.g != -1) || (this.b != -1);
    }



    // checkea si el color ingresado es igual al del objeto
    public boolean sameColor(Color_198538736_GuajardoArias c){
        return (this.bit == c.getBit()) &&
                (this.r == c.getR()) &&
                (this.g == c.getG()) &&
                (this.b == c.getB()) &&
                (Objects.equals(this.hex, c.getHex()));
    }

    // construye un nuevo color utilizando el rgb para convertirlo a hex
    public Color_198538736_GuajardoArias rgbToHex(){
        return new Color_198538736_GuajardoArias(this.hex.format("#%02x%02x%02x", this.r, this.g, this.b));
    }


    // toString para cada caso y luego uno que los engloba
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
