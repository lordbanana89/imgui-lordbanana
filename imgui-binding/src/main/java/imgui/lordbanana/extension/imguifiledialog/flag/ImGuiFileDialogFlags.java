package imgui.lordbanana.extension.imguifiledialog.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiFileDialogFlags {
    private ImGuiFileDialogFlags() {
    }

    @BindingAstEnum(file = "ast-ImGuiFileDialog.json", qualType = "ImGuiFileDialogFlags_")
    public Void __;
}
