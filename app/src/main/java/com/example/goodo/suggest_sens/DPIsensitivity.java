package com.example.goodo.suggest_sens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DPIsensitivity extends Activity {
    EditText sensInput;
    EditText dpiInput;
    EditText desDPI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dpisens_layout);
    }
    public void SENStoDPI(View view) {
        sensInput = findViewById(R.id.sensInput);
        double sens = Double.parseDouble(sensInput.getText().toString());
        dpiInput = findViewById(R.id.dpiInput);
        int dpiInp = Integer.parseInt(dpiInput.getText().toString());
        desDPI = findViewById(R.id.desDPI);
        int desiredDPI = Integer.parseInt(desDPI.getText().toString());
        NumberFormat numberFormat = new DecimalFormat("######################.####");

        double newSens = (dpiInp * sens);
        double newNewSenslolKappa = newSens / desiredDPI;
        TextView fillAny = findViewById(R.id.dpiAny);
        fillAny.setText(desiredDPI + "");
        TextView fill = findViewById(R.id.dpi200S);
        fill.setText(numberFormat.format(newNewSenslolKappa));

        double new400 = newSens / 400;
        TextView fill400 = findViewById(R.id.dpi400S);
        fill400.setText(numberFormat.format(new400 ));

        double new600 = newSens / 600;
        TextView fill600 = findViewById(R.id.dpi600S);
        fill600.setText(numberFormat.format(new600));

        double new800 = newSens / 800;
        TextView fill800 = findViewById(R.id.dpi800S);
        fill800.setText(numberFormat.format(new800));

        double new1000 = newSens / 1000;
        TextView fill1000 = findViewById(R.id.dpi1000S);
        fill1000.setText(numberFormat.format(new1000));

        double new1200 = newSens / 1200;
        TextView fill1200 = findViewById(R.id.dpi1200S);
        fill1200.setText(numberFormat.format(new1200 ));

    }
        public void GametoGameClick(View view) {
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
}
