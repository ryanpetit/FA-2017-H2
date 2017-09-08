package com.fa17.ssu385.fa_2017_h2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    private TextView messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        messageText = (TextView)findViewById(R.id.message_text);
        String retrievedMessage = null;
        if (getIntent().hasExtra("MESSAGE")) {
            retrievedMessage = getIntent().getStringExtra("MESSAGE");
            messageText.setText(retrievedMessage);
        }
    }
}
