package com.pgc.tedeschi.pokemongocaltulator.utils;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

import com.pgc.tedeschi.pokemongocaltulator.R;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by aless on 04/09/2016.
 */
public class Convert {

    public static String findColorPerPokemon(String pokemonName) {
        if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.JOLTEON.getName())) {
            return Pokemon.JOLTEON.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.FLAREON.getName())) {
            return Pokemon.FLAREON.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.BULBASAUR.getName())) {
            return Pokemon.BULBASAUR.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.IVYSAUR.getName())) {
            return Pokemon.IVYSAUR.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CHARMANDER.getName())) {
            return Pokemon.CHARMANDER.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CHARMELEON.getName())) {
            return Pokemon.CHARMELEON.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SQUIRTLE.getName())) {
            return Pokemon.SQUIRTLE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.WARTORTLE.getName())) {
            return Pokemon.WARTORTLE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CATERPIE.getName())) {
            return Pokemon.CATERPIE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.METAPOD.getName())) {
            return Pokemon.METAPOD.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.WEEDLE.getName())) {
            return Pokemon.WEEDLE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KAKUNA.getName())) {
            return Pokemon.KAKUNA.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PIDGEY.getName())) {
            return Pokemon.PIDGEY.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PIDGEOTTO.getName())) {
            return Pokemon.PIDGEOTTO.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.RATTATA.getName())) {
            return Pokemon.RATTATA.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SPEAROW.getName())) {
            return Pokemon.SPEAROW.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.EKANS.getName())) {
            return Pokemon.EKANS.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PIKACHU.getName())) {
            return Pokemon.PIKACHU.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SANDSHREW.getName())) {
            return Pokemon.SANDSHREW.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORAN_F.getName())) {
            return Pokemon.NIDORAN_F.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORINA.getName())) {
            return Pokemon.NIDORINA.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORAN_M.getName())) {
            return Pokemon.NIDORAN_M.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORINO.getName())) {
            return Pokemon.NIDORINO.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CLEFAIRY.getName())) {
            return Pokemon.CLEFAIRY.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VULPIX.getName())) {
            return Pokemon.VULPIX.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.JIGGLYPUFF.getName())) {
            return Pokemon.JIGGLYPUFF.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.ZUBAT.getName())) {
            return Pokemon.ZUBAT.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.ODDISH.getName())) {
            return Pokemon.ODDISH.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GLOOM.getName())) {
            return Pokemon.GLOOM.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PARAS.getName())) {
            return Pokemon.PARAS.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VENONAT.getName())) {
            return Pokemon.VENONAT.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DIGLETT.getName())) {
            return Pokemon.DIGLETT.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MEOWTH.getName())) {
            return Pokemon.MEOWTH.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PSYDUCK.getName())) {
            return Pokemon.PSYDUCK.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MANKEY.getName())) {
            return Pokemon.MANKEY.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GROWLITHE.getName())) {
            return Pokemon.GROWLITHE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.POLIWAG.getName())) {
            return Pokemon.POLIWAG.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.POLIWHIRL.getName())) {
            return Pokemon.POLIWHIRL.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.ABRA.getName())) {
            return Pokemon.ABRA.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KADABRA.getName())) {
            return Pokemon.KADABRA.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MACHOP.getName())) {
            return Pokemon.MACHOP.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MACHOKE.getName())) {
            return Pokemon.MACHOKE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.BELLSPROUT.getName())) {
            return Pokemon.BELLSPROUT.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.WEEPINBELL.getName())) {
            return Pokemon.WEEPINBELL.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.TENTACOOL.getName())) {
            return Pokemon.TENTACOOL.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GEODUDE.getName())) {
            return Pokemon.GEODUDE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GRAVELER.getName())) {
            return Pokemon.GRAVELER.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PONYTA.getName())) {
            return Pokemon.PONYTA.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SLOWPOKE.getName())) {
            return Pokemon.SLOWPOKE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MAGNEMITE.getName())) {
            return Pokemon.MAGNEMITE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DODUO.getName())) {
            return Pokemon.DODUO.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SEEL.getName())) {
            return Pokemon.SEEL.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GRIMER.getName())) {
            return Pokemon.GRIMER.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SHELLDER.getName())) {
            return Pokemon.SHELLDER.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GASTLY.getName())) {
            return Pokemon.GASTLY.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.HAUNTER.getName())) {
            return Pokemon.HAUNTER.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DROWZEE.getName())) {
            return Pokemon.DROWZEE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KRABBY.getName())) {
            return Pokemon.KRABBY.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VOLTORB.getName())) {
            return Pokemon.VOLTORB.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.EXEGGCUTE.getName())) {
            return Pokemon.EXEGGCUTE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CUBONE.getName())) {
            return Pokemon.CUBONE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KOFFING.getName())) {
            return Pokemon.KOFFING.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.RHYHORN.getName())) {
            return Pokemon.RHYHORN.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.HORSEA.getName())) {
            return Pokemon.HORSEA.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GOLDEEN.getName())) {
            return Pokemon.GOLDEEN.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.STARYU.getName())) {
            return Pokemon.STARYU.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MAGIKARP.getName())) {
            return Pokemon.MAGIKARP.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.FLAREON.getName())) {
            return Pokemon.FLAREON.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.JOLTEON.getName())) {
            return Pokemon.JOLTEON.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VAPOREON.getName())) {
            return Pokemon.VAPOREON.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.OMANYTE.getName())) {
            return Pokemon.OMANYTE.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KABUTO.getName())) {
            return Pokemon.KABUTO.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DRATINI.getName())) {
            return Pokemon.DRATINI.getColor().getHex();
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DRAGONAIR.getName())) {
            return Pokemon.DRAGONAIR.getColor().getHex();
        } else {
            return "#000000";
        }

    }

    public static String findHexByString(String colorName) {
        String pokemonColor = null;
        if (colorName.equals("green.1")) {
            pokemonColor = "#00BF00";

        } else if (colorName.equals("green.2")) {
            pokemonColor = "#006400";

        } else if (colorName.equals("red.1")) {
            pokemonColor = "#E76767";

        } else if (colorName.equals("red.2")) {
            pokemonColor = "#E53636";

        } else if (colorName.equals("blue.1")) {
            pokemonColor = "#A9E3FF";

        } else if (colorName.equals("blue.2")) {
            pokemonColor = "#00ACFF";

        } else if (colorName.equals("light.brown.1")) {
            pokemonColor = "#E7AC70";

        }
        return pokemonColor;
    }

    public static int findColorByString(String colorName) {
        int pokemonColor = 0;
        if (colorName.equals("green.1")) {
            pokemonColor = Color.parseColor("#00BF00");

        } else if (colorName.equals("green.2")) {
            pokemonColor = Color.parseColor("#006400");

        } else if (colorName.equals("red.1")) {
            pokemonColor = Color.parseColor("#E76767");

        } else if (colorName.equals("red.2")) {
            pokemonColor = Color.parseColor("#E53636");

        } else if (colorName.equals("blue.1")) {
            pokemonColor = Color.parseColor("#A9E3FF");

        } else if (colorName.equals("blue.2")) {
            pokemonColor = Color.parseColor("#00ACFF");

        } else if (colorName.equals("light.brown.1")) {
            pokemonColor = Color.parseColor("#E7AC70");

        } else {
            pokemonColor = Color.BLACK;
        }
        return pokemonColor;
    }

    public static int findPokemonImage(String pokemonName) {
        if (StringUtils.equals(pokemonName, "Bulbasaur")) {
            return R.mipmap.ic_bulbasaur;
        }
        if (StringUtils.equals(pokemonName, "Ivysaur")) {
            return R.mipmap.ic_ivysaur;
        }
        if (StringUtils.equals(pokemonName, "Charmander")) {
            return R.mipmap.ic_charmender;
        }
        if (StringUtils.equals(pokemonName, "Charmeleon")) {
            return R.mipmap.ic_charmeleon;
        }
        if (StringUtils.equals(pokemonName, "Squirtle")) {
            return R.mipmap.ic_squirtle;
        }
        if (StringUtils.equals(pokemonName, "Wartortle")) {
            return R.mipmap.ic_wartortle;
        }
        if (StringUtils.equals(pokemonName, "Caterpie")) {
            return R.mipmap.ic_caterpie;
        }
        if (StringUtils.equals(pokemonName, "Metapod")) {
            return R.mipmap.ic_metapod;
        }
        if (StringUtils.equals(pokemonName, "Weedle")) {
            return R.mipmap.ic_weedle;
        }
        if (StringUtils.equals(pokemonName, "Kakuna")) {
            return R.mipmap.ic_kakuna;
        }
        if (StringUtils.equals(pokemonName, "Pidgey")) {
            return R.mipmap.ic_pidgey;
        }
        if (StringUtils.equals(pokemonName, "Pidgeotto")) {
            return R.mipmap.ic_pidgeotto;
        }
        if (StringUtils.equals(pokemonName, "Rattata")) {
            return R.mipmap.ic_rattata;
        }
        if (StringUtils.equals(pokemonName, "Spearow")) {
            return R.mipmap.ic_spearow;
        }
        if (StringUtils.equals(pokemonName, "Ekans")) {
            return R.mipmap.ic_ekans;
        }
        if (StringUtils.equals(pokemonName, "Pikachu")) {
            return R.mipmap.ic_pikachu;
        }
        if (StringUtils.equals(pokemonName, "Sandshrew")) {
            return R.mipmap.ic_sandshrew;
        }
        if (StringUtils.equals(pokemonName, "Nidoran F")) {
            return R.mipmap.ic_nidoran_f;
        }
        if (StringUtils.equals(pokemonName, "Nidorina")) {
            return R.mipmap.ic_nidorina;
        }
        if (StringUtils.equals(pokemonName, "Nidoran M")) {
            return R.mipmap.ic_nidoran_m;
        }
        if (StringUtils.equals(pokemonName, "Nidorino")) {
            return R.mipmap.ic_nidorino;
        }
        if (StringUtils.equals(pokemonName, "Clefairy")) {
            return R.mipmap.ic_clefairy;
        }
        if (StringUtils.equals(pokemonName, "Vulpix")) {
            return R.mipmap.ic_vulpix;
        }
        if (StringUtils.equals(pokemonName, "Jigglypuff")) {
            return R.mipmap.ic_jigglypuff;
        }
        if (StringUtils.equals(pokemonName, "Zubat")) {
            return R.mipmap.ic_zubat;
        }
        if (StringUtils.equals(pokemonName, "Oddish")) {
            return R.mipmap.ic_oddish;
        }
        if (StringUtils.equals(pokemonName, "Gloom")) {
            return R.mipmap.ic_gloom;
        }
        if (StringUtils.equals(pokemonName, "Paras")) {
            return R.mipmap.ic_paras;
        }
        if (StringUtils.equals(pokemonName, "Venonat")) {
            return R.mipmap.ic_venonat;
        }
        if (StringUtils.equals(pokemonName, "Diglett")) {
            return R.mipmap.ic_diglett;
        }
        if (StringUtils.equals(pokemonName, "Meowth")) {
            return R.mipmap.ic_meowth;
        }
        if (StringUtils.equals(pokemonName, "Psyduck")) {
            return R.mipmap.ic_psyduck;
        }
        if (StringUtils.equals(pokemonName, "Mankey")) {
            return R.mipmap.ic_mankey;
        }
        if (StringUtils.equals(pokemonName, "Growlithe")) {
            return R.mipmap.ic_growlithe;
        }
        if (StringUtils.equals(pokemonName, "Poliwag")) {
            return R.mipmap.ic_poliwag;
        }
        if (StringUtils.equals(pokemonName, "Poliwhirl")) {
            return R.mipmap.ic_poliwhirl;
        }
        if (StringUtils.equals(pokemonName, "Abra")) {
            return R.mipmap.ic_abra;
        }
        if (StringUtils.equals(pokemonName, "Kadabra")) {
            return R.mipmap.ic_kadabra;
        }
        if (StringUtils.equals(pokemonName, "Machop")) {
            return R.mipmap.ic_machop;
        }
        if (StringUtils.equals(pokemonName, "Machoke")) {
            return R.mipmap.ic_machoke;
        }
        if (StringUtils.equals(pokemonName, "Bellsprout")) {
            return R.mipmap.ic_bellsprout;
        }
        if (StringUtils.equals(pokemonName, "Weepinbell")) {
            return R.mipmap.ic_weepinbell;
        }
        if (StringUtils.equals(pokemonName, "Tentacool")) {
            return R.mipmap.ic_tentacool;
        }
        if (StringUtils.equals(pokemonName, "Geodude")) {
            return R.mipmap.ic_geodude;
        }
        if (StringUtils.equals(pokemonName, "Graveler")) {
            return R.mipmap.ic_graveler;
        }
        if (StringUtils.equals(pokemonName, "Ponyta")) {
            return R.mipmap.ic_ponyta;
        }
        if (StringUtils.equals(pokemonName, "Slowpoke")) {
            return R.mipmap.ic_slowpoke;
        }
        if (StringUtils.equals(pokemonName, "Magnemite")) {
            return R.mipmap.ic_magnemite;
        }
        if (StringUtils.equals(pokemonName, "Doduo")) {
            return R.mipmap.ic_doduo;
        }
        if (StringUtils.equals(pokemonName, "Seel")) {
            return R.mipmap.ic_seel;
        }
        if (StringUtils.equals(pokemonName, "Grimer")) {
            return R.mipmap.ic_grimer;
        }
        if (StringUtils.equals(pokemonName, "Shellder")) {
            return R.mipmap.ic_shelder;
        }
        if (StringUtils.equals(pokemonName, "Gastly")) {
            return R.mipmap.ic_gastly;
        }
        if (StringUtils.equals(pokemonName, "Haunter")) {
            return R.mipmap.ic_haunter;
        }
        if (StringUtils.equals(pokemonName, "Drowzee")) {
            return R.mipmap.ic_drowzee;
        }
        if (StringUtils.equals(pokemonName, "Krabby")) {
            return R.mipmap.ic_krabby;
        }
        if (StringUtils.equals(pokemonName, "Voltorb")) {
            return R.mipmap.ic_voltorb;
        }
        if (StringUtils.equals(pokemonName, "Exeggcute")) {
            return R.mipmap.ic_exeggcute;
        }
        if (StringUtils.equals(pokemonName, "Cubone")) {
            return R.mipmap.ic_cubone;
        }
        if (StringUtils.equals(pokemonName, "Koffing")) {
            return R.mipmap.ic_koffing;
        }
        if (StringUtils.equals(pokemonName, "Rhyhorn")) {
            return R.mipmap.ic_rhyhorn;
        }
        if (StringUtils.equals(pokemonName, "Horsea")) {
            return R.mipmap.ic_horsea;
        }
        if (StringUtils.equals(pokemonName, "Goldeen")) {
            return R.mipmap.ic_goldeen;
        }
        if (StringUtils.equals(pokemonName, "Staryu")) {
            return R.mipmap.ic_staryu;
        }
        if (StringUtils.equals(pokemonName, "Magikarp")) {
            return R.mipmap.ic_magikarp;
        }
        if (StringUtils.equals(pokemonName, "Eevee")) {
            return R.mipmap.ic_eevee;
        }
        if (StringUtils.equals(pokemonName, "Omanyte")) {
            return R.mipmap.ic_omanyte;
        }
        if (StringUtils.equals(pokemonName, "Kabuto")) {
            return R.mipmap.ic_kabuto;
        }
        if (StringUtils.equals(pokemonName, "Dratini")) {
            return R.mipmap.ic_dratini;
        }
        if (StringUtils.equals(pokemonName, "Dragonair")) {
            return R.mipmap.ic_dragonair;
        }
        if (StringUtils.equals(pokemonName, "Dragonite")) {
            return R.mipmap.ic_dragonite;
        }

        if (StringUtils.equals(pokemonName, "Venusaur")) {
            return R.mipmap.ic_venusaur;
        }

        if (StringUtils.equals(pokemonName, "Charizard")) {
            return R.mipmap.ic_charizard;
        }
        if (StringUtils.equals(pokemonName, "Blastoise")) {
            return R.mipmap.ic_blastoise;
        }
        if (StringUtils.equals(pokemonName, "Butterfree")) {
            return R.mipmap.ic_butterfree;
        }
        if (StringUtils.equals(pokemonName, "Beedrill")) {
            return R.mipmap.ic_beedrill;
        }
        if (StringUtils.equals(pokemonName, "Pidgeot")) {
            return R.mipmap.ic_pidgeot;
        }
        if (StringUtils.equals(pokemonName, "Raticate")) {
            return R.mipmap.ic_raticate;
        }
        if (StringUtils.equals(pokemonName, "Fearow")) {
            return R.mipmap.ic_fearow;
        }
        if (StringUtils.equals(pokemonName, "Arbok")) {
            return R.mipmap.ic_arbok;
        }
        if (StringUtils.equals(pokemonName, "Raichu")) {
            return R.mipmap.ic_raichu;
        }
        if (StringUtils.equals(pokemonName, "Sandslash")) {
            return R.mipmap.ic_sandslash;
        }
        if (StringUtils.equals(pokemonName, "Nidoqueen")) {
            return R.mipmap.ic_nidoqueen;
        }
        if (StringUtils.equals(pokemonName, "Nidoking")) {
            return R.mipmap.ic_nidoking;
        }
        if (StringUtils.equals(pokemonName, "Clefable")) {
            return R.mipmap.ic_clefable;
        }
        if (StringUtils.equals(pokemonName, "Ninetales")) {
            return R.mipmap.ic_ninetales;
        }
        if (StringUtils.equals(pokemonName, "Wigglytuff")) {
            return R.mipmap.ic_wigglytuff;
        }
        if (StringUtils.equals(pokemonName, "Globat")) {
            return R.mipmap.ic_golbat;
        }
        if (StringUtils.equals(pokemonName, "Vileplume")) {
            return R.mipmap.ic_vileplume;
        }
        if (StringUtils.equals(pokemonName, "Parasect")) {
            return R.mipmap.ic_parasect;
        }
        if (StringUtils.equals(pokemonName, "Venomoth")) {
            return R.mipmap.ic_venomoth;
        }
        if (StringUtils.equals(pokemonName, "Dugtrio")) {
            return R.mipmap.ic_dugtrio;
        }
        if (StringUtils.equals(pokemonName, "Persian")) {
            return R.mipmap.ic_persian;
        }
        if (StringUtils.equals(pokemonName, "Golduck")) {
            return R.mipmap.ic_golduck;
        }
        if (StringUtils.equals(pokemonName, "Primeape")) {
            return R.mipmap.ic_primeape;
        }
        if (StringUtils.equals(pokemonName, "Arcanine")) {
            return R.mipmap.ic_arcanine;
        }
        if (StringUtils.equals(pokemonName, "Poliwrath")) {
            return R.mipmap.ic_poliwrath;
        }
        if (StringUtils.equals(pokemonName, "Alakazam")) {
            return R.mipmap.ic_alakazam;
        }
        if (StringUtils.equals(pokemonName, "Machamp")) {
            return R.mipmap.ic_machamp;
        }
        if (StringUtils.equals(pokemonName, "Victreebell")) {
            return R.mipmap.ic_victreebel;
        }
        if (StringUtils.equals(pokemonName, "Tentacruel")) {
            return R.mipmap.ic_tentacruel;
        }
        if (StringUtils.equals(pokemonName, "Graveler")) {
            return R.mipmap.ic_graveler;
        }
        if (StringUtils.equals(pokemonName, "Golem")) {
            return R.mipmap.ic_golem;
        }
        if (StringUtils.equals(pokemonName, "Rapidash")) {
            return R.mipmap.ic_rapidash;
        }
        if (StringUtils.equals(pokemonName, "Slowbro")) {
            return R.mipmap.ic_slowbro;
        }
        if (StringUtils.equals(pokemonName, "Magneton")) {
            return R.mipmap.ic_magneton;
        }
        if (StringUtils.equals(pokemonName, "Dodrio")) {
            return R.mipmap.ic_dodrio;
        }
        if (StringUtils.equals(pokemonName, "Dewgong")) {
            return R.mipmap.ic_dewgong;
        }
        if (StringUtils.equals(pokemonName, "Muk")) {
            return R.mipmap.ic_muk;
        }
        if (StringUtils.equals(pokemonName, "Cloyster")) {
            return R.mipmap.ic_clyster;
        }
        if (StringUtils.equals(pokemonName, "Gengar")) {
            return R.mipmap.ic_gengar;
        }
        if (StringUtils.equals(pokemonName, "Hypno")) {
            return R.mipmap.ic_hypno;
        }
        if (StringUtils.equals(pokemonName, "Kingler")) {
            return R.mipmap.ic_kingler;
        }
        if (StringUtils.equals(pokemonName, "Electrode")) {
            return R.mipmap.ic_electorde;
        }
        if (StringUtils.equals(pokemonName, "Exeggutor")) {
            return R.mipmap.ic_exeggcutor;
        }
        if (StringUtils.equals(pokemonName, "Marowak")) {
            return R.mipmap.ic_marowak;
        }
        if (StringUtils.equals(pokemonName, "Weezing")) {
            return R.mipmap.ic_weezing;
        }
        if (StringUtils.equals(pokemonName, "Rhydon")) {
            return R.mipmap.ic_rhydon;
        }
        if (StringUtils.equals(pokemonName, "Seadra")) {
            return R.mipmap.ic_seadra;
        }
        if (StringUtils.equals(pokemonName, "Seaking")) {
            return R.mipmap.ic_seaking;
        }
        if (StringUtils.equals(pokemonName, "Starmie")) {
            return R.mipmap.ic_starmie;
        }
        if (StringUtils.equals(pokemonName, "Gyarados")) {
            return R.mipmap.ic_gyarados;
        }
        if (StringUtils.equals(pokemonName, "Flareon")) {
            return R.mipmap.ic_flareon;
        }
        if (StringUtils.equals(pokemonName, "Jolteon")) {
            return R.mipmap.ic_jolteon;
        }
        if (StringUtils.equals(pokemonName, "Vaporeon")) {
            return R.mipmap.ic_vaporeon;
        }
        if (StringUtils.equals(pokemonName, "Omastar")) {
            return R.mipmap.ic_omastar;
        }
        if (StringUtils.equals(pokemonName, "Kabutops")) {
            return R.mipmap.ic_kabutops;
        }
        if (StringUtils.equals(pokemonName, "Dragonite")) {
            return R.mipmap.ic_dragonite;
        }
        return -1;
    }
}
