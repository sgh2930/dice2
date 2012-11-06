package com.example.dice2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	ImageView img1, img2;
	Button btn;
	TextView txt;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        img1 = (ImageView)findViewById(R.id.imageView1);
        img2 = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button1);
        txt = (TextView)findViewById(R.id.textView4);
        
        btn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int ran1 = (int)Math.round(Math.random() * 5);
		int ran2 = (int)Math.round(Math.random() * 5);
		
		img1.setImageResource(R.drawable.dice21 + ran1);
		img2.setImageResource(R.drawable.dice21 + ran2);
		
		if(ran1 > ran2)
			txt.setText("컴퓨터가 이겼습니다.");
		else if(ran2 > ran1)
			txt.setText("당신이 이겼습니다.");
		else
			txt.setText("비겼습니다.");
	}
}
