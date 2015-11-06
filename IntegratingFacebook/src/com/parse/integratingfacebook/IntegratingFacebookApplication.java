package com.parse.integratingfacebook;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class IntegratingFacebookApplication extends Application {

  static final String TAG = "MyApp";

  @Override
  public void onCreate() {
    super.onCreate();

      FacebookSdk.sdkInitialize(getApplicationContext());

      Parse.initialize(this,
              "vHjieX1nOgzeOy0hFcZVOecTMLSWBaubIkHW0a7X",
              "7W0EalICPRyz5ybOnCAm1nhUHYttZtkMv0vJKZ7U"
      );

      ParseFacebookUtils.initialize(this);
  }
}
