package org.usach.TDA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Image_198538736_GuajardoArias implements InterImage_198538736_GuajardoArias {

    private int width;

    private int height;

    private List<Pixel_198538736_GuajardoArias> pixlist;

    public Image_198538736_GuajardoArias(int width, int height, List<Pixel_198538736_GuajardoArias> pixlist) {
        this.width = width;
        this.height = height;
        this.pixlist = pixlist;
    }

    // List of pixels


    @Override
    public boolean isBitmap() {
        for (Pixel_198538736_GuajardoArias i : this.pixlist) {
            if (!i.isBit()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isHexmap() {
        for (Pixel_198538736_GuajardoArias i : this.pixlist) {
            if (!i.isHex()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPixmap() {
        for (Pixel_198538736_GuajardoArias i : this.pixlist) {
            if (!i.isRGB()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Image_198538736_GuajardoArias flipH() {
        if(this.width > 0){
            for (Pixel_198538736_GuajardoArias i : this.pixlist) {
                i.move_pix_h(this.width);
            }
        }
        else{
            System.out.println("Error420 no se puede voltear por su ancho");
        }
        return new Image_198538736_GuajardoArias(this.width, this.height, this.pixlist);
    }

    @Override
    public Image_198538736_GuajardoArias flipV() {
        if(this.height > 0){
            for (Pixel_198538736_GuajardoArias i : this.pixlist) {
                i.move_pix_v(this.width);
            }
        }
        else{
            System.out.println("Error420 no se puede voltear por su largo");
        }
        return new Image_198538736_GuajardoArias(this.width, this.height, this.pixlist);
    }

    @Override
    public Image_198538736_GuajardoArias crop(int x1, int y1, int x2, int y2) {
        this.pixlist = this.pixlist.stream()
                .filter(pix -> pix.inRange(x1, y1, x2, y2))
                .collect(Collectors.toList());
        return new Image_198538736_GuajardoArias(x2-x1+1, y2-y1+1, this.pixlist);
    }


    @Override
    public void printImage() {
        System.out.println("Width: " + this.width + " " + "Height: " + this.height + "\n");
        for (Pixel_198538736_GuajardoArias i : this.pixlist) {
            i.printPix();
        }
    }

    public Image_198538736_GuajardoArias imgRGBToHex() {
        List<Pixel_198538736_GuajardoArias> list = new ArrayList<>();
        countColor();
        for (Pixel_198538736_GuajardoArias pix : this.pixlist) {
            Pixel_198538736_GuajardoArias pixi = pix.pixRGBToHex();
            list.add(pixi);
        }
        return new Image_198538736_GuajardoArias(this.width, this.height, list);


    }


    public List<Par_198538736_GuajardoArias> countColor() {
        List<Par_198538736_GuajardoArias> pares = new ArrayList<>();

        List<Color_198538736_GuajardoArias> colores = new ArrayList<>();
        for (Pixel_198538736_GuajardoArias pix : this.pixlist) {
            if (!colores.contains(pix.getColor())) {
                colores.add(pix.getColor());
            }
        }

        for (Color_198538736_GuajardoArias coloro : colores) {
            var n = colores.stream()
                    .filter(colorox -> colorox.sameColor(coloro))
                    .count();
            Par_198538736_GuajardoArias par = new Par_198538736_GuajardoArias(coloro.toString(), n);
                pares.add(par);
        }

        return pares;





    }

    public void histogram() {
        List<Par_198538736_GuajardoArias> histograma = countColor();
        for (Par_198538736_GuajardoArias par : histograma) {
            System.out.println(par.toString());
        }
    }


    public List<Pixel_198538736_GuajardoArias> traversePixlist(){
        List<Pixel_198538736_GuajardoArias> newPixlist = new ArrayList<>();
        for (Pixel_198538736_GuajardoArias i : this.pixlist){
            newPixlist.add(i.swapPositions());
        }
        return newPixlist;

    }

    @Override
    public Image_198538736_GuajardoArias rotate90(){
        List<Pixel_198538736_GuajardoArias> newPixlist = traversePixlist();
        Image_198538736_GuajardoArias newImage = new Image_198538736_GuajardoArias(this.height, this.width, newPixlist);
        System.out.println("Post traverse:");
        newImage.printImage();
        newImage = newImage.flipV();
        return newImage;
    }
}
