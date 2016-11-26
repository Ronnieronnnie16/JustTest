package com.example.mohimron.justtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    public static int LOGLEVEL = 2;
    public static boolean VERBOSE = LOGLEVEL > 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
//        TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView cookiebefore= (ImageView) findViewById(R.id.android_cookie_image_view);
        cookiebefore.setImageResource(R.drawable.after_cookie);

//        TextView textviewItem1 =(TextView) findViewById(R.id.menu_item_1);
//        String menuItem1 = textviewItem1.getText().toString();
//       Log.i("MainActivity.java", menuItem1);
//        Log.v("MainActivity", menuItem1);
  //      Log.i("MainActivity.this", "test saja");
//        TODO: Find a reference to the TextView in the layout. Change the text.
//        TextView textview=(TextView) findViewById(R.id.status_text_view);
 //      textview.setText("I'm so FULL");
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textViewItem1 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 = textViewItem1.getText().toString();
        Log.v("MainActivity", menuItem1);

        // Find second menu item TextView and print the text to the logs
        TextView textViewItem2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = textViewItem2.getText().toString();
        Log.v("MainActivity", menuItem2);

        // Find third menu item TextView and print the text to the logs
        TextView textViewItem3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = textViewItem3.getText().toString();
        Log.v("MainActivity", menuItem3);
    }


}