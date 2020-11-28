package com.reactnativestreaming

import android.graphics.Color
import android.widget.FrameLayout
import com.facebook.react.uimanager.ThemedReactContext
import androidx.annotation.NonNull
import net.ossrs.rtmp.ConnectCheckerRtmp
import android.view.SurfaceView
import android.view.SurfaceHolder
import android.view.ViewGroup.LayoutParams.MATCH_PARENT

class StreamingView(val reactContext: ThemedReactContext) : FrameLayout(reactContext), ConnectCheckerRtmp, SurfaceHolder.Callback {
  private val rtmpCamera: RtmpCamera
  private val surfaceView: SurfaceView
  private val cameraId = 0;


  init {
    surfaceView = SurfaceView(reactContext);
    rtmpCamera = RtmpCamera(surfaceView, this)
    addView(surfaceView, MATCH_PARENT, MATCH_PARENT);
    surfaceView.getHolder().addCallback(this);
  }

  override fun onConnectionFailedRtmp(@NonNull p0: String) {
  }
  override fun onAuthSuccessRtmp() {
  }
  override fun onAuthErrorRtmp() {
  }
  override fun onDisconnectRtmp() {
  }
  override fun onConnectionSuccessRtmp() {
  }
  override fun onNewBitrateRtmp(p0: Long) {
  }
  override public fun surfaceCreated(surfaceHolder: SurfaceHolder) {
    rtmpCamera.startPreview()
    rtmpCamera.prepareAudio()
    rtmpCamera.prepareVideo()
    rtmpCamera.startStream("rtmp://localhost/live/test");
  }
  override public fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
  }
  override public fun surfaceDestroyed(surfaceHolder: SurfaceHolder) {
  }
}
