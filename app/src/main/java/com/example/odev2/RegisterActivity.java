package com.example.odev2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Toolbar actionbarRegister;
    private EditText txtusername,txtsurname,txtemail,txtphone_number,txtpassword,txtagain_password;
    private Button btnRegister;
    private SQLiteTransactionListener auth;
    public void init() {
        actionbarRegister = (Toolbar) findViewById(R.id.action_barRegister);
        setSupportActionBar(actionbarRegister);
        getSupportActionBar().setTitle("Hesap Oluştur");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        txtusername = (EditText) findViewById(R.id.txtUsername);
        txtsurname = (EditText) findViewById(R.id.txtUsersurname);
        txtemail = (EditText) findViewById(R.id.txtEmail);
        txtphone_number = (EditText) findViewById(R.id.txtPhone);
        txtpassword = (EditText) findViewById(R.id.txtPassword);
        txtagain_password = (EditText) findViewById(R.id.txtPassword2);
        btnRegister =(Button) findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                createNewAccount();

            }
        });

    }

    private void createNewAccount() {

        String username = txtusername.getText().toString();
        String surname = txtsurname.getText().toString();
        String email = txtemail.getText().toString();
        String phone_number = txtphone_number.getText().toString();
        String password = txtpassword.getText().toString();
        String again_password = txtagain_password.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this,"Email Alanı Boş Olamaz !", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(password)){
            Toast.makeText(this,"Parola Alanı Boş Olamaz !", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(username)){
            Toast.makeText(this,"Kullanıcı Adı Alanı Boş Olamaz !", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(surname)){
            Toast.makeText(this,"Kullanıcı Soyadı Alanı Boş Olamaz !", Toast.LENGTH_LONG).show();
        }
        else {

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
init();

    }
}