package net.x_sm.listapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int index = intent.getIntExtra("net.x_sm.ITEM_INDEX", -1);

        if (index > -1) {
            ImageView img = (ImageView)findViewById(R.id.imageView);
            img.setImageResource(getImage(index));
        }
    }

    private int getImage(int index){
        switch (index) {
            case 0: return R.drawable.peach;
            case 1: return R.drawable.tomato;
            case 2: return R.drawable.kabocha_squash;
            default: return -1;
        }
    }
}
