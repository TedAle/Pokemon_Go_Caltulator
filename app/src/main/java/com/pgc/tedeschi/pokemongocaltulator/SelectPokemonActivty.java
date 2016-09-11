package com.pgc.tedeschi.pokemongocaltulator;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.view.ViewGroup.LayoutParams;

import org.apache.commons.lang3.StringUtils;

public class SelectPokemonActivty extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.trainer_info:
                startTrainerInfoActivity();
                return true;
            //case R.id.help:
            //    showHelp();
            //    return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.select_pokemon_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_pokemon_activty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout info_dialog_box = (RelativeLayout) findViewById(R.id.info_dialog);
                ImageView info_dialog_fog = (ImageView) findViewById(R.id.info_dialog_background_fog);

                info_dialog_fog.setVisibility(View.VISIBLE);
                info_dialog_fog.setClickable(Boolean.TRUE);
                info_dialog_box.setVisibility(View.VISIBLE);

            }
        });

        Button info_dialog_ok_button = (Button) findViewById(R.id.info_dialog_ok_button);
        info_dialog_ok_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout info_dialog_box = (RelativeLayout) findViewById(R.id.info_dialog);
                ImageView info_dialog_fog = (ImageView) findViewById(R.id.info_dialog_background_fog);

                info_dialog_box.setVisibility(View.GONE);
                info_dialog_fog.setVisibility(View.GONE);

            }
        });
    }


    private void startTrainerInfoActivity() {
        Intent trainerInfoActivityIntent = new Intent(this, TrainerInfoActivity.class);
        this.startActivity(trainerInfoActivityIntent);
    }

    public void openCalculator(View view) {
        if (view == null || StringUtils.isEmpty(String.valueOf(view.getTag()))) {
            return;
        }
        Intent pokemonIntent = new Intent(view.getContext(), PokemonCalculatorActivity.class);

        String tag = view.getTag().toString();

        Double pokemonCPFactor = Double.valueOf(extractCP(tag));
        String pokemonName = extractName(tag);
        String pokemonColor = extractColor(tag);
        String pokemonEvo1 = extractEvo1(tag);

        if (StringUtils.equals(pokemonName, "Eevee")) {
            String pokemonEvo2 = extractEvo2(tag);
            String pokemonEvo3 = extractEvo3(tag);

            pokemonIntent.putExtra("pokemonEvo2", pokemonEvo2);
            Log.d("###$pokemonEvo2", pokemonEvo2 + "");
            pokemonIntent.putExtra("pokemonpokemonEvo3Name", pokemonEvo3);
            Log.d("###$pokemonEvo3", pokemonEvo3 + "");
        }

        pokemonIntent.putExtra("pokemonName", pokemonName);
        Log.d("###$pokemonName", pokemonName + "");

        pokemonIntent.putExtra("pokemonCPFactor", pokemonCPFactor);
        Log.d("###$pokemonCPFactor", pokemonCPFactor + "");

        pokemonIntent.putExtra("pokemonColor", pokemonColor);
        Log.d("###$pokemonColor", pokemonColor + "");

        pokemonIntent.putExtra("pokemonEvo1", pokemonEvo1);
        Log.d("###$pokemonEvo1", pokemonEvo1 + "");

        view.getContext().startActivity(pokemonIntent);
    }

    private String extractName(String tag) {
        String pokemonName = tag.split("_")[0];
        return pokemonName;
    }

    private String extractCP(String tag) {
        String pokemonCP = tag.split("_")[1];
        return pokemonCP;
    }

    private String extractColor(String tag) {
        String color = tag.split("_")[2];
        return color;
    }

    private String extractEvo1(String tag) {
        String pokemonEvo1 = tag.split("_")[3];
        return pokemonEvo1;
    }

    private String extractEvo2(String tag) {
        String pokemonEvo2 = tag.split("_")[4];
        return pokemonEvo2;
    }

    private String extractEvo3(String tag) {
        String pokemonEvo3 = tag.split("_")[5];
        return pokemonEvo3;
    }
}

