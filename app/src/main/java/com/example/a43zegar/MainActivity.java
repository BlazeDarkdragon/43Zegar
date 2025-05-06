package com.example.a43zegar;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    private TextClock zegar1;
    private TextClock zegar2;
    private TextClock zegar3;
    private TextClock zegar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        this.zegar1=this.findViewById(R.id.zegar1);
        this.zegar1.setFormat12Hour(null);
        zegar1.setTimeZone("Europe/Warsaw");

        this.zegar2=this.findViewById(R.id.zegar2);
        this.zegar2.setFormat12Hour(null);
        zegar2.setTimeZone("Europe/London");

        this.zegar3=this.findViewById(R.id.zegar3);
        this.zegar3.setFormat12Hour(null);
        zegar3.setTimeZone("America/Los_Angeles");

        this.zegar4=this.findViewById(R.id.zegar4);
        this.zegar4.setFormat12Hour(null);
        zegar4.setTimeZone("Asia/Japan");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}