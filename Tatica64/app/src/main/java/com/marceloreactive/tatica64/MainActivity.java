package com.marceloreactive.tatica64;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    WebView web = new WebView(this);
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true);
    s.setBuiltInZoomControls(false); s.setDisplayZoomControls(false);
    web.setWebViewClient(new WebViewClient()); web.setBackgroundColor(0xff111827);
    web.loadUrl("file:///android_asset/index.html"); setContentView(web);
  }
}
