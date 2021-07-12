package com.pojo.dmiie.retrofit;


import com.pojo.dmiie.model.LedgerRequestDTO;
import com.pojo.dmiie.model.LedgerResponseDTO;
import com.pojo.dmiie.model.LoginRequestDTO;
import com.pojo.dmiie.model.LoginResponseDTO;
import com.pojo.dmiie.model.SearchResponseDTO;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

   /* @POST(AppConstant.DOMAIN+"/getuser")
    Call<UserResponseDTO> getLoginUserDetails(@Body LoginDTO loginDTO);
*/


    @POST("api/authentication/login")
    Call<LoginResponseDTO> doLoginAuthentication(@Body LoginRequestDTO loginRequestDTO);

    @Headers({"Content-Type:application/json"})
    @POST("api/report/ledger/details")
    Call<LedgerResponseDTO> getMyLedgerDetails(@Header("token") String token,@Body LedgerRequestDTO ledgerRequestDTO);


    Call<SearchResponseDTO> getSearchCompanyList();


}
