package com.hfad.userinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    public void doSomething(View view)
    {
        EditText name=findViewById ( R.id.name );
        RadioGroup gender=findViewById ( R.id.ge );
        RadioGroup degree=findViewById ( R.id.rg );
        Spinner course=findViewById ( R.id.course );
        EditText address=findViewById ( R.id.address );

        String name_str=name.getText ().toString ();
        String gender_str=null;
        String degree_str=null;
        String course_str=null;
        String address_str=address.getText ().toString ();

        int gender_id=gender.getCheckedRadioButtonId ();

        switch (gender_id)
        {
            case R.id.male:

                gender_str="Male";
                break;

            case R.id.female:

                gender_str="Female";
                break;
        }

        int degree_id=degree.getCheckedRadioButtonId ();

        switch (degree_id)
        {
            case R.id.ug:

                degree_str="UG";
                break;

            case R.id.pg:

                degree_str="PG";
                break;
        }

        course_str=(String) course.getSelectedItem ();

        UserInfo userInfo=new UserInfo ( name_str,gender_str,degree_str,course_str,address_str );
        Intent intent=new Intent ( this,ShowUserInfo.class );
        ArrayList<String> list=userInfo.getList ();
        intent.putStringArrayListExtra ( "userinfo",list);
        startActivity ( intent );
    }

    public void addCourse(View view)
    {
        RadioGroup radioGroup=findViewById ( R.id.rg );
        Spinner spinner=findViewById ( R.id.course );
        int i=radioGroup.getCheckedRadioButtonId ();

        switch (i)
        {
            case R.id.ug:

                String str[]={"BCA","B.Tech","Bsc IT"};
                ArrayAdapter<String> arrayAdapter=new ArrayAdapter <String> (this,android.R.layout.simple_spinner_item,str  );
                spinner.setAdapter ( arrayAdapter );
                break;

            case R.id.pg:

                String str1[]={"MCA","M.Tech","Msc IT"};
                ArrayAdapter<String> arrayAdapter1=new ArrayAdapter <String> (this,android.R.layout.simple_spinner_item,str1  );
                spinner.setAdapter ( arrayAdapter1 );
                break;
        }
    }
}
