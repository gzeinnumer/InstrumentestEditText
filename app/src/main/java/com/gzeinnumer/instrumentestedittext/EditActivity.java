package com.gzeinnumer.instrumentestedittext;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        initViews();
    }

    private void initViews() {
        etName = (EditText) findViewById(R.id.et_name);
        findViewById(R.id.btn_enter).setOnClickListener(new ClickHandler());
    }

    private void showWelcomeDialog(String message) {
        new AlertDialog.Builder(this)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok, null).create().show();
    }

    private class ClickHandler implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btn_enter) {
                String message = "Welcome " + etName.getText().toString();
                showWelcomeDialog(message);
            }
        }
    }
}