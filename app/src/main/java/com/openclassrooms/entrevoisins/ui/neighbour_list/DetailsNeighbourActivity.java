package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;

import java.io.Serializable;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsNeighbourActivity extends AppCompatActivity {

    @BindView(R.id.img_details_back)
    public ImageView imgDetailsBack;

    @BindView(R.id.img_details_avatar)
    public ImageView imgDetailsAvatar;
    @BindView(R.id.tv_details_name)
    public TextView tvDetailsName;

    @BindView(R.id.tv_details_name_card01)
    public TextView tvDetailsNameCard01;
    @BindView(R.id.tv_details_address)
    public TextView tvDetailsAddress;
    @BindView(R.id.tv_number_card01)
    public TextView tvPhoneNumber;
    @BindView(R.id.tv_details_mail)
    public TextView tvDetailsMail;

    @BindView(R.id.tv_details_aboutme)
    public TextView tvAboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_neighbour);
        ButterKnife.bind(this);
        SetNeighbour();

        imgDetailsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListNeighbourActivity.class);
                startActivity(intent);
            }
        });
    }


     private void SetNeighbour() {
         Neighbour neighbour = (Neighbour) getIntent().getExtras().getSerializable("neighbour");

         tvDetailsName.setText(neighbour.getName());
         tvDetailsNameCard01.setText(neighbour.getName());
         tvDetailsAddress.setText(neighbour.getAddress());
         tvPhoneNumber.setText(neighbour.getPhoneNumber());
         tvDetailsMail.setText("www.facebook.fr/" + neighbour.getName());
         tvAboutMe.setText(neighbour.getAboutMe());
         Glide.with(imgDetailsAvatar.getContext())
                 .load(neighbour.getAvatarUrl())
                 .into(imgDetailsAvatar);
    }
}