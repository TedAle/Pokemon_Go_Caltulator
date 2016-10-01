package com.pgc.tedeschi.pokemongocaltulator.utils;

import com.pgc.tedeschi.pokemongocaltulator.R;

/**
 * Created by aless on 05/09/2016.
 */
public enum Pokemon {

    JOLTEON("Jolteon", PokeColor.YELLOW, R.drawable.img_jolteon, 200, 210),
    VAPOREON("Vaporeon", PokeColor.AZURE, R.drawable.img_vaporeon, 263, 273),
    FLAREON("Flareon", PokeColor.RED, R.drawable.img_flareon, 246, 254),
    BULBASAUR("Bulbasaur",PokeColor.GREEN_1, R.drawable.img_bulbasaur, 153, 158),
    IVYSAUR("Ivysaur",PokeColor.GREEN_2, R.drawable.img_ivysaur, 183, 252),
    CHARMANDER("Charmander",PokeColor.RED_1, R.drawable.img_charmander, 164, 170),
    CHARMELEON("Charmeleon",PokeColor.RED_2, R.drawable.img_charmeleon, 280, 304),
    SQUIRTLE("Squirtle",PokeColor.BLUE_1, R.drawable.img_squirtle, 135, 210),
    WARTORTLE("Wartortle",PokeColor.BLUE_2, R.drawable.img_wartortle, 189, 252),
    CATERPIE("Caterpie",PokeColor.GREEN_1, R.drawable.img_caterpie, 104, 108),
    METAPOD("Metapod",PokeColor.GREEN_2, R.drawable.img_metapod, 317, 409),
    WEEDLE("Weedle",PokeColor.GREEN_1, R.drawable.img_weedle, 106, 112),
    KAKUNA("Kakuna",PokeColor.GREEN_2, R.drawable.img_kakuna, 319, 383),
    PIDGEY("Pidgey",PokeColor.LIGHT_BROWN_1, R.drawable.img_pidgey, 171, 195),
    PIDGEOTTO("Pidgeotto",PokeColor.LIGHT_BROWN_2, R.drawable.img_pidgeotto, 295, 351),
    RATTATA("Rattata",PokeColor.LIGHT_BROWN_1, R.drawable.img_rattata, 252, 273),
    SPEAROW("Spearow",PokeColor.LIGHT_BROWN_1, R.drawable.img_fearow, 258, 281),
    EKANS("Ekans",PokeColor.VIOLET_1, R.drawable.img_ekans, 202, 227),
    PIKACHU("Pikachu",PokeColor.YELLOW_1, R.drawable.img_pikachu, 233, 238),
    SANDSHREW("Sandshrew",PokeColor.BROWN_1, R.drawable.img_sandshrew, 229, 276),
    NIDORAN_F("Nidoran F",PokeColor.VIOLET_1, R.drawable.img_nidoran_f, 162, 166),
    NIDORINA("Nidorina",PokeColor.VIOLET_2, R.drawable.img_nidorina, 286, 303),
    NIDORAN_M("Nidoran M",PokeColor.VIOLET_1, R.drawable.img_nidoran_m, 164, 170),
    NIDORINO("Nidorino",PokeColor.VIOLET_2, R.drawable.img_nidorino, 268, 316),
    CLEFAIRY("Clefairy",PokeColor.LIGHT_PINK_1, R.drawable.img_clefairy, 202, 214),
    VULPIX("Vulpix",PokeColor.RED_1, R.drawable.img_vulpix, 274, 281),
    JIGGLYPUFF("Jigglypuff",PokeColor.LIGHT_PINK_1, R.drawable.img_jigglypuff, 241, 247),
    ZUBAT("Zubat",PokeColor.VIOLET_1, R.drawable.img_zubat, 260, 367),
    ODDISH("Oddish",PokeColor.GREEN_1, R.drawable.img_oddish, 148, 151),
    GLOOM("Gloom",PokeColor.GREEN_2, R.drawable.img_gloom, 219, 231),
    PARAS("Paras",PokeColor.VIOLET_1, R.drawable.img_paras, 192, 202),
    VENONAT("Venonat",PokeColor.VIOLET_1, R.drawable.img_venonat, 185, 190),
    DIGLETT("Diglett",PokeColor.BROWN_1, R.drawable.img_diglett, 268, 277),
    MEOWTH("Meowth",PokeColor.LIGHT_BROWN_1, R.drawable.img_meowth, 198, 224),
    PSYDUCK("Psyduck",PokeColor.BLUE_1, R.drawable.img_psyduck, 215, 229),
    MANKEY("Mankey",PokeColor.LIGHT_BROWN_1, R.drawable.img_mankey, 217, 227),
    GROWLITHE("Growlithe",PokeColor.RED_1, R.drawable.img_growlithe, 227, 236),
    POLIWAG("Poliwag",PokeColor.BLUE_1, R.drawable.img_poliwag, 172, 177),
    POLIWHIRL("Poliwhirl",PokeColor.BLUE_2, R.drawable.img_poliwhirl, 326, 346),
    ABRA("Abra",PokeColor.LIGHT_VIOLET_1, R.drawable.img_abra, 136,195),
    KADABRA("Kadabra",PokeColor.LIGHT_VIOLET_2, R.drawable.img_kadabra, 190, 321),
    MACHOP("Machop",PokeColor.LIGHT_BROWN_1, R.drawable.img_machop, 162, 167),
    MACHOKE("Machoke",PokeColor.LIGHT_BROWN_2, R.drawable.img_machoke, 223, 283),
    BELLSPROUT("Bellsprout",PokeColor.GREEN_1, R.drawable.img_bellsprout, 154, 160),
    WEEPINBELL("Weepinbell",PokeColor.GREEN_2, R.drawable.img_weepinbell, 226, 254),
    TENTACOOL("Tentacool",PokeColor.BLUE_1, R.drawable.img_tentacool, 247, 260),
    GEODUDE("Geodude",PokeColor.GREY_1, R.drawable.img_geodude, 170, 176),
    GRAVELER("Graveler",PokeColor.GREY_2, R.drawable.img_graveler, 275, 302),
    PONYTA("Ponyta",PokeColor.RED_1, R.drawable.img_ponyta, 146, 150),
    SLOWPOKE("Slowpoke",PokeColor.LIGHT_VIOLET_1, R.drawable.img_slowpoke, 213, 224),
    MAGNEMITE("Magnemite",PokeColor.LIGHT_GREY_1, R.drawable.img_magnemite, 215, 218),
    DODUO("Doduo",PokeColor.LIGHT_BROWN_1, R.drawable.img_doduo, 219,229),
    SEEL("Seel",PokeColor.WHITE_1, R.drawable.img_seel,104,202),
    GRIMER("Grimer",PokeColor.VIOLET_1, R.drawable.img_grimer,200,244),
    SHELLDER("Shellder",PokeColor.BLUE_1, R.drawable.img_shellder,262,269),
    GASTLY("Gastly",PokeColor.DARK_VIOLET_1, R.drawable.img_gastly,175,183),
    HAUNTER("Haunter",PokeColor.DARK_VIOLET_2, R.drawable.img_haunter,264,329),
    DROWZEE("Drowzee",PokeColor.LIGHT_VIOLET_1, R.drawable.img_drowzee,206,209),
    KRABBY("Krabby",PokeColor.BLUE_1, R.drawable.img_krabby,231,241),
    VOLTORB("Voltorb",PokeColor.YELLOW_1, R.drawable.img_voltorb,198,202),
    EXEGGCUTE("Exeggcute",PokeColor.GREEN_1, R.drawable.img_exeggcute,268,318),
    CUBONE("Cubone",PokeColor.LIGHT_BROWN_1, R.drawable.img_cubone,165,167),
    KOFFING("Koffing",PokeColor.VIOLET_1, R.drawable.img_koffing,195,202),
    RHYHORN("Rhyhorn",PokeColor.LIGHT_BROWN_1, R.drawable.img_rhyhorn,190,191),
    HORSEA("Horsea",PokeColor.BLUE_1, R.drawable.img_horsea,219,223),
    GOLDEEN("Goldeen",PokeColor.BLUE_1, R.drawable.img_goldeen,214,224),
    STARYU("Staryu",PokeColor.BLUE_1, R.drawable.img_staryu,231,242),
    MAGIKARP("Magikarp",PokeColor.BLUE_1, R.drawable.img_magikarp,1010,1180),
    OMANYTE("Omanyte",PokeColor.GREY_1, R.drawable.img_omanyte,199,212),
    KABUTO("Kabuto",PokeColor.GREY_1, R.drawable.img_kabuto,197,237),
    DRATINI("Dratini",PokeColor.LIGHT_BLUE_1, R.drawable.img_dratini,178,185),
    DRAGONAIR("Dragonair",PokeColor.LIGHT_BLUE_2, R.drawable.img_dragonair,361,384);

    private String name;
    private PokeColor color;
    private int img;
    private int evoCpMin;
    private int evoCpMax;

    Pokemon(String name, PokeColor color, int img, int evoCpMin, int evoCpMax) {
        this.name = name;
        this.color = color;
        this.img = img;
        this.evoCpMin = evoCpMin;
        this.evoCpMax = evoCpMax;
    }

    public String getName() {
        return name;
    }

    public PokeColor getColor() {
        return color;
    }

    public int getImg() {
        return img;
    }

    public int getEvoCpMin() {
        return evoCpMin;
    }

    public int getEvoCpMax() {
        return evoCpMax;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", img=" + img +
                ", evoCpMin=" + evoCpMin +
                ", evoCpMax=" + evoCpMax +
                '}';
    }
}
