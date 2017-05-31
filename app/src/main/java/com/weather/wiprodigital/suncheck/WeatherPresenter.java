package com.weather.wiprodigital.suncheck;

import com.weather.wiprodigital.suncheck.ApiService.Api;
import com.weather.wiprodigital.suncheck.ApiService.EndPointConstants;
import com.weather.wiprodigital.suncheck.ApiService.Provider;
import com.weather.wiprodigital.suncheck.model.WeatherObj;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by binusadanand on 30/05/2017.
 */

public class WeatherPresenter {

    private Api mApiService;
    private final WeatherView mView;
    private CompositeSubscription mSubscriptions;

    public WeatherPresenter(WeatherView aView) {
        mView = aView;
        mSubscriptions = new CompositeSubscription();
        mApiService = Provider.getApiService();

    }

    public void getWeatherDetails () {

        mView.showProgress();

        Subscription event = mApiService.items("london,uk", "json", EndPointConstants.APP_ID_VALUE)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<WeatherObj>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.dismissProgress();
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(WeatherObj aWeatherObj) {
                        mView.dismissProgress();
                        mView.showDetails(aWeatherObj);
                    }
                });


    }

    public void onStop() {
        mSubscriptions.unsubscribe();
    }
}
