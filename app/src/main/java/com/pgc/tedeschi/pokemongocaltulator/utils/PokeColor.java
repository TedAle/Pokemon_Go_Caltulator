package com.pgc.tedeschi.pokemongocaltulator.utils;

/**
 * Created by aless on 05/09/2016.
 */
public enum PokeColor {
    WHITE_1("white", "#FFFFFF"),

    YELLOW("yellow", "#CAE021"),
    YELLOW_1("yellow", "#CAE021"),

    GREEN_1("green", "#00BF00"),
    GREEN_2("green", "#006400"),

    RED("red", "#FB4040"),
    RED_1("red", "#E76767"),
    RED_2("red", "#E53636"),

    GREY_1("grey", "#B4B4B4"),
    GREY_2("grey", "#818181"),

    LIGHT_PINK_1("light_pink", "#FFABAB"),

    LIGHT_BROWN_1("light_brown", "#E7AC70"),
    LIGHT_BROWN_2("light_brown", "#A57B50"),
    BROWN_1("brown", "#634930"),

    AZURE("azure", "#66B2FF"),

    LIGHT_BLUE_1("light_blue", "#00B8FF"),
    LIGHT_BLUE_2("light_blue", "#3232FF"),
    BLUE_1("blue", "#A9E3FF"),
    BLUE_2("blue", "#00ACFF"),

    LIGHT_VIOLET_1("light_violet", "#CAC8FF"),
    LIGHT_VIOLET_2("light_violet", "#8D8CB2"),
    VIOLET_1("violet", "#9691FF"),
    VIOLET_2("violet", "#605CA3"),
    DARK_VIOLET_1("dark_violet", "#706DA1"),
    DARK_VIOLET_2("dark_violet", "#4E4C70"),

    LIGHT_GREY_1("light_grey", "#CACACA"),
    ;


    private final String id;
    private final String hex;

    PokeColor(String id, String hex) {
        this.id = id;
        this.hex = hex;
    }

    public String getHex() {
        return this.hex;
    }

    public String getId() {
        return this.id;
    }
}
