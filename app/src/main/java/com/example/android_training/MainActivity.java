package com.example.android_training;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_button)
    public void onButtonClicked() {
        Toast toast = Toast.makeText(this, R.string.dont_click_me, Toast.LENGTH_SHORT);
        toast.show();
    }
}
