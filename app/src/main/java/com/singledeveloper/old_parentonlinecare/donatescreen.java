package com.singledeveloper.old_parentonlinecare;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class donatescreen extends AppCompatActivity implements PaymentResultListener {
    Button PayBtn;
    TextView PayStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donatescreen);

        Checkout.preload(getApplicationContext());

        PayBtn = findViewById(R.id.pay_btn);
        PayStatus = findViewById(R.id.pay_status);

        // onclick listener for paybtn to open new activity related to that
        PayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PaymentNow();
            }
        });
    }

    private void PaymentNow() {
        final Activity activity = this;
        final Checkout checkout = new Checkout();
        checkout.setKeyID("rzp_test_TDROswIMERmhhQ");
        checkout.setImage(R.drawable.rzp_name_logo);
        double finalAmount = Float.parseFloat("100") * 100;

        try {
            JSONObject options = new JSONObject();
            options.put("name", "Old-Age Foundation");
            options.put("description", "Donation");
            //You can omit the image option to fetch the image from dashboard
            options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.png");
            options.put("theme.color", "#3399cc");
            options.put("currency", "INR");
            options.put("amount", "10000");
            JSONObject preFill = new JSONObject();
            preFill.put("email", "impeterparker399@gmail.com");
            preFill.put("contact", "8003628804");
            checkout.open(activity, options);

        } catch (Exception e) {
            Toast.makeText(activity, "Error in payment: " + e.getMessage(), Toast.LENGTH_SHORT)
                    .show();
            e.printStackTrace();
        }
    }

    /**
     * @param s
     */
    @Override
    public void onPaymentSuccess(String s) {
        try {
            Toast.makeText(this, "Payment Success", Toast.LENGTH_LONG).show();
            PayStatus.setText(s);
            Toast.makeText(this, "❤Thanks for Donation❤", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param i
     * @param s
     */
    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this, "Paymant Failed", Toast.LENGTH_LONG).show();
        PayStatus.setText(s);
    }
}