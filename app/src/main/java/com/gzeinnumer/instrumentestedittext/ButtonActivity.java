package com.gzeinnumer.instrumentestedittext;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        initViews();
    }



    private void initViews() {
        findViewById(R.id.btn_toast).setOnClickListener(new ClickHandler());
        findViewById(R.id.btn_snackbar).setOnClickListener(new ClickHandler());
        findViewById(R.id.btn_dialog).setOnClickListener(new ClickHandler());
    }

    private void showToast() {
        Toast.makeText(this, R.string.app_name, Toast.LENGTH_SHORT).show();
    }

    private void showSnackBar() {
        Snackbar.make(findViewById(R.id.root_container), R.string.app_name, Snackbar.LENGTH_SHORT).show();
    }

    private void showDialog() {
        new AlertDialog.Builder(this)
                .setMessage(R.string.app_name)
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok, null).create().show();
    }

    private class ClickHandler implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_toast:
                    showToast();
                    break;
                case R.id.btn_snackbar:
                    showSnackBar();
                    break;
                case R.id.btn_dialog:
                    showDialog();
                    break;
            }
        }
    }
}