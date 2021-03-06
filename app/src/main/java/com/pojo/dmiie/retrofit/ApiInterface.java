package com.pojo.dmiie.retrofit;


import com.pojo.dmiie.model.AdminDashBoardCountDTO;
import com.pojo.dmiie.model.AdminDashBoardResponseDTO;
import com.pojo.dmiie.model.LedgerRequestDTO;
import com.pojo.dmiie.model.LedgerResponseDTO;
import com.pojo.dmiie.model.LedgerSearchDTO;
import com.pojo.dmiie.model.LoginRequestDTO;
import com.pojo.dmiie.model.LoginResponseDTO;
import com.pojo.dmiie.model.SearchResponseDTO;

import java.util.HashMap;
import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

   /* @POST(AppConstant.DOMAIN+"/getuser")
    Call<UserResponseDTO> getLoginUserDetails(@Body LoginDTO loginDTO);
*/

    @POST("api/authentication/login")
    Call<LoginResponseDTO> doLoginAuthentication(@Body LoginRequestDTO loginRequestDTO);


    //@Headers({"Content-Type:application/json"})
    @POST("api/masterlist/getledgerlist")
    Call<SearchResponseDTO> getSearchCompanyList(@Header("token") String token,@Body LedgerSearchDTO ledgerSearchDTO);

    @Headers({"Content-Type:application/json"})
    @POST("api/report/ledger/details")
    Call<LedgerResponseDTO> getMyLedgerDetails(@Header("token") String token,@Body LedgerRequestDTO ledgerRequestDTO);


    @Headers({"Content-Type:application/json"})
    @POST("api/followup/getSalemanList")
    Call<AdminDashBoardResponseDTO> getAllSalesPersonList(@Header("token") String token);

}
