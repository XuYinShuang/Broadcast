package com.zhiyuan3g.broadcast_receiver.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zhiyuan3g.broadcast_receiver.R;

public class MainActivity extends AppCompatActivity {
    Button btnBroad, btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBroad = (Button) findViewById(R.id.btnBroad);
        btnOrder = (Button) findViewById(R.id.btnOrder);
        btnBroad.setOnClickListener(btnBroadListener);
        btnOrder.setOnClickListener(btnOrderListener);
    }

    View.OnClickListener btnBroadListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //创建意图对象
            Intent intent = new Intent();
            //给意图中添加活动任务
            intent.setAction("android.intent.action.MyBroadcastReceiver");
            //意图中存放数据
            intent.putExtra("msg", "晚上去嗨皮！");
            //发送普通广播
            sendBroadcast(intent);
        }
    };
    View.OnClickListener btnOrderListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setAction("android.intent.action.MyBroadcastReceiver");
            intent.putExtra("msg","我是帅哥");
            sendBroadcast(intent,null);
        }
    };
}
