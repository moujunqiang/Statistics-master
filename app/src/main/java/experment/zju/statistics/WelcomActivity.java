package experment.zju.statistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                boolean login = getSharedPreferences("login", MODE_PRIVATE).getBoolean("login", false);
                if (login) {
                    startActivity(new Intent(WelcomActivity.this, AppStatisticsList.class));
                } else {
                    startActivity(new Intent(WelcomActivity.this, LoginActivity.class));

                }
                finish();
            }
        }, 2000);
    }
}