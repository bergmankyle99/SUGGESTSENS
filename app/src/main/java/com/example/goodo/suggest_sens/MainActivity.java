package com.example.goodo.suggest_sens;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void DPISensClick(View view) {
        Intent intent = new Intent(this, DPIsensitivity.class);
        //  intent.putExtra(IDKEY, item.mId);
        // intent.putExtra(IMAGEKEY, item.getImage());
        //execute on intent
        startActivity(intent);
    }

    public void GametoGameClick(View view){
        Intent intent = new Intent(this, GameToGame.class);
        //  intent.putExtra(IDKEY, item.mId);
        // intent.putExtra(IMAGEKEY, item.getImage());
        //execute on intent
          startActivity(intent);
    }
}
