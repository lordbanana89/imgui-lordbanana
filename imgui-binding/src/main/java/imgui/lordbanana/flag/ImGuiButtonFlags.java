package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiButtonFlags {
    private ImGuiButtonFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiButtonFlags_")
    public Void __;
}
