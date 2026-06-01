package imgui.lordbanana.internal.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiFocusRequestFlags {
    private ImGuiFocusRequestFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiFocusRequestFlags_")
    public Void __;
}
