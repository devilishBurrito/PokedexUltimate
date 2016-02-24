package com.lclark.pokedexultimate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Jak on 2/23/16.
 */public class PokeArrayAdapter extends ArrayAdapter<Pokemon> {


    private static class ViewHolder {
        ImageView poke;
        TextView name, id, weight, height;
    }

    public PokeArrayAdapter(Context context, int resource, List<Pokemon> objects) {
        super(context, resource, objects);
    }

    public void removePokemon(int position) {
        remove(getItem(position));
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        ImageView pokeImage;

        ViewHolder viewHolder;
        if (convertView == null) {


            convertView = inflater.inflate(R.layout.raw_pokemon, parent, false);
            pokeImage = (ImageView) convertView.findViewById(R.id.activity_main_poke_imageview);
            TextView nameTextView = (TextView) convertView.findViewById(R.id.row_pokemon_name_textview);
            TextView idTextView = (TextView) convertView.findViewById(R.id.row_pokemon_id_textview);
            TextView weightTextView = (TextView) convertView.findViewById(R.id.row_pokemon_weight_textview);
            TextView heightTextView = (TextView) convertView.findViewById(R.id.row_pokemon_height_textview);



            viewHolder = new ViewHolder();
            viewHolder.name = nameTextView;
            viewHolder.id = idTextView;
            viewHolder.height = heightTextView;
            viewHolder.weight = weightTextView;
            viewHolder.poke = pokeImage;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        Pokemon pokemon = getItem(position);

        viewHolder.name.setText(pokemon.getName());
        viewHolder.id.setText(pokemon.getId());

        pokeImage = (ImageView) convertView.findViewById(R.id.activity_main_poke_imageview);

        String weight = getContext().getString(R.string.weight_label, pokemon.getWeight());

        viewHolder.weight.setText(weight);

        String height = getContext().getString(R.string.height_label, pokemon.getHeight());
        viewHolder.height.setText(height);

        Picasso.with(getContext()).load(pokemon.getImageUrl()).fit().centerInside().into(pokeImage);


        return convertView;
    }
}