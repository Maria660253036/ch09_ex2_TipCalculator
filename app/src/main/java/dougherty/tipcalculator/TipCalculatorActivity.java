package dougherty.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import dougherty.tipcalculator.R;

public class TipCalculatorActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     
        
        // set the view for the activity using XML
        setContentView(R.layout.activity_main_twopane_port);
    }
}