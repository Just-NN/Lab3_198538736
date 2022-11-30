package org.usach.TDA;


/*
Clase que representa los pixeles, contiene valores para los 3 tipos e implementa métodos para manipularlos adecuadamente en cada caso
 */
public class Pixel_198538736_GuajardoArias{

    // atributos de la clase
    // x e y representan las coordenadas por medio de enteros
    private int x;

    private int y;

    // d representa la profundidad del pixel
    private int d;

    // color contendrá un objeto de tipo color, que representa la información del color para el pixel
    private Color_198538736_GuajardoArias color;


    // constructor de pixel
    public Pixel_198538736_GuajardoArias(int x, int y, int d, Color_198538736_GuajardoArias color) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.color = color;
    }

    // get color para poder obtener la información del color del pixel
    public Color_198538736_GuajardoArias getColor() {
        return this.color;
    }

    // checkers para comprobar el tipo de pixel que representa en cada caso
    public boolean isBit(){
        return this.color.isBit();
    }

    public boolean isHex(){
        return this.color.isHex();
    }

    public boolean isRGB(){
        return this.color.isRGB();
    }

    // checker para comprobar si el pixel se encuentra dentro de las coordenadas dadas
    public boolean inRange(int x1, int y1, int x2, int y2){
        return (this.x >= x1) && (this.x <= x2) && (this.y >= y1) && (this.y <= y2);
    }

    // setters para las coordenadas x e y
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // conversor de rgb a hex que llama al conversor dentro del color y construye
    // un nuevo pixel con el hex obtenido
    public Pixel_198538736_GuajardoArias pixRGBToHex() {
        Color_198538736_GuajardoArias C = this.color.rgbToHex();
        return new Pixel_198538736_GuajardoArias(this.x, this.y, this.d, C);
    }

    // para intercambiar las coordenadsa del pixel y utilizarlo posteriormente al transponer
    // la lista
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


    // métodos para mover el pixel de acuerdo al ancho y largo
    // y así poder realizar los flips
    public void move_pix_h(int width) {
        int width1 = width-1-this.x;
        setX(width1);
    }

    public void move_pix_v(int height) {
        int height1 = height-1-this.y;
        setY(height1);
    }

    // printPix permite imprimir la información del pixel de manera ordenada
    public void printPix(){
        System.out.println("X: " + this.x + " " + "Y: " + this.y + " " + this.color.toString() + " " + "Depth: " + this.d + "\n");
    }



}
