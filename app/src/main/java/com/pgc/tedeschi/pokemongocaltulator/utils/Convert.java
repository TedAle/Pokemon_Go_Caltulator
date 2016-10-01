package com.pgc.tedeschi.pokemongocaltulator.utils;

import android.graphics.Color;

import com.pgc.tedeschi.pokemongocaltulator.R;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by aless on 04/09/2016.
 */
public class Convert {

    public static Pokemon findPokemon(String pokemonName) {
        if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.JOLTEON.getName())) {
            return Pokemon.JOLTEON;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.FLAREON.getName())) {
            return Pokemon.FLAREON;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.BULBASAUR.getName())) {
            return Pokemon.BULBASAUR;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.IVYSAUR.getName())) {
            return Pokemon.IVYSAUR;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CHARMANDER.getName())) {
            return Pokemon.CHARMANDER;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CHARMELEON.getName())) {
            return Pokemon.CHARMELEON;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SQUIRTLE.getName())) {
            return Pokemon.SQUIRTLE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.WARTORTLE.getName())) {
            return Pokemon.WARTORTLE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CATERPIE.getName())) {
            return Pokemon.CATERPIE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.METAPOD.getName())) {
            return Pokemon.METAPOD;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.WEEDLE.getName())) {
            return Pokemon.WEEDLE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KAKUNA.getName())) {
            return Pokemon.KAKUNA;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PIDGEY.getName())) {
            return Pokemon.PIDGEY;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PIDGEOTTO.getName())) {
            return Pokemon.PIDGEOTTO;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.RATTATA.getName())) {
            return Pokemon.RATTATA;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SPEAROW.getName())) {
            return Pokemon.SPEAROW;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.EKANS.getName())) {
            return Pokemon.EKANS;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PIKACHU.getName())) {
            return Pokemon.PIKACHU;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SANDSHREW.getName())) {
            return Pokemon.SANDSHREW;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORAN_F.getName())) {
            return Pokemon.NIDORAN_F;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORINA.getName())) {
            return Pokemon.NIDORINA;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORAN_M.getName())) {
            return Pokemon.NIDORAN_M;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.NIDORINO.getName())) {
            return Pokemon.NIDORINO;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CLEFAIRY.getName())) {
            return Pokemon.CLEFAIRY;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VULPIX.getName())) {
            return Pokemon.VULPIX;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.JIGGLYPUFF.getName())) {
            return Pokemon.JIGGLYPUFF;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.ZUBAT.getName())) {
            return Pokemon.ZUBAT;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.ODDISH.getName())) {
            return Pokemon.ODDISH;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GLOOM.getName())) {
            return Pokemon.GLOOM;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PARAS.getName())) {
            return Pokemon.PARAS;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VENONAT.getName())) {
            return Pokemon.VENONAT;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DIGLETT.getName())) {
            return Pokemon.DIGLETT;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MEOWTH.getName())) {
            return Pokemon.MEOWTH;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PSYDUCK.getName())) {
            return Pokemon.PSYDUCK;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MANKEY.getName())) {
            return Pokemon.MANKEY;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GROWLITHE.getName())) {
            return Pokemon.GROWLITHE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.POLIWAG.getName())) {
            return Pokemon.POLIWAG;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.POLIWHIRL.getName())) {
            return Pokemon.POLIWHIRL;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.ABRA.getName())) {
            return Pokemon.ABRA;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KADABRA.getName())) {
            return Pokemon.KADABRA;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MACHOP.getName())) {
            return Pokemon.MACHOP;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MACHOKE.getName())) {
            return Pokemon.MACHOKE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.BELLSPROUT.getName())) {
            return Pokemon.BELLSPROUT;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.WEEPINBELL.getName())) {
            return Pokemon.WEEPINBELL;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.TENTACOOL.getName())) {
            return Pokemon.TENTACOOL;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GEODUDE.getName())) {
            return Pokemon.GEODUDE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GRAVELER.getName())) {
            return Pokemon.GRAVELER;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.PONYTA.getName())) {
            return Pokemon.PONYTA;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SLOWPOKE.getName())) {
            return Pokemon.SLOWPOKE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MAGNEMITE.getName())) {
            return Pokemon.MAGNEMITE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DODUO.getName())) {
            return Pokemon.DODUO;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SEEL.getName())) {
            return Pokemon.SEEL;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GRIMER.getName())) {
            return Pokemon.GRIMER;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.SHELLDER.getName())) {
            return Pokemon.SHELLDER;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GASTLY.getName())) {
            return Pokemon.GASTLY;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.HAUNTER.getName())) {
            return Pokemon.HAUNTER;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DROWZEE.getName())) {
            return Pokemon.DROWZEE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KRABBY.getName())) {
            return Pokemon.KRABBY;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VOLTORB.getName())) {
            return Pokemon.VOLTORB;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.EXEGGCUTE.getName())) {
            return Pokemon.EXEGGCUTE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.CUBONE.getName())) {
            return Pokemon.CUBONE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KOFFING.getName())) {
            return Pokemon.KOFFING;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.RHYHORN.getName())) {
            return Pokemon.RHYHORN;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.HORSEA.getName())) {
            return Pokemon.HORSEA;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.GOLDEEN.getName())) {
            return Pokemon.GOLDEEN;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.STARYU.getName())) {
            return Pokemon.STARYU;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.MAGIKARP.getName())) {
            return Pokemon.MAGIKARP;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.FLAREON.getName())) {
            return Pokemon.FLAREON;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.JOLTEON.getName())) {
            return Pokemon.JOLTEON;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.VAPOREON.getName())) {
            return Pokemon.VAPOREON;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.OMANYTE.getName())) {
            return Pokemon.OMANYTE;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.KABUTO.getName())) {
            return Pokemon.KABUTO;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DRATINI.getName())) {
            return Pokemon.DRATINI;
        } else if (StringUtils.equalsIgnoreCase(pokemonName, Pokemon.DRAGONAIR.getName())) {
            return Pokemon.DRAGONAIR;
        } else {
            return null;
        }

    }

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
            return R.drawable.img_bulbasaur;
        }
        if (StringUtils.equals(pokemonName, "Ivysaur")) {
            return R.drawable.img_ivysaur;
        }
        if (StringUtils.equals(pokemonName, "Charmander")) {
            return R.drawable.img_charmander;
        }
        if (StringUtils.equals(pokemonName, "Charmeleon")) {
            return R.drawable.img_charmeleon;
        }
        if (StringUtils.equals(pokemonName, "Squirtle")) {
            return R.drawable.img_squirtle;
        }
        if (StringUtils.equals(pokemonName, "Wartortle")) {
            return R.drawable.img_wartortle;
        }
        if (StringUtils.equals(pokemonName, "Caterpie")) {
            return R.drawable.img_caterpie;
        }
        if (StringUtils.equals(pokemonName, "Metapod")) {
            return R.drawable.img_metapod;
        }
        if (StringUtils.equals(pokemonName, "Weedle")) {
            return R.drawable.img_weedle;
        }
        if (StringUtils.equals(pokemonName, "Kakuna")) {
            return R.drawable.img_kakuna;
        }
        if (StringUtils.equals(pokemonName, "Pidgey")) {
            return R.drawable.img_pidgey;
        }
        if (StringUtils.equals(pokemonName, "Pidgeotto")) {
            return R.drawable.img_pidgeotto;
        }
        if (StringUtils.equals(pokemonName, "Rattata")) {
            return R.drawable.img_rattata;
        }
        if (StringUtils.equals(pokemonName, "Spearow")) {
            return R.drawable.img_spearow;
        }
        if (StringUtils.equals(pokemonName, "Ekans")) {
            return R.drawable.img_ekans;
        }
        if (StringUtils.equals(pokemonName, "Pikachu")) {
            return R.drawable.img_pikachu;
        }
        if (StringUtils.equals(pokemonName, "Sandshrew")) {
            return R.drawable.img_sandshrew;
        }
        if (StringUtils.equals(pokemonName, "Nidoran F")) {
            return R.drawable.img_nidoran_f;
        }
        if (StringUtils.equals(pokemonName, "Nidorina")) {
            return R.drawable.img_nidorina;
        }
        if (StringUtils.equals(pokemonName, "Nidoran M")) {
            return R.drawable.img_nidoran_m;
        }
        if (StringUtils.equals(pokemonName, "Nidorino")) {
            return R.drawable.img_nidorino;
        }
        if (StringUtils.equals(pokemonName, "Clefairy")) {
            return R.drawable.img_clefairy;
        }
        if (StringUtils.equals(pokemonName, "Vulpix")) {
            return R.drawable.img_vulpix;
        }
        if (StringUtils.equals(pokemonName, "Jigglypuff")) {
            return R.drawable.img_jigglypuff;
        }
        if (StringUtils.equals(pokemonName, "Zubat")) {
            return R.drawable.img_zubat;
        }
        if (StringUtils.equals(pokemonName, "Oddish")) {
            return R.drawable.img_oddish;
        }
        if (StringUtils.equals(pokemonName, "Gloom")) {
            return R.drawable.img_gloom;
        }
        if (StringUtils.equals(pokemonName, "Paras")) {
            return R.drawable.img_paras;
        }
        if (StringUtils.equals(pokemonName, "Venonat")) {
            return R.drawable.img_venonat;
        }
        if (StringUtils.equals(pokemonName, "Diglett")) {
            return R.drawable.img_diglett;
        }
        if (StringUtils.equals(pokemonName, "Meowth")) {
            return R.drawable.img_meowth;
        }
        if (StringUtils.equals(pokemonName, "Psyduck")) {
            return R.drawable.img_psyduck;
        }
        if (StringUtils.equals(pokemonName, "Mankey")) {
            return R.drawable.img_mankey;
        }
        if (StringUtils.equals(pokemonName, "Growlithe")) {
            return R.drawable.img_growlithe;
        }
        if (StringUtils.equals(pokemonName, "Poliwag")) {
            return R.drawable.img_poliwag;
        }
        if (StringUtils.equals(pokemonName, "Poliwhirl")) {
            return R.drawable.img_poliwhirl;
        }
        if (StringUtils.equals(pokemonName, "Abra")) {
            return R.drawable.img_abra;
        }
        if (StringUtils.equals(pokemonName, "Kadabra")) {
            return R.drawable.img_kadabra;
        }
        if (StringUtils.equals(pokemonName, "Machop")) {
            return R.drawable.img_machop;
        }
        if (StringUtils.equals(pokemonName, "Machoke")) {
            return R.drawable.img_machoke;
        }
        if (StringUtils.equals(pokemonName, "Bellsprout")) {
            return R.drawable.img_bellsprout;
        }
        if (StringUtils.equals(pokemonName, "Weepinbell")) {
            return R.drawable.img_weepinbell;
        }
        if (StringUtils.equals(pokemonName, "Tentacool")) {
            return R.drawable.img_tentacool;
        }
        if (StringUtils.equals(pokemonName, "Geodude")) {
            return R.drawable.img_geodude;
        }
        if (StringUtils.equals(pokemonName, "Graveler")) {
            return R.drawable.img_graveler;
        }
        if (StringUtils.equals(pokemonName, "Ponyta")) {
            return R.drawable.img_ponyta;
        }
        if (StringUtils.equals(pokemonName, "Slowpoke")) {
            return R.drawable.img_slowpoke;
        }
        if (StringUtils.equals(pokemonName, "Magnemite")) {
            return R.drawable.img_magnemite;
        }
        if (StringUtils.equals(pokemonName, "Doduo")) {
            return R.drawable.img_doduo;
        }
        if (StringUtils.equals(pokemonName, "Seel")) {
            return R.drawable.img_seel;
        }
        if (StringUtils.equals(pokemonName, "Grimer")) {
            return R.drawable.img_grimer;
        }
        if (StringUtils.equals(pokemonName, "Shellder")) {
            return R.drawable.img_shellder;
        }
        if (StringUtils.equals(pokemonName, "Gastly")) {
            return R.drawable.img_gastly;
        }
        if (StringUtils.equals(pokemonName, "Haunter")) {
            return R.drawable.img_haunter;
        }
        if (StringUtils.equals(pokemonName, "Drowzee")) {
            return R.drawable.img_drowzee;
        }
        if (StringUtils.equals(pokemonName, "Krabby")) {
            return R.drawable.img_krabby;
        }
        if (StringUtils.equals(pokemonName, "Voltorb")) {
            return R.drawable.img_voltorb;
        }
        if (StringUtils.equals(pokemonName, "Exeggcute")) {
            return R.drawable.img_exeggcute;
        }
        if (StringUtils.equals(pokemonName, "Cubone")) {
            return R.drawable.img_cubone;
        }
        if (StringUtils.equals(pokemonName, "Koffing")) {
            return R.drawable.img_koffing;
        }
        if (StringUtils.equals(pokemonName, "Rhyhorn")) {
            return R.drawable.img_rhyhorn;
        }
        if (StringUtils.equals(pokemonName, "Horsea")) {
            return R.drawable.img_horsea;
        }
        if (StringUtils.equals(pokemonName, "Goldeen")) {
            return R.drawable.img_goldeen;
        }
        if (StringUtils.equals(pokemonName, "Staryu")) {
            return R.drawable.img_staryu;
        }
        if (StringUtils.equals(pokemonName, "Magikarp")) {
            return R.drawable.img_magikarp;
        }
        if (StringUtils.equals(pokemonName, "Eevee")) {
            return R.drawable.img_eevee;
        }
        if (StringUtils.equals(pokemonName, "Omanyte")) {
            return R.drawable.img_omanyte;
        }
        if (StringUtils.equals(pokemonName, "Kabuto")) {
            return R.drawable.img_kabuto;
        }
        if (StringUtils.equals(pokemonName, "Dratini")) {
            return R.drawable.img_dratini;
        }
        if (StringUtils.equals(pokemonName, "Dragonair")) {
            return R.drawable.img_dragonair;
        }
        if (StringUtils.equals(pokemonName, "Dragonite")) {
            return R.drawable.img_dragonite;
        }

        if (StringUtils.equals(pokemonName, "Venusaur")) {
            return R.drawable.img_venusaur;
        }

        if (StringUtils.equals(pokemonName, "Charizard")) {
            return R.drawable.img_charizard;
        }
        if (StringUtils.equals(pokemonName, "Blastoise")) {
            return R.drawable.img_blastoise;
        }
        if (StringUtils.equals(pokemonName, "Butterfree")) {
            return R.drawable.img_butterfree;
        }
        if (StringUtils.equals(pokemonName, "Beedrill")) {
            return R.drawable.img_beedrill;
        }
        if (StringUtils.equals(pokemonName, "Pidgeot")) {
            return R.drawable.img_pidgeot;
        }
        if (StringUtils.equals(pokemonName, "Raticate")) {
            return R.drawable.img_raticate;
        }
        if (StringUtils.equals(pokemonName, "Fearow")) {
            return R.drawable.img_fearow;
        }
        if (StringUtils.equals(pokemonName, "Arbok")) {
            return R.drawable.img_arbok;
        }
        if (StringUtils.equals(pokemonName, "Raichu")) {
            return R.drawable.img_raichu;
        }
        if (StringUtils.equals(pokemonName, "Sandslash")) {
            return R.drawable.img_sandlash;
        }
        if (StringUtils.equals(pokemonName, "Nidoqueen")) {
            return R.drawable.img_nidoqueen;
        }
        if (StringUtils.equals(pokemonName, "Nidoking")) {
            return R.drawable.img_nidoking;
        }
        if (StringUtils.equals(pokemonName, "Clefable")) {
            return R.drawable.img_clefable;
        }
        if (StringUtils.equals(pokemonName, "Ninetales")) {
            return R.drawable.img_ninetales;
        }
        if (StringUtils.equals(pokemonName, "Wigglytuff")) {
            return R.drawable.img_wigglytuff;
        }
        if (StringUtils.equals(pokemonName, "Globat")) {
            return R.drawable.img_golbat;
        }
        if (StringUtils.equals(pokemonName, "Vileplume")) {
            return R.drawable.img_vileplume;
        }
        if (StringUtils.equals(pokemonName, "Parasect")) {
            return R.drawable.img_parasect;
        }
        if (StringUtils.equals(pokemonName, "Venomoth")) {
            return R.drawable.img_venomoth;
        }
        if (StringUtils.equals(pokemonName, "Dugtrio")) {
            return R.drawable.img_dugtrio;
        }
        if (StringUtils.equals(pokemonName, "Persian")) {
            return R.drawable.img_persian;
        }
        if (StringUtils.equals(pokemonName, "Golduck")) {
            return R.drawable.img_golduck;
        }
        if (StringUtils.equals(pokemonName, "Primeape")) {
            return R.drawable.img_primeape;
        }
        if (StringUtils.equals(pokemonName, "Arcanine")) {
            return R.drawable.img_arcanine;
        }
        if (StringUtils.equals(pokemonName, "Poliwrath")) {
            return R.drawable.img_poliwrath;
        }
        if (StringUtils.equals(pokemonName, "Alakazam")) {
            return R.drawable.img_alakazam;
        }
        if (StringUtils.equals(pokemonName, "Machamp")) {
            return R.drawable.img_machamp;
        }
        if (StringUtils.equals(pokemonName, "Victreebell")) {
            return R.drawable.img_victreebel;
        }
        if (StringUtils.equals(pokemonName, "Tentacruel")) {
            return R.drawable.img_tentacruel;
        }
        if (StringUtils.equals(pokemonName, "Graveler")) {
            return R.drawable.img_graveler;
        }
        if (StringUtils.equals(pokemonName, "Golem")) {
            return R.drawable.img_golem;
        }
        if (StringUtils.equals(pokemonName, "Rapidash")) {
            return R.drawable.img_rapidash;
        }
        if (StringUtils.equals(pokemonName, "Slowbro")) {
            return R.drawable.img_slowbro;
        }
        if (StringUtils.equals(pokemonName, "Magneton")) {
            return R.drawable.img_magneton;
        }
        if (StringUtils.equals(pokemonName, "Dodrio")) {
            return R.drawable.img_dodrio;
        }
        if (StringUtils.equals(pokemonName, "Dewgong")) {
            return R.drawable.img_dewgong;
        }
        if (StringUtils.equals(pokemonName, "Muk")) {
            return R.drawable.img_muk;
        }
        if (StringUtils.equals(pokemonName, "Cloyster")) {
            return R.drawable.img_clyster;
        }
        if (StringUtils.equals(pokemonName, "Gengar")) {
            return R.drawable.img_gengar;
        }
        if (StringUtils.equals(pokemonName, "Hypno")) {
            return R.drawable.img_hypno;
        }
        if (StringUtils.equals(pokemonName, "Kingler")) {
            return R.drawable.img_kingler;
        }
        if (StringUtils.equals(pokemonName, "Electrode")) {
            return R.drawable.img_electorde;
        }
        if (StringUtils.equals(pokemonName, "Exeggutor")) {
            return R.drawable.img_exeggutor;
        }
        if (StringUtils.equals(pokemonName, "Marowak")) {
            return R.drawable.img_marowak;
        }
        if (StringUtils.equals(pokemonName, "Weezing")) {
            return R.drawable.img_weezing;
        }
        if (StringUtils.equals(pokemonName, "Rhydon")) {
            return R.drawable.img_rhydon;
        }
        if (StringUtils.equals(pokemonName, "Seadra")) {
            return R.drawable.img_seadra;
        }
        if (StringUtils.equals(pokemonName, "Seaking")) {
            return R.drawable.img_seaking;
        }
        if (StringUtils.equals(pokemonName, "Starmie")) {
            return R.drawable.img_starmie;
        }
        if (StringUtils.equals(pokemonName, "Gyarados")) {
            return R.drawable.img_gyarados;
        }
        if (StringUtils.equals(pokemonName, "Flareon")) {
            return R.drawable.img_flareon;
        }
        if (StringUtils.equals(pokemonName, "Jolteon")) {
            return R.drawable.img_jolteon;
        }
        if (StringUtils.equals(pokemonName, "Vaporeon")) {
            return R.drawable.img_vaporeon;
        }
        if (StringUtils.equals(pokemonName, "Omastar")) {
            return R.drawable.img_omastar;
        }
        if (StringUtils.equals(pokemonName, "Kabutops")) {
            return R.drawable.img_kabutops;
        }
        if (StringUtils.equals(pokemonName, "Dragonite")) {
            return R.drawable.img_dragonite;
        }
        return -1;
    }
}
