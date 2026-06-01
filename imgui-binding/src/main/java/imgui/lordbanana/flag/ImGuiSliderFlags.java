package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiSliderFlags {
    private ImGuiSliderFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiSliderFlags_")
    public Void __;
}
