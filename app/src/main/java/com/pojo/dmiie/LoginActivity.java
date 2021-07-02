package com.pojo.dmiie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.pojo.dmiie.model.LoginRequestDTO;
import com.pojo.dmiie.model.LoginResponseDTO;
import com.pojo.dmiie.retrofit.ApiClient;
import com.pojo.dmiie.retrofit.ApiInterface;
import com.pojo.dmiie.util.AppConstant;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText editTxtUserName,editTxtpassowrd;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName=editTxtUserName.getText().toString();
                String password=editTxtpassowrd.getText().toString();

                doAuthentication(userName,password);


            }
        });

    }

    private void doAuthentication(String userName, String password) {

        ApiInterface apiInterface = ApiClient.getAPIClient().create(ApiInterface.class);

        final LoginRequestDTO loginRequestDTO=new LoginRequestDTO(userName,password, AppConstant.DEVICE);

        Call<LoginResponseDTO> call=apiInterface.doLoginAuthentication(loginRequestDTO);

        call.enqueue(new Callback<LoginResponseDTO>() {
            @Override
            public void onResponse(Call<LoginResponseDTO> call, Response<LoginResponseDTO> response) {

                System.out.println("Success");

                //LoginResponseDTO loginResponseDTO=response.body();

                System.out.println();

                /*(loginResponseDTO.isStatus())*/







            }

            @Override
            public void onFailure(Call<LoginResponseDTO> call, Throwable t) {

                System.out.println("Exception"+t.getMessage().toString());

            }
        });




    }

    private void initView() {

        editTxtUserName=(TextInputEditText)findViewById(R.id.login_user_name);
        editTxtpassowrd=(TextInputEditText)findViewById(R.id.login_password);
        btnLogin=(Button)findViewById(R.id.btnLogin);

    }
}