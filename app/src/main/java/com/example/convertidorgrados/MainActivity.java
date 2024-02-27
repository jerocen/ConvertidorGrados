package com.example.convertidorgrados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.convertidorgrados.models.Celsius;
import com.example.convertidorgrados.models.Fahrenheit;
import com.example.convertidorgrados.models.Kelvin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText gradCel1, gradCel2, gradFahr1, gradFahr2, gradKelv1, gradKelv2;

        TextView resultValueCelTofahr, resultCeltoFahr, resultCelToKelv, resultValueCelToKelv,
        resultFahrToCel, resultValueFahrToCel, resultFahrToKelv, resultValueFahrToKelv,
        resultKelvToCel, resultValueKelvToCel, resultKelvToFahr, resultValueKelvToFahr;

        gradCel1 = findViewById(R.id.gradCelcius1);
        resultValueCelTofahr = findViewById(R.id.valueCelToFahr);
        resultCeltoFahr = findViewById(R.id.resultCelToFahr);

        gradCel2 = findViewById(R.id.gradCelcius2);
        resultCelToKelv = findViewById(R.id.resultCelToKelv);
        resultValueCelToKelv = findViewById(R.id.valueCelToKelv);

        gradFahr1 = findViewById(R.id.gradFahrenheit1);
        resultFahrToCel = findViewById(R.id.resultFahrToCel);
        resultValueFahrToCel = findViewById(R.id.valueFahrToCel);

        gradFahr2 = findViewById(R.id.gradFahrenheit2);
        resultFahrToKelv = findViewById(R.id.resultFahrToKelv);
        resultValueFahrToKelv = findViewById(R.id.valueFahrToKelv);

        gradKelv1 = findViewById(R.id.gradKelvin1);
        resultKelvToCel = findViewById(R.id.resultKelvCel);
        resultValueKelvToCel = findViewById(R.id.valueKelvToCel);

        gradKelv2 = findViewById(R.id.gradKelvin2);
        resultKelvToFahr = findViewById(R.id.resultKelvFahr);
        resultValueKelvToFahr = findViewById(R.id.valueKelvToFahr);

        resultCeltoFahr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double celsiusValue = Double.parseDouble(gradCel1.getText().toString());

                Celsius celsius = new Celsius(celsiusValue);
                Fahrenheit fahrenheit = celsius.parse(celsius);

                resultValueCelTofahr.setText(String.format("%.2f %s", fahrenheit.getValor(), fahrenheit.getSimbolo()));
            }
        });

        resultCelToKelv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double celsiusValue = Double.parseDouble(gradCel2.getText().toString());
                Celsius celsius = new Celsius(celsiusValue);
                Kelvin kelvin = celsius.parse(celsius);
                resultValueCelToKelv.setText(String.format("%.2f %s", kelvin.getValor(), kelvin.getSimbolo()));
            }
        });

        resultFahrToCel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double fahrenheitValue = Double.parseDouble(gradFahr1.getText().toString());
                Fahrenheit fahrenheit = new Fahrenheit(fahrenheitValue);
                Celsius celsius = fahrenheit.parse(fahrenheit);
                resultValueFahrToCel.setText(String.format("%.2f %s", celsius.getValor(), celsius.getSimbolo()));
            }
        });

        resultFahrToKelv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double fahrenheitValue = Double.parseDouble(gradFahr2.getText().toString());
                Fahrenheit fahrenheit = new Fahrenheit(fahrenheitValue);
                Kelvin kelvin = fahrenheit.parse(fahrenheit);
                resultValueFahrToKelv.setText(String.format("%.2f %s", kelvin.getValor(), kelvin.getSimbolo()));
            }
        });

        resultKelvToCel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double kelvinValue = Double.parseDouble(gradKelv1.getText().toString());
                Kelvin kelvin = new Kelvin(kelvinValue);
                Celsius celsius = kelvin.parse(kelvin);
                resultValueKelvToCel.setText(String.format("%.2f %s", celsius.getValor(), celsius.getSimbolo()));
            }
        });

        resultKelvToFahr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double kelvinValue = Double.parseDouble(gradKelv2.getText().toString());
                Kelvin kelvin = new Kelvin(kelvinValue);
                Fahrenheit fahrenheit = kelvin.parse(kelvin);
                resultValueKelvToFahr.setText(String.format("%.2f %s", fahrenheit.getValor(), fahrenheit.getSimbolo()));
            }
        });


    }
}