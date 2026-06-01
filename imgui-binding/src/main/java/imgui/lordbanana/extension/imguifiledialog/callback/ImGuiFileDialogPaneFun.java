package imgui.lordbanana.extension.imguifiledialog.callback;

import imgui.lordbanana.binding.annotation.ExcludedSource;

@ExcludedSource
public abstract class ImGuiFileDialogPaneFun {
    public abstract void accept(String filter, long userDatas, boolean canContinue);
}
