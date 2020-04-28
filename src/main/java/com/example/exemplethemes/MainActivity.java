package com.example.exemplethemes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //résolution de ton téléphone
        //obtenir la taille d'un écran
        //utile pour faire quelque chose de flexible en fonction de la taille de chaque smartphone et tablette
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        TextView textView = findViewById(R.id.txtView);
        textView.setText("resolution width=" + width +" height" + height);

        Button btn =findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener()
            {
                   @Override
                   public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                   }
            }
        );
    }
}
