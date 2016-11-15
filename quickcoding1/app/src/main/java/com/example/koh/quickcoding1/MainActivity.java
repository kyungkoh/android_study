package com.example.koh.quickcoding1;

import android.widget.Button;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.Arrays;

import static com.example.koh.quickcoding1.Ge.arr;
import static com.example.koh.quickcoding1.Gen.arr;
import static com.example.koh.quickcoding1.Getre.arr;

abstract class Gen
{
    static int arr[] = {23,1,2315,15,161,723};
    public abstract String getResult();
}

class GetAve extends Gen
{
    @Override
    public String getResult() {
        int average = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        average = sum / arr.length;

        return ""+average;
    }
}

class GetMin extends Gen
{
    @Override
    public String getResult() {
        Arrays.sort(arr);
        int min = arr[0];
        return ""+min;
    }
}


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t01 = (TextView) findViewById(R.id.tx1);
        String str1 = "Current Value.....";

        TextView t02 = (TextView) findViewById(R.id.tx2);
        String str2 = Arrays.toString(arr);

        t01.setText(str1);
        t02.setText(str2);

        Button MyButton1 = (Button) findViewById(R.id.bt1);
        Button MyButton2 = (Button) findViewById(R.id.bt2);

        MyButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Gen gm1 = new GetMin();
                Toast.makeText(getApplicationContext(), "결과는 "+gm1.getResult(),
                        Toast.LENGTH_SHORT).show();
            }
        });


        MyButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Gen gv1 = new GetAve();
                Toast.makeText(getApplicationContext(), "결과는 "+gv1.getResult(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
