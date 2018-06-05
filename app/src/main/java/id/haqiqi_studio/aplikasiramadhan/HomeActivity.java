package id.haqiqi_studio.aplikasiramadhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button bagikan = (Button) findViewById(R.id.share);
        tentang = (TextView) findViewById(R.id.tentang);

        bagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareTo();
            }
        });


    }


    void shareTo() {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT, tentang.getText());
        i.setType("text/plain");
        startActivity(Intent.createChooser(i, "Bagikan Ke:"));
    }


}
