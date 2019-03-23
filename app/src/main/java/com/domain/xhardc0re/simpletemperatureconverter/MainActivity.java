package com.domain.xhardc0re.simpletemperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View v) {
        RadioButton celsiusRadio = findViewById(R.id.celsiusRadio);
        RadioButton fahrenheitRadio = findViewById(R.id.fahrenheitRadio);

        TextView celsius = findViewById(R.id.celsiusInput);
        TextView fahrenheit = findViewById(R.id.fahrenheitInput);
        TextView emptyInput = findViewById(R.id.emptyInput);

        if (celsiusRadio.isChecked()) {
            emptyInput.setText("");
            if (!celsius.getText().toString().matches("")) {

                String degreesStr = celsius.getText().toString();
                float degrees = Float.parseFloat(degreesStr);

                fahrenheit.setText(String.valueOf(degrees * 33.8));
            }
            else {
                emptyInput.setText("The field to be converted, is empty !");
            }
        }

        else if (fahrenheitRadio.isChecked()) {
            emptyInput.setText("");
            if (fahrenheit.getText().toString().matches("")) {

                String degreesStr = fahrenheit.getText().toString();
                float degrees = Float.parseFloat(degreesStr);

                celsius.setText(String.valueOf(degrees * (-17.22)));
            }
            else {
                emptyInput.setText("The field to be converted, is empty !");
            }
        }

        else {
            emptyInput.setText("Choose what to convert first !");
        }
    }
}
