package com.example.asp.androidcomplete;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Rba_dkp7 on 7/19/2016.
 */
public class LoginActivity extends Activity {

    public static final String ROOT_URL = "http://192.168.3.244:9000/";

    EditText username,password;
    Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        username = (EditText)findViewById(R.id.login_username);
        password = (EditText)findViewById(R.id.login_password);
        login_btn = (Button)findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                loginCheck(username.getText().toString(),password.getText().toString());
                getUsers(username.getText().toString(),password.getText().toString());
            }
        });

    }

    private void getUsers(final String username, final String password){

        JsonObject obj = new JsonObject();
        obj.addProperty("name",username);
        obj.addProperty("pass",password);
        Log.d("details","obj = "+obj);

        //Creating a rest adapter
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(ROOT_URL).build();


        //Creating an object of our api interface
        adapter.create(LoginAPI.class).loginCheck(obj, new Callback<JsonObject>() {
            @Override
            public void success(JsonObject s, Response response) {
                if(s.get("status").getAsBoolean()==true){
                    Toast toast = Toast.makeText(getApplicationContext(),"Welcome User",Toast.LENGTH_SHORT);
                    toast.show();

                } else{
                    Toast toast = Toast.makeText(getApplicationContext(),"Invalid User",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("details","Error in Sending: "+error);
                Toast toast = Toast.makeText(getApplicationContext(),"Error connecting to the server "+error,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

//    private void loginCheck(String uname,String upass){
//        JSONObject obj1 = new JSONObject();
//        try {
//            obj1.put("name",uname);
//            obj1.put("pass",upass);
//            Log.d("details","obj = "+obj1);
//
//            RestAdapter adapter = new RestAdapter.Builder().setEndpoint(ROOT_URL).build();
//
//            adapter.create(LoginAPI.class).loginCheck(obj1,new Callback<JSONObject>(){
//
//                @Override
//                public void success(JSONObject jsonObject, Response response) {
//                    Log.d("details","Success");
//                }
//
//                @Override
//                public void failure(RetrofitError error) {
//                    Log.d("details","Error in Sending: "+error);
//                }
//            });
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
}
