package in.ac.gla.miniProject.Photographer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class LoadImage extends AppCompatActivity {
    private ImageView imag;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image);
        imag=findViewById(R.id.imageView2);
        btn = findViewById(R.id.button);

        Intent intent = getIntent();
        String tmp=intent.getStringExtra("imageurl");
        String flag = intent.getStringExtra("flag");

        if (flag.contentEquals("0")) {
            btn.setVisibility(View.GONE);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Picasso.get().load(tmp).into(imag);

    }
}
