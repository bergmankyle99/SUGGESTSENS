package com.example.goodo.suggest_sens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GameConvert extends Activity {
ImageView imageView;
ImageView imageView2;
String photo1;
String photo2;
EditText editText1;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_convert);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        editText1 = findViewById(R.id.game1Input);
        textView = findViewById(R.id.newSens);

        Intent intent = getIntent();
        photo1 = intent.getStringExtra(GameToGame.IMAGE1KEY);
        Log.v("Orange", "p1" + photo1);
        photo2 = intent.getStringExtra(GameToGame.IMAGE2KEY);
        Log.v("Orange", "p2" + photo2);
        imageView.setImageResource(getResources().getIdentifier(photo1, "drawable", getPackageName()));
        imageView2.setImageResource(getResources().getIdentifier(photo2, "drawable", getPackageName()));
    }

    public void GametoGameClick(View view){
        Intent intent = new Intent(this, GameToGame.class);
        //  intent.putExtra(IDKEY, item.mId);
        // intent.putExtra(IMAGEKEY, item.getImage());
        //execute on intent
        startActivity(intent);
    }

    public void DPISensClick(View view){
        Intent intent = new Intent(this, DPIsensitivity.class);
        //  intent.putExtra(IDKEY, item.mId);
        // intent.putExtra(IMAGEKEY, item.getImage());
        //execute on intent
        startActivity(intent);
    }
    public void Convert(View view) {
        if (photo1.equals("csgo")) {
            CSGOto();
        } else if (photo1.equals("overwatch")) {
            Overwatchto();
        } else if (photo1.equals("apex")) {
            Apexto();
        } else if (photo1.equals("b04")) {
            b04to();
        } else if (photo1.equals("bfv")) {
            bfvto();
        } else if (photo1.equals("d2")) {
            d2to();
        } else if (photo1.equals("fortnite")) {
            fortniteto();
        } else if (photo1.equals("rainbow6")) {
            rainbow6to();
        }
    }

    NumberFormat numberFormat = new DecimalFormat("######################.####");


    public void CSGOto() {
        if (photo2.equals("rainbow6")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.8396;
            textView.setText(numberFormat.format(newSens));

        }
        else if (photo2.equals("overwatch")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.3333;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("apex")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("bfv")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0046;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("b04")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.3303;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("d2")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.3331;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("fortnite")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0396;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("csgo")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }

    }
    public void Overwatchto() {
        if (photo2.equals("rainbow6")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1.1520;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("csgo")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.300 ;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("apex")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.300;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("bfv")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * -0.0021;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("b04")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.9991;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("d2")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("fortnite")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0119;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("overwatch")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }

    }
    public void Apexto() {
        if (photo2.equals("rainbow6")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.8397;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("csgo")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("fortnite")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0396;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("bfv")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0046;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("b04")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.3302;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("d2")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.3331;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("overwatch")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 3.3331;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("apex")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
    }
    public void b04to() {
        if (photo2.equals("rainbow6")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1.1530;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("csgo")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.3003;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("apex")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.3003;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("bfv")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * -0.0021;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("fortnite")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0119;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("d2")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1.0009;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("overwatch")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1.0009;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("b04")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
    }
    public void bfvto() {
        if (photo2.equals("rainbow6")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 402.0000;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("csgo")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 104.6950;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("apex")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 104.6950;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("fortnite")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 4.1464;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("b04")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 348.6558;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("d2")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 348.9610;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("overwatch")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 348.9601;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("bfv")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
    }
    public void d2to() {
        if (photo2.equals("rainbow6")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1.1520;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("csgo")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.3000;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("apex")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.3000;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("bfv")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * -0.0021;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("b04")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.9991;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("fortnite")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0119;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("overwatch")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("d2")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
    }
    public void fortniteto() {
        if (photo2.equals("rainbow6")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 96.9509;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("csgo")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 25.2494;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("apex")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 25.2494;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("bfv")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.2374;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("b04")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 84.0858;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("d2")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 84.1592;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("overwatch")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 84.1592;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("fortnite")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
    }
    public void rainbow6to() {
        if (photo2.equals("fortnite")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.0103;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("csgo")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.2604;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("apex")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.2604;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("bfv")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * -0.0025;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("b04")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.8673;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("d2")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.8681 ;
            textView.setText(numberFormat.format(newSens));
        }
        else if (photo2.equals("overwatch")) {
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 0.8681;
            textView.setText(numberFormat.format(newSens));
        }
        else if(photo2.equals("rainbow6")){
            double sens1 = Double.parseDouble(editText1.getText().toString());
            double newSens = sens1 * 1;
            textView.setText(numberFormat.format(newSens));
        }
    }
}
