package com.jasper.image.imagemanager.imagehelper.imageEngine.effects;

import android.graphics.Bitmap;

/**
 * Created by jasperlai on 14-7-4.
 */
public abstract class ImageProcessor {

    ImageProcessor mProcessor = null;

    public abstract Bitmap process(Bitmap originalBitmap);

}
