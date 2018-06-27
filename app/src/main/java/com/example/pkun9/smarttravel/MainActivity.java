package com.example.pkun9.smarttravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pkun9.smarttravel.Activity.DangNhapActivity;

public class MainActivity extends AppCompatActivity {

    Button btnDangNhap;
    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        anhxa();
        btnDangNhap.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUsername.getText().toString().trim().equals( " " ) &&
                        edtPassword.getText().toString().trim().equals( " " )) {
                    Toast.makeText( MainActivity.this, "Bạn nhập thiếu thông tin", Toast.LENGTH_SHORT ).show();
                } else if (edtUsername.getText().toString().trim().equals( "imic" ) &&
                        edtPassword.getText().toString().trim().equals( "123456" )) {
                    Intent intent = new Intent( MainActivity.this, DangNhapActivity.class );
                    startActivity( intent );
                    finish();
                }
            }
        } );
    }

    private void anhxa() {
        btnDangNhap = (Button) findViewById( R.id.btnDangnhap );
        edtPassword = (EditText) findViewById( R.id.edtUsername );
        edtUsername = (EditText) findViewById( R.id.edtPassword );
    }

    public void clickManHinh(View view) {
        if (view.getId() == R.id.tvDangki_activity) {
            Intent intent = new Intent( MainActivity.this, SignUpActivity.class );
            startActivity( intent );
        }
    }
}
