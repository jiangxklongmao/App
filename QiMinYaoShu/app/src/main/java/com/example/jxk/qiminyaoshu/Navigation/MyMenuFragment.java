package com.example.jxk.qiminyaoshu.Navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.jxk.qiminyaoshu.R;
import com.example.jxk.qiminyaoshu.View.FlowingDrawer.CircleTransformation;
import com.example.jxk.qiminyaoshu.View.FlowingDrawer.MenuFragment;
import com.squareup.picasso.Picasso;


public class MyMenuFragment extends MenuFragment {

    private ImageView ivMenuUserProfilePhoto;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container,false);
        NavigationView navigationView = (NavigationView) view.findViewById(R.id.vNavigation);
        ivMenuUserProfilePhoto = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.ivMenuUserProfilePhoto);
        setupHeader();
        return  setupReveal(view) ;
    }

    private void setupHeader() {
        int avatarSize = getResources().getDimensionPixelSize(R.dimen.global_menu_avatar_size);
        String profilePhoto = "http://img1.imgtn.bdimg.com/it/u=2106512167,698522532&fm=21&gp=0.jpg";
        Picasso.with(getActivity())
                .load(profilePhoto)
                .placeholder(R.drawable.img_circle_placeholder)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(new CircleTransformation())
                .into(ivMenuUserProfilePhoto);
    }

    public void onOpenMenu(){
        Toast.makeText(getActivity(),"onOpenMenu", Toast.LENGTH_SHORT).show();
    }
    public void onCloseMenu(){
        Toast.makeText(getActivity(),"onCloseMenu", Toast.LENGTH_SHORT).show();
    }
}
