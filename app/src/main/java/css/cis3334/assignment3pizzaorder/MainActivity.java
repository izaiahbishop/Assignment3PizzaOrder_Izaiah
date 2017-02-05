package css.cis3334.assignment3pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rbSmall, rbMedium, rbLarge;
    CheckBox cbCheese, cbDelivery;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbSmall = (RadioButton) findViewById(R.id.SmallRadioButton);
        rbMedium = (RadioButton) findViewById(R.id.MediumRadioButton);
        rbLarge = (RadioButton) findViewById(R.id.LargeRadioButton);
        cbCheese = (CheckBox) findViewById(R.id.ExtraCheeseCheckBox);
        cbDelivery = (CheckBox) findViewById(R.id.DeliveryCheckBox);
        tvTotal = (TextView) findViewById(R.id.TotalTextView);
    }

    public void CalculateTotal (View view) {
        Double totalBill = 0.00;
        if (rbSmall.isChecked()){
            totalBill += 7.00;
        }
        if (rbMedium.isChecked()){
            totalBill += 9.00;
        }
        if (rbLarge.isChecked()){
            totalBill += 13.00;
        }

        if (cbCheese.isChecked()){
            totalBill += 1.75;
        }
        if (cbDelivery.isChecked()){
            totalBill += 2.50;
        }

        tvTotal.setText(String.format("The total is $%.2f", totalBill));
    }
}
