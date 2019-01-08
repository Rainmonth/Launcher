/*
 * Copyright (C) 2015 The Android Open Source Project
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

import com.randy.launcher.Launcher;

/**
 * An interface to get callbacks during a launcher transition.
 *
 * @author randy
 */
public interface LauncherTransitionable {
    /**
     * Launcher过渡准备
     *
     * @param l           Launcher引用
     * @param animated    是否启用动画
     * @param toWorkspace 目标Workspace
     */
    void onLauncherTransitionPrepare(Launcher l, boolean animated, boolean toWorkspace);

    /**
     * Launcher过渡开始
     *
     * @param l           Launcher引用
     * @param animated    是否启用动画
     * @param toWorkspace 目标Workspace
     */
    void onLauncherTransitionStart(Launcher l, boolean animated, boolean toWorkspace);

    /**
     * Launcher过渡进度
     *
     * @param l Launcher引用
     * @param t 当前进度值
     */
    void onLauncherTransitionStep(Launcher l, float t);

    /**
     * Launcher过渡结束
     *
     * @param l           Launcher引用
     * @param animated    是否启用动画
     * @param toWorkspace 目标Workspace
     */
    void onLauncherTransitionEnd(Launcher l, boolean animated, boolean toWorkspace);
}
