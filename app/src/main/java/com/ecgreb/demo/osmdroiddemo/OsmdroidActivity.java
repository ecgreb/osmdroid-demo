package com.ecgreb.demo.osmdroiddemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.osmdroid.ResourceProxy;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.XYTileSource;
import org.osmdroid.util.ResourceProxyImpl;
import org.osmdroid.views.MapView;


public class OsmdroidActivity extends Activity {

    public static final OnlineTileSourceBase STAMEN_WATERCOLOR = new XYTileSource(
            "StamenWatercolor", ResourceProxy.string.unknown, 0, 17, 256, ".png",
            new String[] { "http://a.tile.stamen.com/watercolor/",
                    "http://b.tile.stamen.com/watercolor/",
                    "http://c.tile.stamen.com/watercolor/",
                    "http://d.tile.stamen.com/watercolor/"});

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osmdroid);

//        final MapView mapView = (MapView) findViewById(R.id.mapview);
//        mapView.setTileSource(STAMEN_WATERCOLOR);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_osmdroid, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
