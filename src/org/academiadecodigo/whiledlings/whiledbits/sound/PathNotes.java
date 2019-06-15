package org.academiadecodigo.whiledlings.whiledbits.sound;

public enum PathNotes {
    PAD_0(SoundsGroup.NOTES.getPath() + "note1.wav"),
    PAD_1(SoundsGroup.NOTES.getPath() + "note2.wav"),
    PAD_2(SoundsGroup.NOTES.getPath() + "note3.wav"),
    PAD_3(SoundsGroup.NOTES.getPath() + "note4.wav"),
    PAD_4(SoundsGroup.NOTES.getPath() + "note5.wav"),
    PAD_5(SoundsGroup.NOTES.getPath() + "note6.wav"),
    PAD_6(SoundsGroup.NOTES.getPath() + "note7.wav"),
    PAD_7(SoundsGroup.NOTES.getPath() + "note8.wav"),
    PAD_8(SoundsGroup.NOTES.getPath() + "note9.wav"),
    PAD_9(SoundsGroup.NOTES.getPath() + "note10.wav");

    private String path;

    PathNotes(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
