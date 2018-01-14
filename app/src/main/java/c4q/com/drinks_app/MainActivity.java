package c4q.com.drinks_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;

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


        drinkAPI();

        //TODO Add recyclerView


    }

    public void drinkAPI() {
        //http://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.thecocktaildb.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DrinkService drinkService = retrofit.create(DrinkService.class);

        final Call<Cocktail> cocktailCall = drinkService.getDrink("s");

        //TODO add Picasso or Glide whatever.

        cocktailCall.enqueue(new Callback<Cocktail>() {
            @Override
            public void onResponse(Call<Cocktail> call, Response<Cocktail> response) {
                Log.d("response: ", response.body().toString());

            }

            @Override
            public void onFailure(Call<Cocktail> call, Throwable t) {
                Log.d(TAG, "Wheres My DrinK?" + toString());
                t.printStackTrace();
            }
        });


    }
    }

