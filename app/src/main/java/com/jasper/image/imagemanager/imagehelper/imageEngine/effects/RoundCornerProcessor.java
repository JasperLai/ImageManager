package com.jasper.image.imagemanager.imagehelper.imageEngine.effects;

import android.graphics.Bitmap;

import com.jasper.image.imagemanager.imagehelper.utils.DrawableUtils;

/**
 * Created by jasperlai on 14-7-4.
 */
public class RoundCornerProcessor implements ImageProcessor{

    @Override
    public Bitmap process(Bitmap originalBitmap) {
        return DrawableUtils.roundCornered(originalBitmap, 6, 6);
    }

}
