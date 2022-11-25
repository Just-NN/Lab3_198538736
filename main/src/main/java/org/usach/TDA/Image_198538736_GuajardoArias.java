package org.usach.TDA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Image_198538736_GuajardoArias implements InterImage_198538736_GuajardoArias {

    int width;

    int height;

    List<Pixel_198538736_GuajardoArias> pixlist;

    List<Pixel_198538736_GuajardoArias> compressedItems;

    public Image_198538736_GuajardoArias(int width, int height, List<Pixel_198538736_GuajardoArias> pixlist) {
        this.width = width;
        this.height = height;
        this.pixlist = pixlist;
        this.compressedItems = new ArrayList<Pixel_198538736_GuajardoArias>();
    }

    List<Pixel_198538736_GuajardoArias> Pixlist;

    // List of pixels



    @Override
    public boolean isBitmap() {
        for(Pixel_198538736_GuajardoArias i : pixlist){
            if(!i.isBit()){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isHexmap() {
        for(Pixel_198538736_GuajardoArias i : pixlist){
            if(!i.isHex()){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPixmap() {
        for(Pixel_198538736_GuajardoArias i : pixlist){
           if(!i.isRGB()){
               return false;
           }
        }
        return true;
    }

    @Override
    public boolean isCompressed() {
        if(width*height == pixlist.size()){
            return true;
        }
        return false;
    }

    @Override
    public void flipH() {
        for(Pixel_198538736_GuajardoArias i : pixlist){
            i.move_pix_h(this.width);
        }
    }

    @Override
    public void flipV() {
        for (Pixel_198538736_GuajardoArias i: pixlist){
            i.move_pix_v(this.height);
        }
    }

    @Override
    public void crop(int x1, int y1, int x2, int y2) {
        this.pixlist = this.pixlist.stream()
                .filter(pix -> pix.inRange(x1, y1, x2, y2))
                .collect(Collectors.toList());
    }

    @Override
    public void rotate90() {

    }

    @Override
    public void printImage(){
        System.out.println("Width: " + this.width + " " + "Height: " + this.height + "\n");
        for(Pixel_198538736_GuajardoArias i : pixlist){
            i.printPix();
        }
    }

    public void imgRGBToHex(){
        for(Pixel_198538736_GuajardoArias i: this.pixlist){
            i.pixRGBToHex();
        }
    }


}
