package com.reactnativestreaming

import android.graphics.Color
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class StreamingViewManager : SimpleViewManager<StreamingView>() {
  override fun getName() = "StreamingView"

  override fun createViewInstance(reactContext: ThemedReactContext): StreamingView {
    return StreamingView(reactContext)
  }

  @ReactProp(name = "color")
  fun setColor(view: StreamingView, color: String) {
    view.setBackgroundColor(Color.parseColor(color))
  }
}
