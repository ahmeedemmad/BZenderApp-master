package apps.sharabash.bzender.activities;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import apps.sharabash.bzender.R;

public class AboutUs extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Animatoo.animateInAndOut(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        AppCompatImageView mImgBack = findViewById(R.id.imageNavigationIcon);
        mImgBack.setOnClickListener(v -> {
            NavUtils.navigateUpFromSameTask(this);
            Animatoo.animateInAndOut(this);
        });
    }
}
