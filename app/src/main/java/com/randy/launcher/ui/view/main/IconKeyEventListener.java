package com.randy.launcher.ui.view.main;

import android.view.KeyEvent;
import android.view.View;

import com.randy.launcher.util.helper.FocusHelper;

/**
 * A keyboard listener we set on all the workspace icons.
 */
public class IconKeyEventListener implements View.OnKeyListener {
    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return FocusHelper.handleIconKeyEvent(v, keyCode, event);
    }
}
