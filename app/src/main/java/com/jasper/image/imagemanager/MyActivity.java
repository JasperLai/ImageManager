package com.jasper.image.imagemanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.jasper.image.imagemanager.imagehelper.imageEngine.ImageLoadHelper;
import com.jasper.image.imagemanager.imagehelper.imageEngine.effects.GreyProcessor;
import com.jasper.image.imagemanager.imagehelper.imageEngine.effects.RoundCornerProcessor;
import com.jasper.image.imagemanager.imagehelper.imageEngine.notify.BusProvider;
import com.jasper.image.imagemanager.imagehelper.imageEngine.notify.ImageReadyEvent;
import com.squareup.otto.Subscribe;


public class MyActivity extends Activity {

    String url = "http://a.hiphotos.baidu.com/space/wh%3D126%2C168/sign=ab2045568e5494ee877707181fc3cccf/6a600c338744ebf842b2a0d6dbf9d72a6159a71c.jpg";
    ImageView image = null;

    Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);
        image = (ImageView) findViewById(R.id.image);
        btn = (Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageLoadHelper.getInstance().
                        getImageFetcher().
                        loadImage(url, image, new RoundCornerProcessor(new GreyProcessor(null))
                               );
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.getInstance().register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.getInstance().unregister(this);
    }

    @Subscribe
    public void imageReady(ImageReadyEvent event) {
        Toast.makeText(this, "Image get", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
