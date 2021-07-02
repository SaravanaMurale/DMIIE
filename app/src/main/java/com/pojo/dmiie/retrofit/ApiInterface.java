package com.pojo.dmiie.retrofit;


import com.pojo.dmiie.model.LoginRequestDTO;
import com.pojo.dmiie.model.LoginResponseDTO;

import retrofit2.Call;
import retrofit2.http.Body;

public interface ApiInterface {

   /* @POST(AppConstant.DOMAIN+"/getuser")
    Call<UserResponseDTO> getLoginUserDetails(@Body LoginDTO loginDTO);
*/


    Call<LoginResponseDTO> doLoginAuthentication(@Body LoginRequestDTO loginRequestDTO);


}
