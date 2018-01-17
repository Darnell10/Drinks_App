package c4q.com.drinks_app.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import c4q.com.drinks_app.R;
import c4q.com.drinks_app.model.Cocktail;
import c4q.com.drinks_app.views.Cocktail_ViewHolder;

/**
 * Created by bobbybah on 1/15/18.
 */

public class CocktailAdapter extends RecyclerView.Adapter<Cocktail_ViewHolder> {

    private static final String TAG = "HELP!!";
    public ArrayList<Cocktail.Drink> drinksList;

    public CocktailAdapter(ArrayList<Cocktail.Drink> drinksList){
        this.drinksList = drinksList;
    }

    @Override
    public Cocktail_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.drinks_itemview, parent, false);

        return new Cocktail_ViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(Cocktail_ViewHolder holder, int position) {
        Cocktail.Drink drinkItemList = drinksList.get(position);
        holder.onBind(drinkItemList);

    }

    @Override
    public int getItemCount() {
        return drinksList.size();
    }
}
