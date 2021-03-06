package com.assessment.zolostays.di.component;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.assessment.zolostays.AppController;
import com.assessment.zolostays.di.PerActivity;
import com.assessment.zolostays.di.module.ActivityModule;
import com.assessment.zolostays.utils.PrefUtils;
import com.assessment.zolostays.viewmodel.LoginViewModel;
import com.assessment.zolostays.viewmodel.MainViewModel;
import com.assessment.zolostays.viewmodel.RegistrationViewModel;

import dagger.Component;

/**
 * Created by DELL on 23-07-2017.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(Activity activity);

    Context provideContext();

    PrefUtils getPrefUtils();

    AppController getAppController();

    MainViewModel getMainViewModel();

    RegistrationViewModel getRegistrationViewModel();

    LoginViewModel getLoginViewModel();
}
