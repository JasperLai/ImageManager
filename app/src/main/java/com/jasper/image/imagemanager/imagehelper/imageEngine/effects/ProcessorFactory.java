package com.jasper.image.imagemanager.imagehelper.imageEngine.effects;

/**
 * Created by jasperlai on 14-7-4.
 */
public class ProcessorFactory {

    public static int ProcessorTypeRoundCorner = 1;

    public static ImageProcessor create(int pType){
        if (pType == ProcessorTypeRoundCorner) {
            return new RoundCornerProcessor();
        } else {
            return null;
        }
    }
}
