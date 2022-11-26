package org.usach;

import org.usach.TDA.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        System.out.println("--- Antes del flipH ---");

        Color_198538736_GuajardoArias myColor1 = new Color_198538736_GuajardoArias(1, 244, 255);
        Color_198538736_GuajardoArias myColor2 = new Color_198538736_GuajardoArias(1, 244, 255);
        Color_198538736_GuajardoArias myColor3 = new Color_198538736_GuajardoArias(24, 26, 21);
        Color_198538736_GuajardoArias myColor4 = new Color_198538736_GuajardoArias(1, 1, 1);

        List<Pixel_198538736_GuajardoArias> pixList = new ArrayList<Pixel_198538736_GuajardoArias>();
        Pixel_198538736_GuajardoArias PA = new Pixel_198538736_GuajardoArias(0, 0, 1, myColor1);
        Pixel_198538736_GuajardoArias PB = new Pixel_198538736_GuajardoArias(1, 0, 1, myColor2);
        Pixel_198538736_GuajardoArias PC = new Pixel_198538736_GuajardoArias(0, 1, 1, myColor3);
        Pixel_198538736_GuajardoArias PD = new Pixel_198538736_GuajardoArias(1, 1, 1, myColor4);
        pixList.add(PA);
        pixList.add(PB);
        pixList.add(PC);
        pixList.add(PD);
        Image_198538736_GuajardoArias myImage = new Image_198538736_GuajardoArias(2, 2, pixList);
        myImage.printImage();

        if(myImage.isBitmap()){
            System.out.println("yea boi is bit");
        } else if (myImage.isHexmap()) {
            System.out.println("nope, it's a Hex list dude");
        }
        else {
            System.out.println("definitely nope, it's RGB");
        }

        System.out.println("--- Post flipH ---");
        myImage.flipH();
        myImage.printImage();

        System.out.println("--- crop ---");
        myImage.crop(0,0,1,0);
        myImage.printImage();

        myImage.printImage();

        List<Pixel_198538736_GuajardoArias> pixList2 = pixList;

        Image_198538736_GuajardoArias myImage2 = new Image_198538736_GuajardoArias(2, 2, pixList2);
        myImage2.imgRGBToHex();
        myImage2.printImage();

        System.out.println("Antes histograma");
        myImage.printImage();

        System.out.println("HISTOGRAMA");
        //myImage.histogram();
        myImage2.histogram();



        Color_198538736_GuajardoArias myColor5 = new Color_198538736_GuajardoArias("#01f4ff");
        Color_198538736_GuajardoArias myColor6 = new Color_198538736_GuajardoArias("#01f4ff");
        Color_198538736_GuajardoArias myColor7 = new Color_198538736_GuajardoArias("#01f4ff");
        Color_198538736_GuajardoArias myColor8 = new Color_198538736_GuajardoArias("#01f4ff");

        List<Pixel_198538736_GuajardoArias> pixList3 = new ArrayList<Pixel_198538736_GuajardoArias>();
        Pixel_198538736_GuajardoArias PE = new Pixel_198538736_GuajardoArias(0, 0, 1, myColor5);
        Pixel_198538736_GuajardoArias PF = new Pixel_198538736_GuajardoArias(1, 0, 1, myColor6);
        Pixel_198538736_GuajardoArias PG = new Pixel_198538736_GuajardoArias(0, 1, 1, myColor7);
        Pixel_198538736_GuajardoArias PH = new Pixel_198538736_GuajardoArias(1, 1, 1, myColor8);
        pixList3.add(PE);
        pixList3.add(PF);
        pixList3.add(PG);
        pixList3.add(PH);
        Image_198538736_GuajardoArias myImage3 = new Image_198538736_GuajardoArias(2, 2, pixList3);

        //myImage3.histogram();

    }


}