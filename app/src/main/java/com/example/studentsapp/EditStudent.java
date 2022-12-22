package com.example.studentsapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studentsapp.model.Model;
import com.example.studentsapp.model.Student;

public class EditStudent extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        int index = extras.getInt("index");
        Student student = Model.instance().getStudentAtIndex(index);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);

        EditText nameEt = findViewById(R.id.editstudent_name_et);
        nameEt.setText(student.getName());
        EditText idEt = findViewById(R.id.editstudent_id_et);
        idEt.setText(student.getId());
        EditText phoneEt = findViewById(R.id.editstudent_phone_et);
        phoneEt.setText(student.getPhone());
        EditText addressEt = findViewById(R.id.editstudent_address_et);
        addressEt.setText(student.getAddress());
        CheckBox checkBox = findViewById(R.id.editstudent_cb);
        checkBox.setChecked(student.getCb());
        Button saveBtn = findViewById(R.id.editstudent_save_btn);
        Button deleteBtn = findViewById(R.id.editstudent_delete_btn);
        Button cancelBtn = findViewById(R.id.editstudent_cancel_btn);

        saveBtn.setOnClickListener(view -> {
            String name = nameEt.getText().toString();
            String id = idEt.getText().toString();
            String phone = phoneEt.getText().toString();
            String address = addressEt.getText().toString();
            Boolean cb = checkBox.isChecked();
            // SET DATA
            Student st = new Student(name, id, phone, address,"avtar", cb);
            Model.instance().setStudentAtIndex(st, index);
            finish();
        });

        deleteBtn.setOnClickListener(view -> {
            Model.instance().deleteStudentAtIndex(index);
            finish();
        });
        cancelBtn.setOnClickListener(view -> finish());
    }
}
