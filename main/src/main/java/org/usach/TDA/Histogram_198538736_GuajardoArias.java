package org.usach.TDA;

import java.util.List;

public class Histogram_198538736_GuajardoArias {

    List<Par_198538736_GuajardoArias> histogram;


    public Histogram_198538736_GuajardoArias(Image_198538736_GuajardoArias image) {
        var cantidad = image.pixlist.stream()
                .filter(pix -> pix.getColor().equals(image.pixlist(0)))
                .count();
    }


}
