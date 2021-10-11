package divyansh.tech.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import divyansh.tech.twodscrollablezoomablelibrary.TwoDScrollableZoomableView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatImageView iv = findViewById(R.id.imageView);
        Glide.with(this)
            .load("https://wallpaperaccess.com/full/391249.jpg")
            .into(iv);
    }
}