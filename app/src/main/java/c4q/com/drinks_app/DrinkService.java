package c4q.com.drinks_app;

import c4q.com.drinks_app.model.Cocktail;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by D on 1/12/18.
 */

public interface DrinkService {


    String API_KEY = "1";

    @GET("{api_key}/search.php")
    Call<Cocktail> getDrink(@Path("api_key") String api_key,@Query("s") String s);

}
