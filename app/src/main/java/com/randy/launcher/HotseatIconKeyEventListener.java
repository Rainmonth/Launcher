package com.randy.launcher;

import android.view.KeyEvent;
import android.view.View;

/**
 * A keyboard listener we set on all the hotseat buttons.
 */
public class HotseatIconKeyEventListener implements View.OnKeyListener {
    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return FocusHelper.handleHotseatButtonKeyEvent(v, keyCode, event);
    }
}
