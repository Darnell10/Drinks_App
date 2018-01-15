package c4q.com.drinks_app;

import java.util.ArrayList;

/**
 * Created by D on 1/12/18.
 */

public class Cocktail {

    public class Drink {
        private String idDrink;

        public String getIdDrink() {
            return this.idDrink;
        }

        public void setIdDrink(String idDrink) {
            this.idDrink = idDrink;
        }

        private String strDrink;

        public String getStrDrink() {
            return this.strDrink;
        }

        public void setStrDrink(String strDrink) {
            this.strDrink = strDrink;
        }

        private String strCategory;

        public String getStrCategory() {
            return this.strCategory;
        }

        public void setStrCategory(String strCategory) {
            this.strCategory = strCategory;
        }

        private String strIBA;

        public String getStrIBA() {
            return this.strIBA;
        }

        public void setStrIBA(String strIBA) {
            this.strIBA = strIBA;
        }

        private String strAlcoholic;

        public String getStrAlcoholic() {
            return this.strAlcoholic;
        }

        public void setStrAlcoholic(String strAlcoholic) {
            this.strAlcoholic = strAlcoholic;
        }

        private String strGlass;

        public String getStrGlass() {
            return this.strGlass;
        }

        public void setStrGlass(String strGlass) {
            this.strGlass = strGlass;
        }

        private String strInstructions;

        public String getStrInstructions() {
            return this.strInstructions;
        }

        public void setStrInstructions(String strInstructions) {
            this.strInstructions = strInstructions;
        }

        private String strDrinkThumb;

        public String getStrDrinkThumb() {
            return this.strDrinkThumb;
        }

        public void setStrDrinkThumb(String strDrinkThumb) {
            this.strDrinkThumb = strDrinkThumb;
        }

        private String strIngredient1;

        public String getStrIngredient1() {
            return this.strIngredient1;
        }

        public void setStrIngredient1(String strIngredient1) {
            this.strIngredient1 = strIngredient1;
        }

        private String strIngredient2;

        public String getStrIngredient2() {
            return this.strIngredient2;
        }

        public void setStrIngredient2(String strIngredient2) {
            this.strIngredient2 = strIngredient2;
        }

        private String strIngredient3;

        public String getStrIngredient3() {
            return this.strIngredient3;
        }

        public void setStrIngredient3(String strIngredient3) {
            this.strIngredient3 = strIngredient3;
        }

        private String strIngredient4;

        public String getStrIngredient4() {
            return this.strIngredient4;
        }

        public void setStrIngredient4(String strIngredient4) {
            this.strIngredient4 = strIngredient4;
        }

        private String strIngredient5;

        public String getStrIngredient5() {
            return this.strIngredient5;
        }

        public void setStrIngredient5(String strIngredient5) {
            this.strIngredient5 = strIngredient5;
        }

        private String strIngredient6;

        public String getStrIngredient6() {
            return this.strIngredient6;
        }

        public void setStrIngredient6(String strIngredient6) {
            this.strIngredient6 = strIngredient6;
        }

        private String strMeasure1;

        public String getStrMeasure1() {
            return this.strMeasure1;
        }

        public void setStrMeasure1(String strMeasure1) {
            this.strMeasure1 = strMeasure1;
        }

        private String strMeasure2;

        public String getStrMeasure2() {
            return this.strMeasure2;
        }

        public void setStrMeasure2(String strMeasure2) {
            this.strMeasure2 = strMeasure2;
        }

        private String strMeasure3;

        public String getStrMeasure3() {
            return this.strMeasure3;
        }

        public void setStrMeasure3(String strMeasure3) {
            this.strMeasure3 = strMeasure3;
        }

        private String strMeasure4;

        public String getStrMeasure4() {
            return this.strMeasure4;
        }

        public void setStrMeasure4(String strMeasure4) {
            this.strMeasure4 = strMeasure4;
        }

        private String strMeasure5;

        public String getStrMeasure5() {
            return this.strMeasure5;
        }

        public void setStrMeasure5(String strMeasure5) {
            this.strMeasure5 = strMeasure5;
        }

        private String strMeasure6;

        public String getStrMeasure6() {
            return this.strMeasure6;
        }

        public void setStrMeasure6(String strMeasure6) {
            this.strMeasure6 = strMeasure6;
        }

        private String dateModified;

        public String getDateModified() {
            return this.dateModified;
        }

        public void setDateModified(String dateModified) {
            this.dateModified = dateModified;
        }
    }

    public class RootObject {
        private ArrayList<Drink> drinks;

        public ArrayList<Drink> getDrinks() {
            return this.drinks;
        }

        public void setDrinks(ArrayList<Drink> drinks) {
            this.drinks = drinks;
        }
    }
}