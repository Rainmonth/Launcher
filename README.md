# Launcher
Launcher3 是谷歌Android 自带的一个应用，是一个比较综合的项目，包含了4大组件的应用，MVC模式的应用，以及大量的自定
义控件，是一个比较综合的项目，了解其运行原理不仅可以巩固Android开发的基础知识，还能定制自己需要的Launcher，希望往
UI方面拓展的开发同学可以好好研究下其实现，做出像MIUI、EMUI及Flyme这样的系统。
## 目标
- Launcher3 源码结构分析
- Launcher3 交互实现的基础--DragSource和DropTarget
- Launcher3 核心UI控件的分析
    - Workspace
    - CellLayout
    - BubbleTextView
- 自定义Launcher实现
- 其他细节处理
## 具体分析
### 结构分析
### UI控件分析
Workspace
CellLayout
BubbleTextView
### 如何自定义Launcher
自定义Launcher可以从哪些方面入手？
- 桌面的显示方式
- HotSeat的显示方式
- 文件夹的展示形式
- 额外的自定义Screen的自定义
- Indicator样式的自定义
- Workspace交互动画的自定义
- 显示图标的自定义（像Flyme主题商店中就提供了很多应用图标的自定义主题）
- 锁屏界面的自定义
> 思路：可以事先在Launcher中定义一个锁屏界面，然后监听锁屏事件，屏蔽系统锁屏处理，显示自定义锁屏界面，想很多音乐播
放器的锁屏播放界面就是如此

