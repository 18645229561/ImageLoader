package com.example.renpeng.imageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;

    ImageLoader mImageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageLoader = ImageLoader.build(this);
        mImageView = (ImageView) findViewById(R.id.image);
        mImageLoader.bindBitmap("http://img.dwstatic.com/lol/1403/260207513856/1396252324312.jpg",mImageView,200,200);
    }
}
