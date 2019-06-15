package org.academiadecodigo.whiledlings.whiledbits.gfx;

public enum GfxPadsPics {
    YELLOW("./resources/images/buttons/pads/padYellow.png"),
    BLUE("./resources/images/buttons/pads/padBlue.png"),
    PINK("./resources/images/buttons/pads/padPink.png");

    private String path;

    GfxPadsPics(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
