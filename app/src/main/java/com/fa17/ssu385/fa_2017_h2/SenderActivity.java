package com.fa17.ssu385.fa_2017_h2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SenderActivity extends AppCompatActivity {
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        sendButton = (Button)findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processTextForNavigation();
            }
        });

    }

    private void processTextForNavigation() {

    }
}
