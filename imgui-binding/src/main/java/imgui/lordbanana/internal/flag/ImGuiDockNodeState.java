package imgui.lordbanana.internal.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiDockNodeState {
    private ImGuiDockNodeState() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiDockNodeState", sanitizeName = "ImGuiDockNodeState_")
    public Void __;
}
