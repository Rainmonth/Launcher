package com.randy.launcher.ui.view.base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

/**
 * @author randy
 */
public class LauncherRootView extends InsettableFrameLayout {
    public LauncherRootView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        setInsets(insets);
        return true; // I'll take it from here
    }
}