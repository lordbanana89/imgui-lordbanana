package imgui.lordbanana.internal.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiAxis {
    private ImGuiAxis() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiAxis", sanitizeName = "ImGuiAxis_")
    public Void __;
}
