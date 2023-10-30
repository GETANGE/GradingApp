package manu.dev.gradingsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        EditText mathematicsEditText = findViewById(R.id.Mathematics);
        EditText englishEditText = findViewById(R.id.English);
        EditText kiswahiliEditText = findViewById(R.id.Kiswahili);
        EditText scienceEditText = findViewById(R.id.Science);
        EditText socialEditText = findViewById(R.id.Social);
        Button calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input from the EditText and calculate the grade.
                String mathScoreText = mathematicsEditText.getText().toString();
                String englishScoreText = englishEditText.getText().toString();
                String kiswahiliScoreText = kiswahiliEditText.getText().toString();
                String scienceScoreText = scienceEditText.getText().toString();
                String socialScoreText = socialEditText.getText().toString();

                // Find the TextView
                TextView mathGradeTextView = findViewById(R.id.MathGrade);
                TextView englishGradeTextView = findViewById(R.id.EnglishGrade);
                TextView kiswahiliGradeTextView = findViewById(R.id.KiswahiliGrade);
                TextView scienceGradeTextView = findViewById(R.id.ScienceGrade);
                TextView socialGradeTextView = findViewById(R.id.SocialGrade);
                if (!mathScoreText.isEmpty() && !englishScoreText.isEmpty() && !kiswahiliScoreText.isEmpty() && !scienceScoreText.isEmpty() && !socialScoreText.isEmpty()) {
                    try {
                        // Convert the input to a numeric value (e.g., a score).
                        double mathScore = Double.parseDouble(mathScoreText);
                        double englishScore = Double.parseDouble(englishScoreText);
                        double kiswahiliScore = Double.parseDouble(kiswahiliScoreText);
                        double scienceScore = Double.parseDouble(scienceScoreText);
                        double socialScore = Double.parseDouble(socialScoreText);

                        // Implement your grading logic here based on the score.
                        // You can set the result in a TextView or display it in any way you prefer.
                        String grade;
                        if (mathScore >= 80) {
                            grade = "A";
                        } else if (mathScore >= 70) {
                            grade = "B+";
                        } else if (mathScore >= 60){
                            grade = "B";
                        } else if (mathScore >= 50) {
                            grade = "B-";
                        } else if (mathScore >= 40) {
                            grade = "D+";
                        } else if (mathScore >= 30) {
                            grade = "D-";
                        } else {
                            grade = "E";
                        }

                        // Set the calculated grade as the text of the TextView
                        mathGradeTextView.setText(grade);

                        String grade2;
                        if (englishScore >= 80) {
                            grade2 = "A";
                        } else if (englishScore >= 70) {
                            grade2 = "B+";
                        } else if (englishScore >= 60){
                            grade2 = "B";
                        } else if (englishScore >= 50) {
                            grade2= "B-";
                        } else if (englishScore >= 40) {
                            grade2 = "D+";
                        } else if (englishScore >= 30) {
                            grade2 = "D-";
                        } else {
                            grade2 = "E";
                        }

                        englishGradeTextView.setText(grade2);

                        String grade3;
                        if (kiswahiliScore >= 80) {
                            grade3 = "A";
                        } else if (kiswahiliScore >= 70) {
                            grade3= "B+";
                        } else if (kiswahiliScore >= 60){
                            grade3 = "B";
                        } else if (kiswahiliScore >= 50) {
                            grade3= "B-";
                        } else if (kiswahiliScore >= 40) {
                            grade3 = "D+";
                        } else if (kiswahiliScore >= 30) {
                            grade3 = "D-";
                        } else {
                            grade3 = "E";
                        }

                        kiswahiliGradeTextView.setText(grade3);

                        String grade4;
                        if (scienceScore >= 80) {
                            grade4 = "A";
                        } else if (scienceScore  >= 70) {
                            grade4= "B+";
                        } else if (scienceScore >= 60){
                            grade4 = "B";
                        } else if (scienceScore  >= 50) {
                            grade4= "B-";
                        } else if (scienceScore  >= 40) {
                            grade4 = "D+";
                        } else if (scienceScore  >= 30) {
                            grade4 = "D-";
                        } else {
                            grade4 = "E";
                        }

                        scienceGradeTextView.setText(grade4);
                        String grade5;
                        if (socialScore >= 80) {
                            grade5 = "A";
                        } else if (socialScore >= 70) {
                            grade5 = "B+";
                        } else if (socialScore >= 60){
                            grade5 = "B";
                        } else if (socialScore  >= 50) {
                            grade5 = "B-";
                        } else if (socialScore >= 40) {
                            grade5 = "D+";
                        } else if (socialScore >= 30) {
                            grade5 = "D-";
                        } else {
                            grade5 = "E";
                        }

                        socialGradeTextView.setText(grade5);

                    } catch (NumberFormatException e) {
                        // Handle the case where the input is not a valid number.
                        showErrorToUser("Please enter valid marks");
                    }
                } else {
                    // Handle the case where the input is empty.
                    showErrorToUser("Please enter scores for both subjects.");
                }
            }
        });

    }
    private void showErrorToUser(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}