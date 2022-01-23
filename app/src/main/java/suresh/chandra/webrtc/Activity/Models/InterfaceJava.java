package suresh.chandra.webrtc.Activity.Models;

import android.webkit.JavascriptInterface;

import suresh.chandra.webrtc.Activity.CallActivity;

public class InterfaceJava {
    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity) {
        this.callActivity = callActivity;
    }

    @JavascriptInterface
    public void onPeerConnected(){
        callActivity.onPeerConnected();
    }
}
