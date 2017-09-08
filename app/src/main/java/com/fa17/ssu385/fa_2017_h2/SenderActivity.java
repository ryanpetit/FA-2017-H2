package com.fa17.ssu385.fa_2017_h2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SenderActivity extends AppCompatActivity {
    private Button sendButton;
    private EditText senderTextEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        sendButton = (Button)findViewById(R.id.send_button);
        senderTextEntry = (EditText)findViewById(R.id.sender_text_entry);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processTextForNavigation();
            }
        });

    }

    private void processTextForNavigation() {
        if(senderTextEntry != null){
            String message = senderTextEntry.getText().toString();
            if(message.length() != 0){
                Intent messageIntent = new Intent(this, ReceiverActivity.class);
                messageIntent.putExtra("MESSAGE", message);
                startActivity(messageIntent);
            }
        }
    }
}
