package com.example.goodo.suggest_sens;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>implements AdapterView.OnItemClickListener  {

    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    ArrayList<Item> arrayList;
    Context context;


    // data is passed into the constructor
    RecyclerAdapter(Context context, ArrayList<Item> arrayList) {
        this.mInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
        this.context = context;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View view = mInflater.inflate(R.layout.fragment_item_list, parent, false);
        //return new ViewHolder(view);
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        ViewHolder ViewHolder = new ViewHolder(view);
        return ViewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = arrayList.get(position);
        String imageName = item.getImageName();
        ImageView imageView = holder.myImageView;
        imageView.setImageResource(context.getResources().getIdentifier(imageName, "drawable", context.getPackageName()));
    }

    // total number of rows
    @Override
    public int getItemCount() {
        //return images.length;
        return arrayList.size();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;
        ImageView myImageView;

        ViewHolder(View itemView) {
            super(itemView);
            //myTextView = itemView.findViewById(R.id.recycler);
            myImageView = itemView.findViewById(R.id.album);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);

    }
}




