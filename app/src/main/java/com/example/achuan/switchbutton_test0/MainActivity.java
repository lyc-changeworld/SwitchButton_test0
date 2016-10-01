package com.example.achuan.switchbutton_test0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.kyleduo.switchbutton.SwitchButton;

public class MainActivity extends AppCompatActivity {

    private SwitchButton mSwitchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwitchButton= (SwitchButton) findViewById(R.id.sb_md);
        //ע�����ѡ��ť��״̬�ı��¼�
        mSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mSwitchButton.setChecked(b);//���ð�ť��ѡ��״̬
            }
        });



    }
}
