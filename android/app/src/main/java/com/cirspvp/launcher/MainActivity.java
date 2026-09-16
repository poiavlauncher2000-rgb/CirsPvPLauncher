package com.cirspvp.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(8, 12, 9));

        TextView title = new TextView(this);
        title.setText("CirsPVP Launcher");
        title.setTextSize(30);
        title.setTextColor(Color.rgb(57, 230, 107));
        title.setGravity(Gravity.CENTER);

        TextView server = new TextView(this);
        server.setText("\nServer: cirstalpvp.mcsh.io\n");
        server.setTextSize(17);
        server.setTextColor(Color.WHITE);
        server.setGravity(Gravity.CENTER);

        Button play = new Button(this);
        play.setText("▶ OYNA");
        play.setTextSize(18);

        layout.addView(title);
        layout.addView(server);
        layout.addView(play);

        setContentView(layout);
    }
}
