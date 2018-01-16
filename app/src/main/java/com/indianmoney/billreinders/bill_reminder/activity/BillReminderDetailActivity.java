package com.indianmoney.billreinders.bill_reminder.activity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.indianmoney.billreinders.R;

import java.util.Calendar;


public class BillReminderDetailActivity extends AppCompatActivity implements View.OnClickListener{

    private TextInputEditText selectDateEditText;
    private TextInputEditText amountEditText;
    private TextInputEditText informationEditText;
    private TextInputEditText addNoteEditText;

    private TextView monthlyText;
    private TextView biMonthlyText;
    private TextView quarterlyText;
    private TextView halfYearlyText;
    private TextView yearlyText;

    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onResume() {
        addNoteEditText.setFocusable(true);
        addNoteEditText.setFocusableInTouchMode(true);

        amountEditText.setFocusableInTouchMode(true);
        amountEditText.setFocusable(true);

        informationEditText.setFocusableInTouchMode(true);
        informationEditText.setFocusable(true);

        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_reminder_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // toolbar fancy stuff
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Bill Account");

        selectDateEditText = (TextInputEditText) findViewById(R.id.bill_reminder_due_date_edittext);
        amountEditText = (TextInputEditText) findViewById(R.id.bill_reminder_amount_edittext);
        informationEditText = (TextInputEditText) findViewById(R.id.bill_reminder_information_edittext);
        addNoteEditText = (TextInputEditText) findViewById(R.id.bill_reminder_note);


        amountEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        /*        amountEditText.setFocusableInTouchMode(true);
                amountEditText.setFocusable(true);
        */    }
        });

        informationEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    informationEditText.setFocusableInTouchMode(true);
                informationEditText.setFocusable(true);
            */}
        });

        addNoteEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*addNoteEditText.setFocusable(true);
                addNoteEditText.setFocusableInTouchMode(true);*/
            }
        });
    }


    public void selectDueDate(View view) {
        if (view == selectDateEditText) {

            // Get Current Date
            selectDateEditText.setFocusableInTouchMode(true);
            selectDateEditText.setFocusable(true);

        /*    amountEditText.setFocusableInTouchMode(true);
            amountEditText.setFocusable(true);

            informationEditText.setFocusable(true);
            informationEditText.setFocusableInTouchMode(true);
*/
//            selectDateEditText.requestFocus();


            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            //txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                            // Log.d("BillReminderDetail", dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            selectDateEditText.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
            /*CheckBox cb = new CheckBox(getApplicationContext());
            cb.setText("I'm dynamic!");
            ll.addView(cb);
*/
        }
    }

    @Override
    public void onClick(View view) {

    }
}