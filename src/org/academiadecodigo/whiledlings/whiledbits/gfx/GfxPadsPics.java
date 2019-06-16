package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.whiledlings.whiledbits.Game;

public enum GfxPadsPics {
    YELLOW(Game.resourcesPathImages + "buttons/pads/padYellow.png"),
    BLUE(Game.resourcesPathImages + "buttons/pads/padBlue.png"),
    PINK(Game.resourcesPathImages + "buttons/pads/padPink.png");

    private String path;

    GfxPadsPics(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
