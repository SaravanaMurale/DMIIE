package com.pojo.dmiie.retrofit;


import com.pojo.dmiie.model.LoginRequestDTO;
import com.pojo.dmiie.model.LoginResponseDTO;
import com.pojo.dmiie.model.UserDetailsDTO;
import com.pojo.dmiie.util.AppConstant;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

   /* @POST(AppConstant.DOMAIN+"/getuser")
    Call<UserResponseDTO> getLoginUserDetails(@Body LoginDTO loginDTO);
*/


   @POST("api/authentication/login")
    Call<LoginResponseDTO> doLoginAuthentication(@Body LoginRequestDTO loginRequestDTO);


}
