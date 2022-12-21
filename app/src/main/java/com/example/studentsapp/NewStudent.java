package com.example.studentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.studentsapp.model.Model;
import com.example.studentsapp.model.Student;

public class NewStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_student);

        EditText nameEt = findViewById(R.id.newstudent_name_et);
        EditText idEt = findViewById(R.id.newstudent_id_et);
        EditText phoneEt = findViewById(R.id.newstudent_phone_et);
        EditText addressEt = findViewById(R.id.newstudent_address_et);
        CheckBox checkBox = findViewById(R.id.newstudent_cb);
        Button saveBtn = findViewById(R.id.newstudent_save_btn);
        Button cancelBtn = findViewById(R.id.newstudent_cancel_btn);

        saveBtn.setOnClickListener(view -> {
            String name = nameEt.getText().toString();
            String id = idEt.getText().toString();
            String phone = phoneEt.getText().toString();
            String address = addressEt.getText().toString();
            Boolean cb = checkBox.isChecked();
            // ADD TO DATA
            Student st = new Student(name, id, phone, address,"avtar", cb);
            Model.instance().addStudent(st);
            finish();
        });

        cancelBtn.setOnClickListener(view -> finish());
    }
}