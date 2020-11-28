package com.reactnativestreaming

import com.pedro.rtplibrary.rtmp.RtmpCamera1
import android.view.SurfaceView
import net.ossrs.rtmp.ConnectCheckerRtmp

class RtmpCamera(val surfaceView: SurfaceView, val connectChecker: ConnectCheckerRtmp) : RtmpCamera1(surfaceView, connectChecker) {
}

