package org.usach;

import org.usach.TDA.Pixel_198538736_GuajardoArias;
import org.usach.TDA.Abstract_Pixel_198538736_GuajardoArias;
import org.usach.TDA.InterImage_198538736_GuajardoArias;
import org.usach.TDA.Image_198538736_GuajardoArias;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        System.out.println("--- INHERITANCE ---");
        List<Pixel_198538736_GuajardoArias> pixList = new ArrayList<Pixel_198538736_GuajardoArias>();
        Pixel_198538736_GuajardoArias PA = new Pixel_198538736_GuajardoArias(0, 0, 1, 0);
        Pixel_198538736_GuajardoArias PB = new Pixel_198538736_GuajardoArias(0, 1, 1, 1);
        Pixel_198538736_GuajardoArias PC = new Pixel_198538736_GuajardoArias(1, 0, 1, 1);
        Pixel_198538736_GuajardoArias PD = new Pixel_198538736_GuajardoArias(1, 1, 1, 1);
        pixList.add(PA);
        pixList.add(PB);
        pixList.add(PC);
        pixList.add(PD);
        Image_198538736_GuajardoArias myImage = new Image_198538736_GuajardoArias(2, 2, pixList);


    }
}