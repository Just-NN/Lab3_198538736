package org.usach.TDA;

public interface InterImage_198538736_GuajardoArias {


    boolean isBitmap();

    boolean isHexmap();

    boolean isPixmap();

    boolean isCompressed();

    Image_198538736_GuajardoArias flipH();

    Image_198538736_GuajardoArias flipV();

    Image_198538736_GuajardoArias crop(int x1, int y1, int x2, int y2);

    Image_198538736_GuajardoArias imgRGBToHex();

    // histogram

    Image_198538736_GuajardoArias rotate90();

    void printImage();

    void histogram();

}
