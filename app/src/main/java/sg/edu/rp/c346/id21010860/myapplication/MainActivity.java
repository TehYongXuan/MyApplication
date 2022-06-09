package sg.edu.rp.c346.id21010860.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    TextView tv;
//    String[] fruits;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

////       String[] fruits;
//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";
//        tv = findViewById(R.id.tv);
//
//        String txt = "Fruits" +" \n";
//
//        txt += "====" + "\n";
//        for (int i = 0; i < fruits.length; i++) {
//
//            txt += fruits[i] + "\n";
//            tv.setText(txt);
//        }
//
//
//       }
//    }
        TextView tv;

        ArrayList<String> fruits;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        fruits.add(3,"durian");
        tv = findViewById(R.id.tv);

        String txt = "Fruits" +" \n";

        txt += "====" + "\n";
        for (int i = 0; i < fruits.size(); i++) {

            txt += fruits.get(i) + "\n";
        }
            tv.setText(txt);
    }
}
