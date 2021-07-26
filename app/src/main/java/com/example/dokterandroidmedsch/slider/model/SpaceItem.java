package com.example.dokterandroidmedsch.slider.model;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.dokterandroidmedsch.slider.DrawerAdapter;

public class SpaceItem extends DrawerItem<SpaceItem.ViewHolder>{
    private int spaceDp;

    public SpaceItem(int spaceDp){
        this.spaceDp = spaceDp;
    }

    @Override
    public ViewHolder createViewHolder(ViewGroup parent) {
        Context context = parent.getContext();
        View view = new View(context);
        int height =(int) (context.getResources().getDisplayMetrics().density*spaceDp);
        view.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                height
        ));
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(ViewHolder holder) {

    }

    @Override
    public boolean isSelectable() {
        return false;
    }

    public class ViewHolder extends DrawerAdapter.ViewHolder {
        public ViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}