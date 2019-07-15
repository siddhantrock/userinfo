package com.hfad.userinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowUserInfo extends AppCompatActivity
{
    private String name;
    private String gender;
    private String degree;
    private String course;
    private String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_show_user_info );

        Intent intent=getIntent ();
        ArrayList<String> arrayList=intent.getStringArrayListExtra ( "userinfo" );

        TextView name_tv=findViewById ( R.id.name);
        TextView gender_tv=findViewById ( R.id.gender );
        TextView degree_tv=findViewById ( R.id.degree );
        TextView course_tv=findViewById ( R.id.course );
        TextView address_tv=findViewById ( R.id.address );

        name=arrayList.get ( 0 );
        gender=arrayList.get ( 1 );
        degree=arrayList.get ( 2 );
        course=arrayList.get ( 3 );
        address=arrayList.get ( 4 );

        name_tv.setText ( name );
        gender_tv.setText ( gender );
        degree_tv.setText ( degree );
        course_tv.setText ( course );
        address_tv.setText ( address );

    }
}
