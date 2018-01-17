package c4q.com.drinks_app.model;

import java.util.ArrayList;

/**
 * Created by D on 1/12/18.
 */

public class Cocktail {

    private ArrayList<Cocktail.Drink> drinks = new ArrayList<>();

    public ArrayList<Cocktail.Drink> getDrinks() {
        return drinks;
    }

    public class Drink {

        private String strDrink;

        public String getStrDrink() {
            return this.strDrink;
        }
        private String strGlass;

        public String getStrGlass() {
            return this.strGlass;
        }

        private String strInstructions;

        public String getStrInstructions() {
            return this.strInstructions;
        }

        private String strDrinkThumb;

        public String getStrDrinkThumb() {
            return this.strDrinkThumb;
        }

        private String strIngredient1;

        public String getStrIngredient1() {
            return this.strIngredient1;
        }

        private String strIngredient2;

        public String getStrIngredient2() {
            return this.strIngredient2;
        }

        private String strIngredient3;

        public String getStrIngredient3() {
            return this.strIngredient3;
        }

        private String strIngredient4;

        public String getStrIngredient4() {
            return this.strIngredient4;
        }

        private String strIngredient5;

        public String getStrIngredient5() {
            return this.strIngredient5;
        }

        private String strIngredient6;

        public String getStrIngredient6() {
            return this.strIngredient6;
        }

        private String strMeasure1;

        public String getStrMeasure1() {
            return this.strMeasure1;
        }

        private String strMeasure2;

        public String getStrMeasure2() {
            return this.strMeasure2;
        }

        private String strMeasure3;

        public String getStrMeasure3() {
            return this.strMeasure3;
        }

        private String strMeasure4;

        public String getStrMeasure4() {
            return this.strMeasure4;
        }

        private String strMeasure5;

        public String getStrMeasure5() {
            return this.strMeasure5;
        }

        private String strMeasure6;

        public String getStrMeasure6() {
            return this.strMeasure6;
        }

    }
}