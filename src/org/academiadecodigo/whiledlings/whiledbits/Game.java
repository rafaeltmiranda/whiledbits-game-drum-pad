package org.academiadecodigo.whiledlings.whiledbits;


import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxGamePad;
import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxMenu;
import org.academiadecodigo.whiledlings.whiledbits.menu.MenuHandler;
import org.academiadecodigo.whiledlings.whiledbits.pads.Pads;
import org.academiadecodigo.whiledlings.whiledbits.pads.PadsNotes;
import org.academiadecodigo.whiledlings.whiledbits.pads.PadsSample;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;


public class Game {

    private boolean inMenu = true;
    private MenuHandler menuHandler;
    private SoundsGroup selectedGroup;
    private Pads selectedPadGroup;
    private GfxGamePad gfxGamePad;
    private PadsSample drums;
    private PadsNotes samples;
    private PadsNotes notes;
    private Player player;

    public void startMenu(){
        inMenu = true;
        menuHandler = new MenuHandler(this);

    }


    public void startPad() {

        inMenu = false;
        gfxGamePad = new GfxGamePad();
        gfxGamePad.drawPad();

        drums = new PadsSample(SoundsGroup.DRUMS, gfxGamePad);
        samples = new PadsNotes(SoundsGroup.SAMPLES, gfxGamePad);
        notes = new PadsNotes(SoundsGroup.NOTES, gfxGamePad);

        selectGroup(SoundsGroup.DRUMS);

        player = new Player(drums, samples, notes, this);
        player.init();

    }

    public void selectGroup(SoundsGroup soundsGroup) {

        selectedGroup = soundsGroup;

        switch (selectedGroup) {
            case DRUMS:
                selectedPadGroup = drums;
                gfxGamePad.selectDrumGroup();
                redrawPadsGroupGfx(drums);
                break;
            case SAMPLES:
                selectedPadGroup = samples;
                gfxGamePad.selectSampleGroup();
                redrawPadsGroupGfx(samples);
                break;
            case NOTES:
                selectedPadGroup = notes;
                gfxGamePad.selectNotesGroup();
                redrawPadsGroupGfx(notes);
                break;
        }



    }

    public SoundsGroup getSelectedGroup() {
        return selectedGroup;
    }

    public Pads getSelectedPadGroup() {
        return selectedPadGroup;
    }

    private void redrawPadsGroupGfx(Pads pad) {

        for (int i=0; i<10; i++) {

            if (pad.activePad() != null) {
                if (pad.activePad()[i]) {
                    gfxGamePad.selectPad(i);
                    continue;
                }
                gfxGamePad.unselectPad(i);
            }

        }

    }

    public Player getPlayer() {
        return player;
    }

    public boolean isInMenu() {
        return inMenu;
    }

    public MenuHandler getMenuHandler() {
        return menuHandler;
    }
}
