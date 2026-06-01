package imgui.lordbanana.extension.imguiknobs.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiKnobVariant {
    private ImGuiKnobVariant() {
    }

    @BindingAstEnum(file = "ast-imgui-knobs.json", qualType = "ImGuiKnobVariant_")
    public Void __;
}
