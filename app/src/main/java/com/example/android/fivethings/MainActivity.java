package com.example.android.fivethings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstThing(View view) {
        goToUrl("http://personaltao.com/teachings/changing-world/freedom-of-action/");
    }
    public void vitruvianMan (View view) {
        goToUrl("https://en.wikipedia.org/wiki/Vitruvian_Man");
    }
    public void secondThing(View view) {
        goToUrl("http://personaltao.com/teachings/taoism/taoism-101/");
    }
    public void thirdThing(View view) {
        goToUrl("http://spiritualmastersguide.blogspot.com/2011/08/adi-shankaracharya-life-and-teachings.html");
    }
    public void fourthThing(View view) {
        goToUrl("http://www.philosophypages.com/hy/2s.htm");
    }

    public void fifthThing (View view) {
        goToUrl("http://www.san.beck.org/CONFUCIUS4-What.html");
    }
    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

