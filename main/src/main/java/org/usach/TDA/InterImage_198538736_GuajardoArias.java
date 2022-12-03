package org.usach.TDA;


/**
 *  la interfaz Inter-Image establece qué métodos deben implementarse para
 *  la imagen, que serían los requisitos funcionales de
 *
 */
public interface InterImage_198538736_GuajardoArias {



    // Todos los métodos de acá están implementados en Image y se explica ahí mismo para qué sirven
    boolean isBitmap();

    boolean isHexmap();

    boolean isPixmap();

    Image_198538736_GuajardoArias flipH();

    Image_198538736_GuajardoArias flipV();

    Image_198538736_GuajardoArias crop(int x1, int y1, int x2, int y2);

    Image_198538736_GuajardoArias imgRGBToHex();

    // histogram

    Image_198538736_GuajardoArias rotate90();


    void histogram();

}
