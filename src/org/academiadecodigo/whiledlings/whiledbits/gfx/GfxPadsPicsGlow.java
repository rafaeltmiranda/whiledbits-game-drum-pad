package org.academiadecodigo.whiledlings.whiledbits.gfx;

public enum GfxPadsPicsGlow {
    YELLOW("./resources/images/buttons/pads/padYellowGlow.png"),
    BLUE("./resources/images/buttons/pads/padBlueGlow.png"),
    PINK("./resources/images/buttons/pads/padPinkGlow.png");

    private String path;

    GfxPadsPicsGlow(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
