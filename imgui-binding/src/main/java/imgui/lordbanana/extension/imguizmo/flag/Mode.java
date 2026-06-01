package imgui.lordbanana.extension.imguizmo.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class Mode {
    private Mode() {
    }

    @BindingAstEnum(file = "ast-ImGuizmo.json", qualType = "ImGuizmo::MODE")
    public Void __;
}
