package com.example.android.quizappmarvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox jessica_jones, luke_cage, iron_fist, daredevil, white_tiger, elektra, bullseye, vision, punisher;
    RadioButton red_skull, the_void, bolt, pepper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showscore(View view) {

        int score = 0;

        jessica_jones = (CheckBox) findViewById(R.id.jessica_jones);
        boolean checked = jessica_jones.isChecked();

        luke_cage = (CheckBox) findViewById(R.id.luke_cage);
        boolean checked2 = luke_cage.isChecked();

        iron_fist = (CheckBox) findViewById(R.id.iron_fist);
        boolean checked3 = iron_fist.isChecked();

        daredevil = (CheckBox) findViewById(R.id.daredevil);
        boolean checked4 = daredevil.isChecked();

        white_tiger = (CheckBox) findViewById(R.id.white_tiger);
        boolean checked5 = white_tiger.isChecked();

        elektra = (CheckBox) findViewById(R.id.elektra);
        boolean checked6 = elektra.isChecked();

        bullseye = (CheckBox) findViewById(R.id.bullseye);
        boolean checked7 = bullseye.isChecked();

        vision = (CheckBox) findViewById(R.id.vision);
        boolean checked8 = vision.isChecked();

        punisher = (CheckBox) findViewById(R.id.punisher);
        boolean checked9 = punisher.isChecked();

        red_skull = (RadioButton) findViewById(R.id.red_skull);
        boolean radio1 = red_skull.isChecked();

        the_void = (RadioButton) findViewById(R.id.the_void);
        boolean radio2 = the_void.isChecked();

        bolt = (RadioButton) findViewById(R.id.bolt);
        boolean radio3 = bolt.isChecked();

        pepper = (RadioButton) findViewById(R.id.pepper);
        boolean radio4 = pepper.isChecked();

        score = calculateScore(checked,checked2,checked3,checked4,checked5,checked6,checked7,checked8,checked9,radio1,radio2,radio3,radio4);

        TextView scoreTextView = (TextView) findViewById(R.id.showscore);
        scoreTextView.setText(" " + score + " out of 9");
    }

    private int calculateScore(boolean jessica_jones, boolean luke_cage, boolean iron_fist, boolean daredevil, boolean white_tiger, boolean elektra, boolean bullseye, boolean vision, boolean punisher, boolean red_skull, boolean the_void, boolean bolt, boolean pepper) {

        int result = 0;

        if (white_tiger) {
            result = 0;
        }

        if (elektra) {
            result = 0;
        }

        if (bullseye) {
            result = 0;
        }

        if (vision) {
            result = 0;
        }

        if (punisher) {
            result = 0;
        }

        if (jessica_jones) {
            result += 1;
        }
        if (luke_cage) {
            result +=1;
        }
        if (iron_fist) {
            result +=1;
        }
        if (daredevil) {
            result +=1;
        }
        if (red_skull) {
            result +=1;
        }
        if (the_void) {
            result +=1;
        }
        if (bolt) {
            result +=1;
        }
        if (pepper) {
            result +=1;
        }

        return result;

    }

}