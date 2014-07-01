package com.jasper.image.imagemanager.imagehelper.imageEngine;

import android.content.Context;

public class ImageLoadHelper {

	public static ImageLoadHelper mInstance;
	private static final String IMAGE_CACHE_DIR = "thumbs";
    
    public static final int BITMAP_PATTEN_DEFAULT = 0;
    public static final int BITMAP_PATTEN_ROUND_CORNER = 1; 
    
	// core fetcher
	private static ImageFetcher mFetcher;

	private ImageLoadHelper(Context context) {
		// using max value means we temporarily do not need sample down the
		// bitmap
		mFetcher = new ImageFetcher(context,
				Integer.MAX_VALUE);
		ImageCache.ImageCacheParams cacheParams = new ImageCache.ImageCacheParams(
				context, IMAGE_CACHE_DIR);
		mFetcher.addImageCache(cacheParams);
		//mFetcher.setLoadingImage(R.drawable.);

	}

	public static ImageLoadHelper getInstance(Context application_context) {
		if (mInstance == null) {
			mInstance = new ImageLoadHelper(application_context);
		}
		return mInstance;
	}
	
	public ImageFetcher getImageFetcher() {
		return mFetcher;
	}

}
