package divyansh.tech.twodscrollablezoomable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatImageView iv = findViewById(R.id.image);
        TwoDScrollableZoomableView view = findViewById(R.id.scrollable);
        Glide.with(this).load("https://wallpaperaccess.com/full/391249.jpg").into(iv);
    }
}