package com.kubyshkin.android.remindme;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toolbar;

/**
 * Created by Wladimir on 08.05.2017.
 */

public class MainActivity extends AppCompatActivity{
    private Toolbar toolbar;

    protected void onCreate(Bundle saveInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
    }


    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
       // toolbar.setNavigationIcon(R.drawable.search);
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.drawable.search);
        toolbar.setOverflowIcon(drawable);
        toolbar.inflateMenu(R.menu.menu);
    }


}
