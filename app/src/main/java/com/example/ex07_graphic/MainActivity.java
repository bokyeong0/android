package com.example.ex07_graphic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*git*/
    public void onClick(View v){
        Intent intent = null;

        switch (v.getId()){
            case R.id.button1 :
                intent = new Intent(this, ShapeActivity.class);
                break;
        }
        startActivity(intent);
    }
}
