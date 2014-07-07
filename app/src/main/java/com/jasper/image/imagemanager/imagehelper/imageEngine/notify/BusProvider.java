package com.jasper.image.imagemanager.imagehelper.imageEngine.notify;

import com.squareup.otto.Bus;

/**
 * Created by jasperlai on 14-7-1.
 */
public class BusProvider {

    private static BusProvider mInstance;
    private Bus mBusModel;

    private BusProvider(){
        mBusModel = new Bus();
    }

    public static BusProvider getInstance(){
        if(mInstance == null){
            mInstance = new BusProvider();
        }
        return mInstance;
    }

    public void register(Object o){
        mBusModel.register(o);
    }

    public void unregister(Object o){
        mBusModel.unregister(o);
    }

    public void post(Object event){
        mBusModel.post(event);
    }

}
