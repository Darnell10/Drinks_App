package c4q.com.drinks_app;

import android.nfc.Tag;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import c4q.com.drinks_app.controller.CocktailAdapter;
import c4q.com.drinks_app.model.Cocktail;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DrinksList extends AppCompatActivity {
    Cocktail cocktails;
    private static final String TAG = "HELP!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_list);

        drinkAPI();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initRecycler();
            }
        },2000);
    }


    public void drinkAPI() {
        //http://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.thecocktaildb.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DrinkService drinkService = retrofit.create(DrinkService.class);

        final Call<Cocktail> cocktailCall = drinkService.getDrink("s");


        cocktailCall.enqueue(new Callback<Cocktail>() {
            @Override
            public void onResponse(Call<Cocktail> call, Response<Cocktail> response) {
                Log.d("response: ", response.body().toString());

            }
            @Override
            public void onFailure(Call<Cocktail> call, Throwable t) {
                Log.d(TAG, "Wheres My Drink?" + toString());
                t.printStackTrace();
            }
        });
    }

    public void initRecycler(){
        RecyclerView drinkRecycler = findViewById(R.id.drinks_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        drinkRecycler.setLayoutManager(layoutManager);
        CocktailAdapter cocktailAdapter = new CocktailAdapter(cocktails.getDrinks());
        drinkRecycler.setAdapter(cocktailAdapter);
    }

}
