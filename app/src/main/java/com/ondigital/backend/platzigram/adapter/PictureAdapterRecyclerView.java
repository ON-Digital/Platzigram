package com.ondigital.backend.platzigram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ondigital.backend.platzigram.R;
import com.ondigital.backend.platzigram.model.Picture;

import java.util.ArrayList;


public class PictureAdapterRecyclerView extends RecyclerView.Adapter <PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;


    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);

        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likeCheckbox;
        private TextView likeNumberCard;


        public PictureViewHolder(View itemView) {
            super(itemView);

            pictureCard     = (ImageView) itemView.findViewById(R.id.pictureCard);
            usernameCard    = (TextView) itemView.findViewById(R.id.userNameCard);
            timeCard        = (TextView) itemView.findViewById(R.id.timeCard);
            likeNumberCard  = (TextView) itemView.findViewById(R.id.likeNumberCard);


        }
    }
}
