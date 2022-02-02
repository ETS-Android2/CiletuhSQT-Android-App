package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sqoutgeo.models.Feature;

public class DescriptionAct extends AppCompatActivity {

    Database db;
    ImageView ivimage;
    TextView tvname , tvdesc;
    Feature f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ivimage = findViewById(R.id.iv_image);
        tvname = findViewById(R.id.tv_name);
        tvdesc = findViewById(R.id.tv_desc);

        db = Database.getInstance();
        String itName = getIntent().getExtras().getString("feature_name");

        f = db.getFeature(itName);

        ivimage.setImageResource(f.getImage());
        tvname.setText(f.getName());
        tvdesc.setText(f.getDesc());
    }
}