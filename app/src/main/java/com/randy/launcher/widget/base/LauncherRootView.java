package com.randy.launcher.widget.base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

import com.randy.launcher.widget.base.InsettableFrameLayout;

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