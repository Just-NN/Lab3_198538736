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
        if(width*height == pixlist.size()-1){
            return true;
        }
        return false;
    }

    @Override
    public void flipH() {

    }

    @Override
    public void flipV() {

    }

    @Override
    public void crop() {

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
}
