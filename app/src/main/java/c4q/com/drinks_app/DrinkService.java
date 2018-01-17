package c4q.com.drinks_app;

import c4q.com.drinks_app.model.Cocktail;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by D on 1/12/18.
 */

public interface DrinkService {


    String API_KEY = "1";

    @GET("1/search.php")
    Call<Cocktail> getDrink(@Query("s") String s);

}
