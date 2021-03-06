package jpac.remaster.gtc;

import jpac.remaster.gtc.core.GTCActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

public class AboutUsPage extends GTCActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us);

		findViewById(R.id.backButton).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});

		WebView webView = (WebView) findViewById(R.id.aboutHTML);
		webView.loadUrl("file:///android_asset/data/about.html");
	}
}
