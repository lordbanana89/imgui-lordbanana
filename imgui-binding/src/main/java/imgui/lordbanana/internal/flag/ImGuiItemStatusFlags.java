package imgui.lordbanana.internal.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public class ImGuiItemStatusFlags {
    private ImGuiItemStatusFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiItemStatusFlags_")
    public Void __;
}
