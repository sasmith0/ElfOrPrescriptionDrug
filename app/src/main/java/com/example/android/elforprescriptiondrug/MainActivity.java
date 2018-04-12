package com.example.android.elforprescriptiondrug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Methods called when Submit Results button is pressed

    public void submitResults(View view) {

        //Check "Gandalf's Name" question

        EditText gandalfName = (EditText) findViewById(R.id.gandalf_name_blank);
        String olorin = gandalfName.getText().toString();

        // Check correct identification of elf versus drug names in radio buttons

        RadioButton isentress_drug = (RadioButton) findViewById(R.id.isentress_drug);
        boolean isentress_true = isentress_drug.isChecked();

        RadioButton anakinra_drug = (RadioButton) findViewById(R.id.anakinra_drug);
        boolean anakinra_true = anakinra_drug.isChecked();

        RadioButton celeborn_elf = (RadioButton) findViewById(R.id.celeborn_elf);
        boolean celeborn_true = celeborn_elf.isChecked();

        RadioButton erestor_elf = (RadioButton) findViewById(R.id.erestor_elf);
        boolean erestor_true = erestor_elf.isChecked();

        RadioButton mellaril_drug = (RadioButton) findViewById(R.id.mellaril_drug);
        boolean mellaril_true = mellaril_drug.isChecked();

        RadioButton finarfin_elf = (RadioButton) findViewById(R.id.finarfin_elf);
        boolean finarfin_true = isentress_drug.isChecked();

        // Check correct identification of elf versus drug names in radio buttons

        CheckBox gardasil_check = (CheckBox) findViewById(R.id.gardasil_drug);
        boolean gardasil_is_drug = gardasil_check.isChecked();

        CheckBox oropher_check = (CheckBox) findViewById(R.id.oropher_drug);
        boolean oropher_is_drug = oropher_check.isChecked();

        CheckBox imin_check = (CheckBox) findViewById(R.id.imin_drug);
        boolean imin_is_drug = imin_check.isChecked();

        CheckBox curufin_check = (CheckBox) findViewById(R.id.curufin_drug);
        boolean curufin_is_drug = curufin_check.isChecked();

        //Calculate the final score

        int score = calculateScore(olorin, isentress_true, anakinra_true, celeborn_true, erestor_true, mellaril_true, finarfin_true, gardasil_is_drug, oropher_is_drug, imin_is_drug, curufin_is_drug);

        String scoreMessage = "Your final score is: " + score + " out of 8.";

        Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
    }

    private int calculateScore(String olorin, boolean isentress_true, boolean anakinra_true, boolean celeborn_true, boolean erestor_true, boolean mellaril_true, boolean finarfin_true, boolean gardasil_is_drug, boolean oropher_is_drug, boolean imin_is_drug, boolean curufin_is_drug) {
        int totalScore = 0;


        if (olorin.equals("Olorin")) {
            totalScore += 1;
        }

        if (isentress_true) {
            totalScore += 1;
        }

        if (anakinra_true) {
            totalScore += 1;
        }

        if (celeborn_true) {
            totalScore += 1;
        }

        if (erestor_true) {
            totalScore += 1;
        }

        if (mellaril_true) {
            totalScore += 1;
        }

        if (finarfin_true) {
            totalScore += 1;
        }

        if (gardasil_is_drug) {
            totalScore += 1;
        }

        if (oropher_is_drug) {
            totalScore -= 1;
        }
        if (imin_is_drug) {
            totalScore -= 1;
        }
        if (curufin_is_drug) {
            totalScore -= 1;
        }
        return totalScore;
    }
}
