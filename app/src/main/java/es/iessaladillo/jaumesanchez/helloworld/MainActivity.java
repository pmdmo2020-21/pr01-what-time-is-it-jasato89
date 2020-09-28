package es.iessaladillo.jaumesanchez.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date now = new Date();
        SimpleDateFormat h = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/YYYY");

        now.getTime();
        String hour = h.format(now);
        String day = d.format(now);
        String getToday = "Date:\n" + day +"\nHour:\n" + hour;


        TextView helloText = findViewById(R.id.helloText);
        helloText.setText(getToday);
    }




}