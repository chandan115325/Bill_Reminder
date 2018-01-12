package com.indianmoney.billreinders.bill_reminder.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.indianmoney.billreinders.R;



public class BillReminderActivity extends AppCompatActivity {

    private FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_reminder);

        addButton = (FloatingActionButton) findViewById(R.id.fab_add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(BillReminderActivity.this, BillReminderListActivity.class);
                startActivity(intent);
            }
        });
    }
}
