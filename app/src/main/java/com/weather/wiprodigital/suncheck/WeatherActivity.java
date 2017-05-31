package com.weather.wiprodigital.suncheck;

import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.weather.wiprodigital.suncheck.model.WeatherObj;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WeatherActivity extends AppCompatActivity implements WeatherView {

    @BindView(R.id.main_list_view)
    RecyclerView mRecyclerView;

    @BindView(R.id.main_list_empty_view)
    TextView mInfoTv;

    @BindView(R.id.main_list_progress_view)
    ContentLoadingProgressBar mProgress;

    private WeatherAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setTitle(R.string.title);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new WeatherAdapter(this);
        mRecyclerView.setAdapter(mAdapter);


    }

    @Override
    protected void  onResume() {
        super.onResume();
        WeatherPresenter presenter = new WeatherPresenter(this);
        presenter.getWeatherDetails();

    }


    @Override
    public void showProgress() {
        mProgress.show();
        mInfoTv.setVisibility(View.GONE);
    }

    @Override
    public void dismissProgress() {
        mProgress.hide();
        mInfoTv.setVisibility(View.VISIBLE);
    }

    @Override
    public void showDetails(WeatherObj aDetailObj) {
        mProgress.hide();
        mInfoTv.setVisibility(View.GONE);
        mAdapter.upDate(aDetailObj.list);
    }

    @Override
    public void showError(String aReason) {
        mProgress.hide();
        mInfoTv.setVisibility(View.VISIBLE);
        mInfoTv.setText(aReason);

    }
}
