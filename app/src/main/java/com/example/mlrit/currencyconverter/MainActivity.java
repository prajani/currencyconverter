package com.example.mlrit.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText t1;
    Spinner s1;
    String[] name={"INDIAN","DOLLAR","RUSSIAN"};
    Button b1;
    TextView tv;
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText)findViewById(R.id.editText2);
        s1=(Spinner)findViewById(R.id.spinner);
        b1=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,name);
        s1.setAdapter(aa);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                pos=position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t1.getText().toString();
                long val=Long.parseLong(s);
                if(pos==0)
                {
                    val=val*100;
                    tv.setText(""+val);
                    
                }
                else if(pos==1)
                {
                    val=val*50;
                    tv.setText(""+val);
                }
                else if(pos==2)
                {
                    val=val*45;
                    tv.setText(""+val);
                }
            }


        });
}


}
