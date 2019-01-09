# Launcher 定义的接口文件反洗
## 定义的接口
Launcher中定义了几个比较重要的接口，很多UI控件同时实现了其中的接口。这里主要介绍的接口文件如下：
- DragSource

    - AllAppsContainerView，所有APP列表
    - Workspace，工作空间
    - Folder，文件夹
    - WidgetContainerView，Widget列表

- DropTarget

    - InfoDropTarget，查看APP信息
    - UninstallDropTarget，卸载APP
    - DeleteDropTarget，删除APP快捷方式
    - Folder，APP 文件夹
    - Workspace，Launcher工作空间

    由此可见，Folder、Workspace既可以是Drag动作的发起者，也可以是Drop动作的接受者，在UI表现上来说就是既可以拖动Folder里面的图标，也可以往Folder中添加图标，Workspace也是同样的道理

- DragScroller

### DragSource

### DragTarget

### DragScroller

## 定义的数据接口

- ItemInfo
  - FolderInfo
  - ShortCutInfo
  - AppInfo

## 定义的视图控件

### Workspace

### Hotseat

### CellLayout



