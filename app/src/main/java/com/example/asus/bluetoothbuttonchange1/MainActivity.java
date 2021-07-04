package com.example.asus.bluetoothbuttonchange1;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    BluetoothAdapter ba;
    private boolean bluetooth=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=(ToggleButton)findViewById(R.id.toggleButton);
        ba=BluetoothAdapter.getDefaultAdapter();

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    ba.enable();
                    bluetooth=true;
                }
                else {
                    ba.disable();
                    bluetooth=false;
                }
            }
        });
    }
}
