package com.kpw.simpleapp1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
	final TextView tv = new TextView(this);
	tv.setText("New Text: ");
	final EditText et = new EditText(this);
	et.setText(" ");
	Button b = new Button(this);
	b.setText("Enter");
	b.setOnClickListener(new View.OnClickListener(){
		public void onClick(View v){
		    tv.setText(tv.getText() + " " + et.getText());
		}
	    });
	LinearLayout ll = new LinearLayout(this);
	ll.setOrientation(LinearLayout.VERTICAL);
	ll.addView(tv);
	ll.addView(et);
	ll.addView(b);
	
	setContentView(ll);
    }
}
