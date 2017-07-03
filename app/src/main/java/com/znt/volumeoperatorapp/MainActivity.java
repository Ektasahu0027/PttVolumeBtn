package com.znt.volumeoperatorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean flag = false;

    boolean flag2 = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            Log.d("Test", "Long press!");
            Toast.makeText(getApplicationContext(), "Long KEYCODE_VOLUME_DOWN", Toast.LENGTH_LONG).show();
            flag = false;
            flag2 = true;
            return true;
        }
        if (keyCode == KeyEvent.KEYCODE_CAMERA){
            Toast.makeText(getApplicationContext(), "Long KEYCODE_CAMERA", Toast.LENGTH_LONG).show();
        }
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            Toast.makeText(getApplicationContext(), "KEYCODE_VOLUME_DOWN", Toast.LENGTH_LONG).show();
            event.startTracking();
            if (flag2 == true) {
                flag = false;
            } else {

                flag = true;
                flag2 = false;
            }
            return true;
        }
        if (keyCode == KeyEvent.KEYCODE_CAMERA){
            Toast.makeText(getApplicationContext(), "KEYCODE_CAMERA", Toast.LENGTH_LONG).show();
        }
        if(keyCode == KeyEvent.KEYCODE_HEADSETHOOK)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_HEADSETHOOK", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_ENDCALL)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_ENDCALL", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BACK", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_AVR_INPUT)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_AVR_INPUT", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_AVR_POWER)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_AVR_POWER", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BREAK)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BREAK", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BRIGHTNESS_DOWN)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BRIGHTNESS_DOWN", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BRIGHTNESS_UP)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BRIGHTNESS_UP", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BUTTON_THUMBL)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BUTTON_THUMBL", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BUTTON_THUMBR)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BUTTON_THUMBR", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BUTTON_START)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BUTTON_START", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_ENDCALL)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_ENDCALL", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BUTTON_L1)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BUTTON_L1", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BUTTON_L2)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BUTTON_L2", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BUTTON_R1)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BUTTON_R1", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_BUTTON_R2)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_BUTTON_R2", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_CALL)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_CALL", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_HOME)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_HOME", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_POWER)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_POWER", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_SOFT_RIGHT)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_SOFT_RIGHT", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_SOFT_LEFT)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_SOFT_LEFT", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_MENU)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_MENU", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_MEDIA_PREVIOUS)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_MEDIA_PREVIOUS", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_MEDIA_NEXT)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_MEDIA_NEXT", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_MEDIA_PLAY)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_MEDIA_PLAY", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_MEDIA_PAUSE)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_MEDIA_PAUSE", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_MEDIA_PLAY_PAUSE", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_MEDIA_STOP)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_MEDIA_STOP", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_POUND)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_POUND", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_SETTINGS)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_SETTINGS", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_SEARCH)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_SEARCH", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_SLEEP)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_SLEEP", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_STAR)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_STAR", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.	KEYCODE_TAB)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_TAB", Toast.LENGTH_SHORT).show();
        }
        if(keyCode == KeyEvent.KEYCODE_VOLUME_MUTE)
        {
            Toast.makeText(getApplicationContext(), "KEYCODE_VOLUME_MUTE", Toast.LENGTH_SHORT).show();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            Toast.makeText(getApplicationContext(), "KEYCODE_VOLUME_UP", Toast.LENGTH_LONG).show();
            event.startTracking();
            if (flag) {
                Log.d("Test", "Short");
            }
            flag = true;
            flag2 = false;
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}
