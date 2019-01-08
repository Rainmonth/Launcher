/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.randy.launcher.impl;

/**
 * Handles scrolling while dragging
 * @author randy
 */
public interface DragScroller {
    /**
     * 左滑
     */
    void scrollLeft();

    /**
     * 右滑
     */
    void scrollRight();

    /**
     * The touch point has entered the scroll area; a scroll is imminent.
     * This event will only occur while a drag is active.
     *
     * @param x         x coordinate of the touch point
     * @param y         y coordinate of the touch point
     * @param direction The scroll direction
     * @return True if scroll area contains (x,y)
     */
    boolean onEnterScrollArea(int x, int y, int direction);

    /**
     * The touch point has left the scroll area.
     * NOTE: This may not be called, if a drop occurs inside the scroll area.
     *
     * @return True if touch point not in scroll area
     */
    boolean onExitScrollArea();
}
