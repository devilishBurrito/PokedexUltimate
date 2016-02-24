package com.lclark.pokedexultimate;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jak on 2/23/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        return;
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, id, weight, height;
        View fullView;

        public ViewHolder(View itemView) {
            super(itemView);
            fullView = itemView;
            name = (TextView) itemView.findViewById(R.id.row_pokemon_name_textview);
            id = (TextView) itemView.findViewById(R.id.row_pokemon_id_textview);
            weight = (TextView) itemView.findViewById(R.id.row_pokemon_weight_textview);
            height = (TextView) itemView.findViewById(R.id.row_pokemon_height_textview);
        }
    }

}
