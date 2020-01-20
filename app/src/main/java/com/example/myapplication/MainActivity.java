package com.example.myapplication;

import android.os.Bundle;
import java.text.NumberFormat;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**

 This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int numberOfCoffees = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**

     This method is called when the increment button is clicked.
     */
    public void increment(View view) {
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);

    }
    /**

     This method is called when the decrement button is clicked.
     */
    public void decrement(View view) {
        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);

    }
    /**

     This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(numberOfCoffees);
        displayPrice(numberOfCoffees*5);
    }
    /**

    /**
     This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
