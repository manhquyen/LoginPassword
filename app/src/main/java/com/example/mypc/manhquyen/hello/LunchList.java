package com.example.mypc.manhquyen.hello;

/**
 * Created by MyPC on 06/02/2017.
 */
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.mypc.manhquyen.hello.R.id.save;

public class LunchList extends AppCompatActivity {
    Restaurant r = new Restaurant();
    int counter =3;
    //Button save = (Button) findViewById(R.id.save);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button save = (Button) findViewById(R.id.save);
       // TextView txt=(TextView) findViewById(R.id.)
        save.setOnClickListener(onSave);
    }

    private View.OnClickListener onSave = new View.OnClickListener() {
        public void onClick(View v) {
            Button save = (Button) findViewById(R.id.save);
            EditText name = (EditText) findViewById(R.id.name);
            EditText address = (EditText) findViewById(R.id.addr);
            EditText password = (EditText) findViewById(R.id.pass);
            r.setPassword(password.getText().toString());

            if(password.getText().toString().equals("android"))
            {
                Toast.makeText(LunchList.this,"mật khẩu đúng",Toast.LENGTH_LONG).show();
                r.setName(name.getText().toString());
                r.setAddress(address.getText().toString());

            }else
            {
                Toast.makeText(LunchList.this,"mật khẩu sai",Toast.LENGTH_LONG).show();
                counter--;
                if (counter==0)
                {
                    save.setEnabled(false);
                }
            }

            String str;
            str = "Tên: "+r.getName()+"  Địa chỉ:"+r.getAddress();
            Toast.makeText(LunchList.this,str, Toast.LENGTH_LONG).show();
            Log.d("mylog","Button save");
        }
    };






}