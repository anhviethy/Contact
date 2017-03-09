package com.example.vietanh.contact_lv;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vietanh.contact_lv.Adapter.CustomAdapter;
import com.example.vietanh.contact_lv.model.PhoneNumber;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        ArrayList<PhoneNumber> arrPhone = new ArrayList<>();
         PhoneNumber contact1 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);
         PhoneNumber contact2 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);
         PhoneNumber contact3 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);
         PhoneNumber contact4 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);
         PhoneNumber contact5 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);
         PhoneNumber contact6 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);
         PhoneNumber contact7 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);
         PhoneNumber contact8 = new PhoneNumber("Viet Anh","01649688355", Color.GREEN);

        arrPhone.add(contact1);
        arrPhone.add(contact2);
        arrPhone.add(contact3);
        arrPhone.add(contact4);
        arrPhone.add(contact5);
        arrPhone.add(contact6);
        arrPhone.add(contact7);
        arrPhone.add(contact8);
        CustomAdapter adapter = new CustomAdapter(this,R.layout.row_contact,arrPhone);

        lv.setAdapter(adapter);
    }
}
