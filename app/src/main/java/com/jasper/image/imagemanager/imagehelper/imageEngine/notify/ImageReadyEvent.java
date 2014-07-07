package com.jasper.image.imagemanager.imagehelper.imageEngine.notify;

import android.graphics.drawable.BitmapDrawable;

/**
 * Created by jasperlai on 14-7-7.
 */
public class ImageReadyEvent {
    private  BitmapDrawable bd = null;

    public ImageReadyEvent(BitmapDrawable bitmapDrawable){

        bd = bitmapDrawable;

    }

    public BitmapDrawable getImage(){
        return bd;
    }
}
