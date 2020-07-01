package com.example.jiami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String key = "xuexi.iefeel.com";
        String key=AesUtil.generateKey();
//加密
        String encsome = AesUtil.encrypt(key, "123456" );
        Log.d("dd1","e="+encsome);
//解密
        String decsome = AesUtil.decrypt(key, encsome);
        Log.d("dd1","d="+decsome);
    }
}
