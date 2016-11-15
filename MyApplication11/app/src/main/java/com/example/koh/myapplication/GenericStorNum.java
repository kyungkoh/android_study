package com.example.koh.myapplication;

/**
 * Created by KOH on 2016-11-15.
 */

import java.util.ArrayList;
        import java.util.ArrayList;


class Generic<T1, T2>{
    ArrayList<T1> String_list = new ArrayList<T1>();
    ArrayList<T2> Num_list = new ArrayList<T2>();


    void addListNumber(T2 number1){
        Num_list.add(number1);
    }

    void addListString(T1 string1){
        String_list.add(string1);
    }

    String ShowListString(){
        String temp_str = "";
        for(int i = 0; i <  String_list.size(); i++)
            temp_str +=  String_list.get(i);
        return temp_str;
    }
    String ShowListNumber(){
        String temp_str = "";
        for(int i = 0; i < Num_list.size(); i++)
            temp_str += Num_list.get(i) + "\t";
        return temp_str;
    }
    void deleteList(){
        Num_list.clear();
        String_list.clear();
    }
}
