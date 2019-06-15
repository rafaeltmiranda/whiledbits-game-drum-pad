package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public enum PathNotes {
    PAD_0(SoundsGroup.NOTES.getPath() + "0.wav"),
    PAD_1(SoundsGroup.NOTES.getPath() + "1.wav"),
    PAD_2(SoundsGroup.NOTES.getPath() + "2.wav"),
    PAD_3(SoundsGroup.NOTES.getPath() + "3.wav"),
    PAD_4(SoundsGroup.NOTES.getPath() + "4.wav"),
    PAD_5(SoundsGroup.NOTES.getPath() + "5.wav"),
    PAD_6(SoundsGroup.NOTES.getPath() + "6.wav"),
    PAD_7(SoundsGroup.NOTES.getPath() + "7.wav"),
    PAD_8(SoundsGroup.NOTES.getPath() + "8.wav"),
    PAD_9(SoundsGroup.NOTES.getPath() + "9.wav");

    private String path;

    PathNotes(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
