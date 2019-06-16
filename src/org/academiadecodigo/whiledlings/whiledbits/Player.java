package org.academiadecodigo.whiledlings.whiledbits;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.whiledlings.whiledbits.Game;
import org.academiadecodigo.whiledlings.whiledbits.menu.MenuHandler;
import org.academiadecodigo.whiledlings.whiledbits.pads.Pads;
import org.academiadecodigo.whiledlings.whiledbits.pads.PadsNotes;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class Player implements KeyboardHandler {

    private Game game;

    private MenuHandler menuHandler;
    private boolean menuSelected;

    private Keyboard keyboard;
    private KeyboardEvent[] padKey = new KeyboardEvent[10];
    private KeyboardEvent[] padKeyReleased = new KeyboardEvent[10];
    private KeyboardEvent[] menuKeys = new KeyboardEvent[4];
    private KeyboardEvent[] groupKey = new KeyboardEvent[4];
    private Pads drums, samples, notes, mcs;

    public Player(Pads drums, Pads samples, Pads notes, Pads mcs, Game game) {

        this.game = game;
        keyboard = new Keyboard(this);
        this.mcs = mcs;
        this.drums = drums;
        this.samples = samples;
        this.notes = notes;
        menuSelected = false;

    }

    public Player(MenuHandler menuHandler) {

        this.menuHandler = menuHandler;
        keyboard = new Keyboard(this);
        menuSelected = true;

    }

    public void init() {

        // Initialize Key Pressed

        if (menuSelected) {

            menuKeys[0] = new KeyboardEvent();
            menuKeys[0].setKey(KeyboardEvent.KEY_LEFT);
            menuKeys[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            menuKeys[1] = new KeyboardEvent();
            menuKeys[1].setKey(KeyboardEvent.KEY_RIGHT);
            menuKeys[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            menuKeys[2] = new KeyboardEvent();
            menuKeys[2].setKey(KeyboardEvent.KEY_SPACE);
            menuKeys[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            menuKeys[3] = new KeyboardEvent();
            menuKeys[3].setKey(KeyboardEvent.KEY_Q);
            menuKeys[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            keyboard.addEventListener(menuKeys[0]);
            keyboard.addEventListener(menuKeys[1]);
            keyboard.addEventListener(menuKeys[2]);
            keyboard.addEventListener(menuKeys[3]);

            return;
        }


        for (int i = 0; i < 10; i++) {
            padKey[i] = new KeyboardEvent();
            padKey[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            padKeyReleased[i] = new KeyboardEvent();
            padKeyReleased[i].setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        }

        padKey[0].setKey(KeyboardEvent.KEY_E);
        padKeyReleased[0].setKey(KeyboardEvent.KEY_E);

        padKey[1].setKey(KeyboardEvent.KEY_R);
        padKeyReleased[1].setKey(KeyboardEvent.KEY_R);

        padKey[2].setKey(KeyboardEvent.KEY_T);
        padKeyReleased[2].setKey(KeyboardEvent.KEY_T);

        padKey[3].setKey(KeyboardEvent.KEY_Y);
        padKeyReleased[3].setKey(KeyboardEvent.KEY_Y);

        padKey[4].setKey(KeyboardEvent.KEY_U);
        padKeyReleased[4].setKey(KeyboardEvent.KEY_U);


        padKey[5].setKey(KeyboardEvent.KEY_D);
        padKeyReleased[5].setKey(KeyboardEvent.KEY_D);

        padKey[6].setKey(KeyboardEvent.KEY_F);
        padKeyReleased[6].setKey(KeyboardEvent.KEY_F);

        padKey[7].setKey(KeyboardEvent.KEY_G);
        padKeyReleased[7].setKey(KeyboardEvent.KEY_G);

        padKey[8].setKey(KeyboardEvent.KEY_H);
        padKeyReleased[8].setKey(KeyboardEvent.KEY_H);

        padKey[9].setKey(KeyboardEvent.KEY_J);
        padKeyReleased[9].setKey(KeyboardEvent.KEY_J);


        for (int i = 0; i < 10; i++) {
            keyboard.addEventListener(padKey[i]);
            keyboard.addEventListener(padKeyReleased[i]);
        }


        groupKey[0] = new KeyboardEvent();
        groupKey[0].setKey(KeyboardEvent.KEY_1);
        groupKey[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        groupKey[1] = new KeyboardEvent();
        groupKey[1].setKey(KeyboardEvent.KEY_2);
        groupKey[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        groupKey[2] = new KeyboardEvent();
        groupKey[2].setKey(KeyboardEvent.KEY_3);
        groupKey[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        groupKey[3] = new KeyboardEvent();
        groupKey[3].setKey(KeyboardEvent.KEY_4);
        groupKey[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(groupKey[0]);
        keyboard.addEventListener(groupKey[1]);
        keyboard.addEventListener(groupKey[2]);
        keyboard.addEventListener(groupKey[3]);



    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        System.out.println("Key " + keyboardEvent.getKey() + " pressed.");

        if(menuSelected) {

            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_LEFT:
                    menuHandler.keyLeft();
                    break;
                case KeyboardEvent.KEY_RIGHT:
                    menuHandler.keyRight();
                    break;
                case KeyboardEvent.KEY_SPACE:
                    menuHandler.keySpace();
                    break;
                case KeyboardEvent.KEY_Q:
                    menuHandler.keyQ();
                    break;
            }
            return;
        }
        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_1:
                game.selectGroup(SoundsGroup.DRUMS);
                break;
            case KeyboardEvent.KEY_2:
                game.selectGroup(SoundsGroup.SAMPLES);
                break;
            case KeyboardEvent.KEY_3:
                game.selectGroup(SoundsGroup.NOTES);
                break;
            case KeyboardEvent.KEY_4:
                game.selectGroup(SoundsGroup.MCS);
                break;

            case KeyboardEvent.KEY_E:
                game.getSelectedPadGroup().padPressed(0);
                break;
            case KeyboardEvent.KEY_R:
                game.getSelectedPadGroup().padPressed(1);
                break;
            case KeyboardEvent.KEY_T:
                game.getSelectedPadGroup().padPressed(2);
                break;
            case KeyboardEvent.KEY_Y:
                game.getSelectedPadGroup().padPressed(3);
                break;
            case KeyboardEvent.KEY_U:
                game.getSelectedPadGroup().padPressed(4);
                break;

            case KeyboardEvent.KEY_D:
                game.getSelectedPadGroup().padPressed(5);
                break;
            case KeyboardEvent.KEY_F:
                game.getSelectedPadGroup().padPressed(6);
                break;
            case KeyboardEvent.KEY_G:
                game.getSelectedPadGroup().padPressed(7);
                break;
            case KeyboardEvent.KEY_H:
                game.getSelectedPadGroup().padPressed(8);
                break;
            case KeyboardEvent.KEY_J:
                game.getSelectedPadGroup().padPressed(9);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        System.out.println("Key " + keyboardEvent.getKey() + " released.");

        if(game.getSelectedPadGroup() instanceof PadsNotes) {

            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_E:
                    game.getSelectedPadGroup().padReleased(0);
                    break;
                case KeyboardEvent.KEY_R:
                    game.getSelectedPadGroup().padReleased(1);
                    break;
                case KeyboardEvent.KEY_T:
                    game.getSelectedPadGroup().padReleased(2);
                    break;
                case KeyboardEvent.KEY_Y:
                    game.getSelectedPadGroup().padReleased(3);
                    break;
                case KeyboardEvent.KEY_U:
                    game.getSelectedPadGroup().padReleased(4);
                    break;

                case KeyboardEvent.KEY_D:
                    game.getSelectedPadGroup().padReleased(5);
                    break;
                case KeyboardEvent.KEY_F:
                    game.getSelectedPadGroup().padReleased(6);
                    break;
                case KeyboardEvent.KEY_G:
                    game.getSelectedPadGroup().padReleased(7);
                    break;
                case KeyboardEvent.KEY_H:
                    game.getSelectedPadGroup().padReleased(8);
                    break;
                case KeyboardEvent.KEY_J:
                    game.getSelectedPadGroup().padReleased(9);
                    break;
            }
        }

    }
}
