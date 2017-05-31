package com.weather.wiprodigital.suncheck.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.weather.wiprodigital.suncheck.R;

/**
 * Created by binusadanand on 30/05/2017.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder{

    public TextView mDataTv;
    public TextView mDescriptionTv;
    public TextView mTempTv;
    public ImageView mIconIv;

    public TextView mItemKey1;
    public TextView mItemKey2;
    public TextView mItemKey3;
    public TextView mItemKey4;

    public TextView mItemVal1;
    public TextView mItemVal2;
    public TextView mItemVal3;
    public TextView mItemVal4;

    private View mParent;

    public WeatherViewHolder(View itemView) {
        super(itemView);

        mParent = itemView;
        mDataTv = (TextView) itemView.findViewById(R.id.item_date_tv);
        mDescriptionTv = (TextView) itemView.findViewById(R.id.item_main_text_tv);
        mTempTv = (TextView) itemView.findViewById(R.id.item_temp_tv);
        mIconIv = (ImageView) itemView.findViewById(R.id.item_main_icon_iv);

        mItemKey1 = findInLL(R.id.item_0_text_ll, R.id.item_key_tv);
        mItemKey2 = findInLL(R.id.item_1_text_ll, R.id.item_key_tv);
        mItemKey3 = findInLL(R.id.item_2_text_ll, R.id.item_key_tv);
        mItemKey4 = findInLL(R.id.item_3_text_ll, R.id.item_key_tv);

        mItemVal1 = findInLL(R.id.item_0_text_ll, R.id.item_value_tv);
        mItemVal2 = findInLL(R.id.item_1_text_ll, R.id.item_value_tv);
        mItemVal3 = findInLL(R.id.item_2_text_ll, R.id.item_value_tv);
        mItemVal4 = findInLL(R.id.item_3_text_ll, R.id.item_value_tv);

    }

    TextView findInLL(int aLlResId, int aTvResID) {
        TextView aTv = null;
        LinearLayout aLl = (LinearLayout) mParent.findViewById(aLlResId);
        if (aLl != null) {
            aTv =  (TextView) aLl.findViewById(aTvResID);
        }
        return aTv;
    }
}
