package tutorial.android.sgarts.unoscorer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import tutorial.android.sgarts.unoscorer.database.DatabaseManager;
import tutorial.android.sgarts.unoscorer.database.DroidModelException;
import tutorial.android.sgarts.unoscorer.model.User;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        DatabaseManager.init(getBaseContext());
        try {
            User u = new User();
            u.userId = "1";
            u.userName = "sankar";
            u.userWinCount = "4";
            u.userLoseCount = "10";
            u.userWinPerCent = "60.0";
            u.save();
            User u1 = new User();
            u1.userId = "2";
            u1.userName = "Saravana";
            u1.userWinCount = "3";
            u1.userLoseCount = "6";
            u1.userWinPerCent = "70.0";
            u1.save();
            User u2 = new User();
            u2.userId = "3";
            u2.userName = "Priya";
            u2.userWinCount = "9";
            u2.userLoseCount = "7";
            u2.userWinPerCent = "85.0";
            u2.save();
        } catch (DroidModelException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        new Handler().postDelayed(new Runnable() {

			/*
             * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);


    }

}
