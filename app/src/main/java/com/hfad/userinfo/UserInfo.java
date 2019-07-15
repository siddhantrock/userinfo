package com.hfad.userinfo;

import java.util.ArrayList;
import java.util.List;

public class UserInfo
{
    private String name;
    private String gender;
    private String degree;
    private String course;
    private String address;

    public UserInfo(String name, String gender, String degree, String course, String address)
    {
        this.name = name;
        this.gender = gender;
        this.degree = degree;
        this.course = course;
        this.address = address;
    }

   public ArrayList<String> getList()
   {
       ArrayList<String> arrayList=new ArrayList <String> (  );
       arrayList.add ( name );
       arrayList.add ( gender );
       arrayList.add ( degree );
       arrayList.add ( course );
       arrayList.add ( address );

       return arrayList;
   }
}
