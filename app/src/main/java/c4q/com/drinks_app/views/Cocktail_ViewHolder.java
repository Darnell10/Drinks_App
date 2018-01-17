package c4q.com.drinks_app.views;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import c4q.com.drinks_app.R;
import c4q.com.drinks_app.model.Cocktail;




/**
 * Created by bobbybah on 1/15/18.
 */

public class Cocktail_ViewHolder extends RecyclerView.ViewHolder {

    private final static String TAG = "SHOW RESULT!!";
    ImageView drinkImage;
    TextView drinkName;
    TextView glass;
    TextView ing_1;
    TextView ing_2;
    TextView ing_3;
    TextView ing_4;
    TextView ing_5;
    TextView ing_6;




    public Cocktail_ViewHolder(View itemView) {
        super(itemView);

        drinkImage = itemView.findViewById(R.id.drink_image);
        drinkName = itemView.findViewById(R.id.drink_name);
        glass = itemView.findViewById(R.id.drink_glass);
        ing_1 = itemView.findViewById(R.id.ingredient_one);
        ing_2 = itemView.findViewById(R.id.ingredient_two);
        ing_3 = itemView.findViewById(R.id.ingredient_three);
        ing_4 = itemView.findViewById(R.id.ingredient_four);
        ing_5 = itemView.findViewById(R.id.ingredient_five);
        ing_6 = itemView.findViewById(R.id.ingredient_six);
    }

    public void onBind(Cocktail.Drink cocktail) {

        String drinkTitle = cocktail.getStrDrink();
        String glassName = cocktail.getStrGlass();
        String ingrdOne = cocktail.getStrIngredient1();
        String ingrdTwo = cocktail.getStrIngredient2();
        String ingrdThree = cocktail.getStrIngredient3();
        String ingrdFour = cocktail.getStrIngredient4();
        String ingrdFive = cocktail.getStrIngredient5();
        String ingrdSix = cocktail.getStrIngredient6();

        drinkName.setText(drinkTitle);
        glass.setText(glassName);
        ing_1.setText(ingrdOne);
        ing_2.setText(ingrdTwo);
        ing_3.setText(ingrdThree);
        ing_4.setText(ingrdFour);
        ing_5.setText(ingrdFive);
        ing_6.setText(ingrdSix);

        String drinkImg_url = cocktail.getStrDrinkThumb();
        if(!drinkImg_url.isEmpty()){
            Glide.with(drinkImage.getContext())
                    .load(drinkImg_url)
                    .into(drinkImage);
        }

        Log.d(TAG, String.valueOf(drinkTitle));
    }


}
