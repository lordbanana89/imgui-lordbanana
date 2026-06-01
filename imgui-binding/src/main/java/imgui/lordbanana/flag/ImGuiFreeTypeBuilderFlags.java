package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiFreeTypeBuilderFlags {
    private ImGuiFreeTypeBuilderFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_freetype.json", qualType = "ImGuiFreeTypeBuilderFlags", sanitizeName = "ImGuiFreeTypeBuilderFlags_")
    public Void __;
}
