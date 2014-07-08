package com.jasper.image.imagemanager.imagehelper.imageEngine;

import android.content.Context;

import com.jasper.image.imagemanager.MyApplication;

public class ImageLoadHelper {

	public static ImageLoadHelper mInstance;
	private static final String IMAGE_CACHE_DIR = "thumbs";
    
	// core fetcher
	private static ImageFetcher mFetcher;
    private static Context mContext = MyApplication.instance().getContext();

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

	public static ImageLoadHelper getInstance() {
		if (mInstance == null) {
			mInstance = new ImageLoadHelper(mContext);
		}
		return mInstance;
	}
	
	public ImageFetcher getImageFetcher() {
		return mFetcher;
	}

}
