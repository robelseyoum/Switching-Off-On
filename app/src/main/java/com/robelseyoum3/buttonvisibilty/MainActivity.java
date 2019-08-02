package com.robelseyoum3.buttonvisibilty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch swtch_vsbl;
    Button btn_toasting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swtch_vsbl = findViewById(R.id.swt_btn);
        btn_toasting = findViewById(R.id.btn_toast);


        swtch_vsbl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    btn_toasting.setVisibility(View.GONE);
                }else{
                    btn_toasting.setVisibility(View.VISIBLE);

                }
            }
        });

        btn_toasting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "My visibilty is decided from Switch Button";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
