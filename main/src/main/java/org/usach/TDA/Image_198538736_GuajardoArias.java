package org.usach.TDA;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Image_198538736_GuajardoArias implements InterImage_198538736_GuajardoArias {

    private int width;

    private int height;

    private List<Pixel_198538736_GuajardoArias> pixlist;

    private List<Pixel_198538736_GuajardoArias> compressedItems;

    private List<Par_198538736_GuajardoArias> histogramaDeRGBaHex;

    public Image_198538736_GuajardoArias(int width, int height, List<Pixel_198538736_GuajardoArias> pixlist) {
        this.width = width;
        this.height = height;
        this.pixlist = pixlist;
        this.compressedItems = new ArrayList<Pixel_198538736_GuajardoArias>();
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
    public boolean isCompressed() {
        if (width * height == this.pixlist.size()) {
            return true;
        }
        return false;
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
        Image_198538736_GuajardoArias newImage = new Image_198538736_GuajardoArias(this.width, this.height, this.pixlist);
        return newImage;
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
        Image_198538736_GuajardoArias newImage = new Image_198538736_GuajardoArias(this.width, this.height, this.pixlist);
        return newImage;
    }

    @Override
    public Image_198538736_GuajardoArias crop(int x1, int y1, int x2, int y2) {
        this.pixlist = this.pixlist.stream()
                .filter(pix -> pix.inRange(x1, y1, x2, y2))
                .collect(Collectors.toList());
        Image_198538736_GuajardoArias newImage = new Image_198538736_GuajardoArias(x2-x1+1, y2-y1+1, this.pixlist);
        return newImage;
    }

    @Override
    public void rotate90() {

    }

    @Override
    public void printImage() {
        System.out.println("Width: " + this.width + " " + "Height: " + this.height + "\n");
        for (Pixel_198538736_GuajardoArias i : this.pixlist) {
            i.printPix();
        }
    }

    public void imgRGBToHex() {
        List<Pixel_198538736_GuajardoArias> list = new ArrayList<>();
        countColor();
        for (Pixel_198538736_GuajardoArias pix : this.pixlist) {
            Pixel_198538736_GuajardoArias pixi = pix.pixRGBToHex();
            list.add(pixi);
            for (Par_198538736_GuajardoArias par : this.histogramaDeRGBaHex.toArray(new Par_198538736_GuajardoArias[0])){
                if(pix.getColor().toStringRGB() == par.getValue()){
                    par.setValue(pixi.getColor().getHex());
                }
            }
        }
        this.pixlist = list;


    }

    public void countBit() {
        List<Par_198538736_GuajardoArias> pares = new ArrayList<>();

        List<Integer> bits = new ArrayList<>();
        for (Pixel_198538736_GuajardoArias bit : this.pixlist) {
            if (!bits.contains(bit.getColor())) {
                bits.add(bit.getColor().getBit());
            }
        }

        for (Integer bit : bits) {
            var n = bits.stream()
                    .filter(bito -> equals(bit))
                    .count();

            Par_198538736_GuajardoArias par = new Par_198538736_GuajardoArias(bit.toString(), n);
            pares.add(par);

        }
        this.histogramaDeRGBaHex = pares;

    }

    public void countRGB() {
        List<Par_198538736_GuajardoArias> pares = new ArrayList<>();

        List<String> rgbs = new ArrayList<>();
        for (Pixel_198538736_GuajardoArias rgb : this.pixlist) {
            if (!rgbs.contains(rgb.getColor())) {
                rgbs.add(rgb.getColor().toStringRGB());
            }
        }

        for (String rgb : rgbs) {
            var n = rgbs.stream()
                    .filter(rgbo -> equals(rgb))
                    .count();

            Par_198538736_GuajardoArias par = new Par_198538736_GuajardoArias(rgb, n);
            pares.add(par);

        }
        this.histogramaDeRGBaHex = pares;

    }

    public void countHex() {
        List<Par_198538736_GuajardoArias> pares = new ArrayList<>();

        List<String> hexs = new ArrayList<>();
        for (Pixel_198538736_GuajardoArias hex : this.pixlist) {
            if (!hexs.contains(hex.getColor())) {
                hexs.add(hex.getColor().getHex());
            }
        }

        for (String hex: hexs) {
            var n = hexs.stream()
                    .filter(hexo -> equals(hex))
                    .count();

            Par_198538736_GuajardoArias par = new Par_198538736_GuajardoArias(hex, n);
            pares.add(par);

        }
        this.histogramaDeRGBaHex = pares;

    }


    public void countColor() {
        List<Par_198538736_GuajardoArias> pares = new ArrayList<>();

        List<Color_198538736_GuajardoArias> colores = new ArrayList<>();
        for (Pixel_198538736_GuajardoArias pix : this.pixlist) {
            if (!colores.contains(pix.getColor())) {
                colores.add(pix.getColor());
            }
        }
        colores = colores.stream()
                .distinct()
                .collect(Collectors.toList());

        for (Color_198538736_GuajardoArias coloro : colores) {
            var n = colores.stream()
                    .filter(colorox -> colorox.sameColor(coloro))
                    .count();
            Par_198538736_GuajardoArias par = new Par_198538736_GuajardoArias(coloro.toString(), n);
            if(!pares.contains(par)){
                pares.add(par);
            }
            pares = pares.stream()
                    .distinct()
                    .collect(Collectors.toList());


        }
        System.out.println("HAAAA");

        System.out.println(pares.get(0).toString());
        System.out.println("HAAAA");
        this.histogramaDeRGBaHex = pares;





    }

    public void histogram() {
        countColor();
        for (Par_198538736_GuajardoArias par : this.histogramaDeRGBaHex) {
            System.out.println(par.toString());
        }
    }


    public List<Pixel_198538736_GuajardoArias> getPixlist() {
        return pixlist;
    }
}
