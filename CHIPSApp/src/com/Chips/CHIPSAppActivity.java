package com.Chips;

//import com.example.HelloFormStuff.HelloFormStuffActivity;
//import com.example.HelloFormStuff.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CHIPSAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // For the Shopping Lists button.
    final Button button = (Button) findViewById(R.id.shopping_lists);
        button.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {
            // Perform action on clicks
        	
        	Toast.makeText(CHIPSAppActivity.this, "Going to shopping lists...", Toast.LENGTH_SHORT).show();
        	
        	Intent intent = new Intent(CHIPSAppActivity.this, ShoppingLists.class);
        	startActivity(intent);
        }
        }); 
        // -----------------------
        
     // For the Calendar button.
        final Button button2 = (Button) findViewById(R.id.calendar);
            button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	
            	Toast.makeText(CHIPSAppActivity.this, "Going to calendar...", Toast.LENGTH_SHORT).show();
            	
            	Intent intent = new Intent(CHIPSAppActivity.this, Calendar.class);
            	startActivity(intent);
            }
            }); 
            // -----------------------
            
         // For the Inventory button.
            final Button button3 = (Button) findViewById(R.id.inventory);
                button3.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    // Perform action on clicks
                	
                	Toast.makeText(CHIPSAppActivity.this, "Going to inventory...", Toast.LENGTH_SHORT).show();
                	
                	Intent intent = new Intent(CHIPSAppActivity.this, Inventory.class);
                	startActivity(intent);
                }
                }); 
                // -----------------------
            
             // For the Preferences button.
                final Button button4 = (Button) findViewById(R.id.preferences);
                    button4.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on clicks
                    	
                    	Toast.makeText(CHIPSAppActivity.this, "Going to preferences...", Toast.LENGTH_SHORT).show();
                    	
                    	Intent intent = new Intent(CHIPSAppActivity.this, Preferences.class);
                    	startActivity(intent);
                    }
                    }); 
                    // -----------------------
                    
                 // For the Statistics button.
                    final Button button5 = (Button) findViewById(R.id.statistics);
                        button5.setOnClickListener(new OnClickListener() {
                        public void onClick(View v) {
                            // Perform action on clicks
                        	
                        	Toast.makeText(CHIPSAppActivity.this, "Going to statistics...", Toast.LENGTH_SHORT).show();
                        	
                        	Intent intent = new Intent(CHIPSAppActivity.this, Statistics.class);
                        	startActivity(intent);
                        }
                        }); 
                        // -----------------------
    }
}