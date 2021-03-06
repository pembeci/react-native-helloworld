package com.yushulx.helloworld;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import ly.count.android.sdknative.CountlyNative;

public class MyModule extends ReactContextBaseJavaModule {

  public MyModule(ReactApplicationContext reactContext) {
    super(reactContext);
    CountlyNative.initNative(getReactApplicationContext());
  }

  @Override
  public String getName() {
    return "MyModule";
  }

  @ReactMethod
  public void alert(String message) {
    Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
  }
}
