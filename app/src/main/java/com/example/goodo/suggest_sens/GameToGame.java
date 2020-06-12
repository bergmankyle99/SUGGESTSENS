package com.example.goodo.suggest_sens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class GameToGame extends Activity implements RecyclerAdapter.ItemClickListener{
RecyclerView recyclerView;
RecyclerAdapter adapter;
ArrayList<Item> items = new ArrayList<>();
String item1 = "";
String item2 = "";
int selectioncount = 0;
    public static final String IMAGE1KEY= "IDKEY";
    public static final String IMAGE2KEY= "poobutt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gametogame_layout);
        recyclerView = findViewById(R.id.recycler);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        String json = loadJSONFromAsset();
        Log.v("potato", "read json file: " + json);
        try {

            JSONObject jsonRoot = new JSONObject(json);
            JSONArray jsonArray = jsonRoot.getJSONArray("games");
            for(int i = 0; i< jsonArray.length(); i++) {
                JSONObject jsonItem = jsonArray.getJSONObject(i);
                Log.v("potato", jsonItem.getString("name"));
                String image = jsonItem.getString("image");


                //int priority = sharedPreferences.getInt(id, 0);

                items.add(new Item(image));

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        adapter = new RecyclerAdapter(this, items);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("items.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public void onItemClick(View view, int position) {
        selectioncount++;
        Log.v("Orange", "click" + selectioncount);
        Item item = items.get(position);

        if(selectioncount == 1) {
            item1 = item.getImageName();
            Log.v("Orange", "Image1" + item1);
        }

        if(selectioncount == 2){
            item2 = item.getImageName();
            sendIntents();
            selectioncount =0;
        }
    }

    public void sendIntents(){
        Intent intent = new Intent(this, GameConvert.class);
        intent.putExtra(IMAGE2KEY, item2);
        intent.putExtra(IMAGE1KEY, item1);
        Log.v("Orange","Image2"+item2);
        startActivity(intent);
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
}
