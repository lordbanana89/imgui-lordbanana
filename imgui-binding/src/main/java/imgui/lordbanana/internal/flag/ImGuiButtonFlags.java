package imgui.lordbanana.internal.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiButtonFlags {
    private ImGuiButtonFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiButtonFlags_")
    public Void __;

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiButtonFlagsPrivate_", sanitizeName = "ImGuiButtonFlags_")
    public Void ___;
}
