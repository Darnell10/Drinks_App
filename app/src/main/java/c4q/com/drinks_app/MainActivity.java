package c4q.com.drinks_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;

import c4q.com.drinks_app.model.Cocktail;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Drinks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Change Retrofit locations (Maybe make a singleton retrofit class)
    }

    }

