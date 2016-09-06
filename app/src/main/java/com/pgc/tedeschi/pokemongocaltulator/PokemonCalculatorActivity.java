package com.pgc.tedeschi.pokemongocaltulator;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.transition.Visibility;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.pgc.tedeschi.pokemongocaltulator.utils.Convert;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;

public class PokemonCalculatorActivity extends AppCompatActivity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private Double pokemonCPFactor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_calculator);

        RadioButton Jolteon = (RadioButton)findViewById(R.id.Jolteon);
        RadioButton Flareon = (RadioButton)findViewById(R.id.Flareon);
        RadioButton Vaporeon = (RadioButton)findViewById(R.id.Vaporeon);


        Intent intent = getIntent();
        String pokemonName = intent.getStringExtra("pokemonName");
        Log.i("###$pokemonName", pokemonName);
        pokemonCPFactor = intent.getDoubleExtra("pokemonCPFactor",1.0);
        Log.i("###$pokemonCPFactor", pokemonCPFactor + "");
        int pokemonColor = Convert.findColorByString(intent.getStringExtra("pokemonColor"));
        Log.i("###$pokemonColor", pokemonColor + "");
        String pokemonEvo = intent.getStringExtra("pokemonEvo1");
        Log.i("###$pokemonEvo1", pokemonEvo + "");

        ImageView img_pokemon = (ImageView)findViewById(R.id.img_pokemon);
        setPokemonImage(img_pokemon, Convert.findPokemonImage(pokemonName));

        ImageView img_pokemon_evo = (ImageView)findViewById(R.id.img_pokemon_evo);
        setPokemonImage(img_pokemon_evo, Convert.findPokemonImage(pokemonEvo));


        //SpannableString s = new SpannableString(pokemonName);
        //s.setSpan(new ForegroundColorSpan(pokemonColor), 0, pokemonName.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //getSupportActionBar().setTitle(s);

        getSupportActionBar().setTitle(Html.fromHtml("<font color='#ffffff'>"+pokemonName+"</font>"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(Convert.findColorPerPokemon(pokemonName))));

        ed_pokemonCP = (EditText) findViewById(R.id.ed_pokemonCP);

        ed_pokemonCP.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction()!=KeyEvent.ACTION_DOWN)
                    return false;
                if(keyCode == KeyEvent.KEYCODE_ENTER ){
                    calculate(ed_pokemonCP);
                    return true;
                }
                return false;
            }
        });

        LinearLayout layout_eevvee = (LinearLayout)findViewById(R.id.layout_eevvee);
        if (StringUtils.equals(pokemonName,"Eevee")){
            layout_eevvee.setVisibility(View.VISIBLE);
            Jolteon.setChecked(Boolean.FALSE);
            Flareon.setChecked(Boolean.FALSE);
            Vaporeon.setChecked(Boolean.FALSE);
        }else {
            layout_eevvee.setVisibility(View.GONE);
        }


        tw_result = (TextView) findViewById(R.id.tw_result);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void setPokemonImage(ImageView img_pokemon, int pokemonImage) {
        if(pokemonImage!=-1) {
            img_pokemon.setImageResource(pokemonImage);
        }
    }

    public void calculate(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (view == null || StringUtils.isEmpty(String.valueOf(ed_pokemonCP.getText()))) {
            return;
        }
        int pokemonCP = Integer.valueOf(String.valueOf(ed_pokemonCP.getText()));
        double min = pokemonCP * (pokemonCPFactor-0.1);
        double max = pokemonCP * (pokemonCPFactor+0.1);
        DecimalFormat df = new DecimalFormat("#########.##");
        String lblMin = df.format(min);
        String lblMax = df.format(max);
        tw_result.setText("Avg CP\n" + lblMin + " ~ " + lblMax);
    }


    private EditText ed_pokemonCP;
    private TextView tw_result;

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "PokemonCalculator Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.pgc.tedeschi.pokemongocaltulator/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "PokemonCalculator Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.pgc.tedeschi.pokemongocaltulator/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    public void setEvoImage(View view) {
        if(view == null){
            return;
        }
        String pokemonEvo = ((RadioButton)view).getText().toString();
        ImageView img_pokemon_evo = (ImageView)findViewById(R.id.img_pokemon_evo);
        setPokemonImage(img_pokemon_evo, Convert.findPokemonImage(pokemonEvo));
        Log.d("###$Convert.findColorPerPokemon(pokemonEvo)",Convert.findColorPerPokemon(pokemonEvo));

        changeActionBarColor(Convert.findColorPerPokemon(pokemonEvo));
    }

    public void changeActionBarColor (String color){
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(color)));
    }
}