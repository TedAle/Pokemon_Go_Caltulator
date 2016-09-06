package com.pgc.tedeschi.pokemongocaltulator.utils;

/**
 * Created by aless on 05/09/2016.
 */
public enum Pokemon {

    JOLTEON("Jolteon", PokeColor.YELLOW),
    VAPOREON("Vaporeon", PokeColor.AZURE),
    FLAREON("Flareon", PokeColor.RED),
    BULBASAUR("Bulbasaur",PokeColor.GREEN_1),
    IVYSAUR("Ivysaur",PokeColor.GREEN_2),
    CHARMANDER("Charmander",PokeColor.RED_1),
    CHARMELEON("Charmeleon",PokeColor.RED_2),
    SQUIRTLE("Squirtle",PokeColor.BLUE_1),
    WARTORTLE("Wartortle",PokeColor.BLUE_2),
    CATERPIE("Caterpie",PokeColor.GREEN_1),
    METAPOD("Metapod",PokeColor.GREEN_2),
    WEEDLE("Weedle",PokeColor.GREEN_1),
    KAKUNA("Kakuna",PokeColor.GREEN_2),
    PIDGEY("Pidgey",PokeColor.LIGHT_BROWN_1),
    PIDGEOTTO("Pidgeotto",PokeColor.LIGHT_BROWN_2),
    RATTATA("Rattata",PokeColor.LIGHT_BROWN_1),
    SPEAROW("Spearow",PokeColor.LIGHT_BROWN_1),
    EKANS("Ekans",PokeColor.VIOLET_1),
    PIKACHU("Pikachu",PokeColor.YELLOW_1),
    SANDSHREW("Sandshrew",PokeColor.BROWN_1),
    NIDORAN_F("Nidoran F",PokeColor.VIOLET_1),
    NIDORINA("Nidorina",PokeColor.VIOLET_2),
    NIDORAN_M("Nidoran M",PokeColor.VIOLET_1),
    NIDORINO("Nidorino",PokeColor.VIOLET_2),
    CLEFAIRY("Clefairy",PokeColor.LIGHT_PINK_1),
    VULPIX("Vulpix",PokeColor.RED_1),
    JIGGLYPUFF("Jigglypuff",PokeColor.LIGHT_PINK_1),
    ZUBAT("Zubat",PokeColor.VIOLET_1),
    ODDISH("Oddish",PokeColor.GREEN_1),
    GLOOM("Gloom",PokeColor.GREEN_2),
    PARAS("Paras",PokeColor.VIOLET_1),
    VENONAT("Venonat",PokeColor.VIOLET_1),
    DIGLETT("Diglett",PokeColor.BROWN_1),
    MEOWTH("Meowth",PokeColor.LIGHT_BROWN_1),
    PSYDUCK("Psyduck",PokeColor.BLUE_1),
    MANKEY("Mankey",PokeColor.LIGHT_BROWN_1),
    GROWLITHE("Growlithe",PokeColor.RED_1),
    POLIWAG("Poliwag",PokeColor.BLUE_1),
    POLIWHIRL("Poliwhirl",PokeColor.BLUE_2),
    ABRA("Abra",PokeColor.LIGHT_VIOLET_1),
    KADABRA("Kadabra",PokeColor.LIGHT_VIOLET_2),
    MACHOP("Machop",PokeColor.LIGHT_BROWN_1),
    MACHOKE("Machoke",PokeColor.LIGHT_BROWN_2),
    BELLSPROUT("Bellsprout",PokeColor.GREEN_1),
    WEEPINBELL("Weepinbell",PokeColor.GREEN_2),
    TENTACOOL("Tentacool",PokeColor.BLUE_1),
    GEODUDE("Geodude",PokeColor.GREY_1),
    GRAVELER("Graveler",PokeColor.GREY_2),
    PONYTA("Ponyta",PokeColor.RED_1),
    SLOWPOKE("Slowpoke",PokeColor.LIGHT_VIOLET_1),
    MAGNEMITE("Magnemite",PokeColor.LIGHT_GREY_1),
    DODUO("Doduo",PokeColor.LIGHT_BROWN_1),
    SEEL("Seel",PokeColor.WHITE_1),
    GRIMER("Grimer",PokeColor.VIOLET_1),
    SHELLDER("Shellder",PokeColor.BLUE_1),
    GASTLY("Gastly",PokeColor.DARK_VIOLET_1),
    HAUNTER("Haunter",PokeColor.DARK_VIOLET_2),
    DROWZEE("Drowzee",PokeColor.LIGHT_VIOLET_1),
    KRABBY("Krabby",PokeColor.BLUE_1),
    VOLTORB("Voltorb",PokeColor.YELLOW_1),
    EXEGGCUTE("Exeggcute",PokeColor.GREEN_1),
    CUBONE("Cubone",PokeColor.LIGHT_BROWN_1),
    KOFFING("Koffing",PokeColor.VIOLET_1),
    RHYHORN("Rhyhorn",PokeColor.LIGHT_BROWN_1),
    HORSEA("Horsea",PokeColor.BLUE_1),
    GOLDEEN("Goldeen",PokeColor.BLUE_1),
    STARYU("Staryu",PokeColor.BLUE_1),
    MAGIKARP("Magikarp",PokeColor.BLUE_1),
    OMANYTE("Omanyte",PokeColor.GREY_1),
    KABUTO("Kabuto",PokeColor.GREY_1),
    DRATINI("Dratini",PokeColor.LIGHT_BLUE_1),
    DRAGONAIR("Dragonair",PokeColor.LIGHT_BLUE_2);

    private String name;
    private PokeColor color;


    Pokemon(String name, PokeColor color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public PokeColor getColor() {
        return color;
    }
}
