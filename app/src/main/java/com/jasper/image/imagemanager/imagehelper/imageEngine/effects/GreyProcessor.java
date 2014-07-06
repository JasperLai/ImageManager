package com.jasper.image.imagemanager.imagehelper.imageEngine.effects;

import android.graphics.Bitmap;

import com.jasper.image.imagemanager.imagehelper.utils.DrawableUtils;

/**
 * Created by jasperlai on 14-7-7.
 */
public class GreyProcessor implements ImageProcessor{
    @Override
    public Bitmap process(Bitmap originalBitmap) {
        return DrawableUtils.convertGreyImg(originalBitmap);
    }
}
