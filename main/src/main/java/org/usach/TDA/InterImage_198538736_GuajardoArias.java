package org.usach.TDA;

public interface InterImage_198538736_GuajardoArias {


    boolean isBitmap();

    boolean isHexmap();

    boolean isPixmap();

    boolean isCompressed();

    void flipH();

    void flipV();

    void crop(int x1, int y1, int x2, int y2);

    void imgRGBToHex();

    // histogram

    void rotate90();

    void printImage();



}
