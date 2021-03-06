package jpac.remaster.gtc;

import jpac.remaster.gtc.core.GTCActivity;
import jpac.remaster.gtc.util.ResourceUtil;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class GameFinishedPage extends GTCActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_finished_page);

		findViewById(R.id.continueButton).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						finish();
					}
				});

		ImageView tbc = (ImageView) findViewById(R.id.toBeContinued);
		tbc.setImageBitmap(ResourceUtil.loadImage(ResourceUtil.GAME_CONTINUE));

		ImageView mascot = (ImageView) findViewById(R.id.badge);
		mascot.setImageBitmap(ResourceUtil
				.loadImage(ResourceUtil.GAME_DONE_MASCOT));

		final ViewFlipper flipper = (ViewFlipper) findViewById(R.id.descFlipper);
		if (flipper.getChildCount() > 1) {
			flipper.setInAnimation(AnimationUtils.loadAnimation(this,
					R.anim.fade_in));
			flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
					R.anim.fade_out));
			flipper.setFlipInterval(5000);
			flipper.startFlipping();
		}
	}

	@Override
	public void onBackPressed() {
		finish();
	}
}
