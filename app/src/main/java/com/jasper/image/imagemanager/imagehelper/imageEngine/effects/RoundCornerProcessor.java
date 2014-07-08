package com.jasper.image.imagemanager.imagehelper.imageEngine.effects;

import android.graphics.Bitmap;

import com.jasper.image.imagemanager.imagehelper.utils.DrawableUtils;

/**
 * Created by jasperlai on 14-7-4.
 */
public class RoundCornerProcessor extends ImageProcessor{


    public RoundCornerProcessor(ImageProcessor processor){
        mProcessor = processor;
    }

    @Override
    public Bitmap process(Bitmap originalBitmap) {
        Bitmap finalBitmap = null;
        if(mProcessor != null){
            Bitmap middle = mProcessor.process(originalBitmap);
            finalBitmap =  DrawableUtils.roundCornered(middle, 6, 6);
            middle.recycle();

        }else{
            finalBitmap =  DrawableUtils.roundCornered(originalBitmap, 6, 6);
        }
        return finalBitmap;

    }

}
