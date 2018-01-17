package c4q.com.drinks_app;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import c4q.com.drinks_app.controller.CocktailAdapter;
import c4q.com.drinks_app.model.Cocktail;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DrinksActivity extends AppCompatActivity {
    Cocktail cocktails;
    private static final String TAG = "HELP!!";
    ArrayList<Cocktail.Drink> drinksList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 5000);

        drinkAPI();



    }


    public void drinkAPI() {
        //http://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.thecocktaildb.com/api/json/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DrinkService drinkService = retrofit.create(DrinkService.class);

        final Call<Cocktail> cocktailCall = drinkService.getDrink("margarita");
        Log.d(TAG, "drinkAPI: " + cocktailCall.request());


        cocktailCall.enqueue(new Callback<Cocktail>() {
            @Override
            public void onResponse(Call<Cocktail> call, Response<Cocktail> response) {
                Log.d("response: ", response.body().toString());
                cocktails = response.body();
                ArrayList<Cocktail.Drink> drinksList = response.body().getDrinks();
                for (Cocktail.Drink s : drinksList){
                    Log.d(TAG, "onResponse: "+ s.getStrDrink());
                }

                initRecycler(drinksList);


            }
            @Override
            public void onFailure(Call<Cocktail> call, Throwable t) {
                Log.d(TAG, "Wheres My Drink?" + toString());
                t.printStackTrace();
            }
        });
    }

    public void initRecycler(ArrayList<Cocktail.Drink> drinksList){
        RecyclerView drinkRecycler = findViewById(R.id.drinks_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        drinkRecycler.setLayoutManager(layoutManager);
        CocktailAdapter cocktailAdapter = new CocktailAdapter(drinksList);
        drinkRecycler.setAdapter(cocktailAdapter);
    }

}
