package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImGui::InputText()
 */
@BindingSource
public final class ImGuiInputTextFlags {
    private ImGuiInputTextFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiInputTextFlags_")
    public Void __;
}
