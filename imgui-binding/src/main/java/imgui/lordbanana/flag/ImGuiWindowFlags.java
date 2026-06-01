package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImGui::Begin()
 */
@BindingSource
public final class ImGuiWindowFlags {
    private ImGuiWindowFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiWindowFlags_")
    public Void __;
}
