package org.academiadecodigo.whiledlings.whiledbits.sound;

public enum SoundsGroup {
    DRUMS("/resources/sounds/padSounds/drums/"),
    SAMPLES("/resources/sounds/padSounds/samples/"),
    NOTES("/resources/sounds/padSounds/notes/"),
    MCS("/resources/sounds/padSounds/mcs/");

    private String path;

    SoundsGroup(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
