package com.singledeveloper.old_parentonlinecare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class
DetailsUpload extends AppCompatActivity {


    String name, gender, address,age,phone,family_phone,health;

    EditText nameInput;
    EditText ageInput;
    EditText genderInput;
    EditText addressInput;
    EditText phoneInput;
    EditText sondaughterphoneInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_upload);

    }

    public void senddetails(View view) {
        // Get user's details
        nameInput = findViewById(R.id.nameInputxml);
        name = nameInput.getText().toString();

        // Get User's Age
        ageInput = findViewById(R.id.ageInputxml);
//        age = Integer.parseInt(ageInput.getText().toString());
        age = ageInput.getText().toString();

        // Get user Gender
        genderInput = findViewById(R.id.genderInputxml);
        gender = genderInput.getText().toString();

        // Get user Address
        addressInput = findViewById(R.id.AddressInputxml);
        address = addressInput.getText().toString();

        // Get User Phone number
        phoneInput = findViewById(R.id.phoneInputxml);
//        phone = Integer.parseInt(phoneInput.getText().toString());
        phone = phoneInput.getText().toString();

        // Get User care-taker/son/daughter number
        sondaughterphoneInput = findViewById(R.id.phonesondaughterInputxml);
//        family_phone = Integer.parseInt(nameInput.getText().toString());
        family_phone = sondaughterphoneInput.getText().toString();



//        // Get User health condition
//        healthInput = findViewById(R.id.healthInputxml);
////        family_phone = Integer.parseInt(nameInput.getText().toString());
//        health = healthInput.getText().toString();


        // Display the order summary on the screen
        String message = Summarydetails(name, age, gender, address, phone, family_phone);

        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+"AppXStudioinc@gmail.com")); // only email apps should handle this
//        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.summary_email_subject));
        intent.putExtra(Intent.EXTRA_TEXT, message);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private String Summarydetails(String name,String age,String gender, String address, String phone, String family_phone) {

        String FinalMessage = getString(R.string.name_of_person, name);
        FinalMessage += "\n" + getString(R.string.age_of_person, age);
        FinalMessage += "\n" + getString(R.string.gender_of_person, gender);
        FinalMessage += "\n" + getString(R.string.address_of_person, address);
        FinalMessage += "\n" + getString(R.string.phone_of_person, phone);
        FinalMessage += "\n" + getString(R.string.persons_caretaker_phone, family_phone);
//        FinalMessage += "\n" + getString(R.string.persons_health, health);
        FinalMessage += "\n" + getString(R.string.thank_you);

        return FinalMessage;
    }


}