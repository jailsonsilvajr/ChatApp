package com.chatapp.jailson.chatapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ChatFragmentPageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ChatFragmentPageAdapter(Context context, FragmentManager fm){

        super(fm);
        this.mContext = context;
    }

    public Fragment getItem(int position){

        if (position == 0){

            return new ChatFragment();
        }else if(position == 1){

            return new FriendsFragment();
        }else{

            return new GroupsFragment();
        }
    }

    public int getCount(){

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0: return mContext.getString(R.string.chat);
            case 1: return mContext.getString(R.string.friends);
            case 2: return mContext.getString(R.string.groups);
            default: return null;
        }
    }
}
