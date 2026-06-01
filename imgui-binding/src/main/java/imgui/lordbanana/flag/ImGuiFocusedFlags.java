package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImGui::IsWindowFocused()
 */
@BindingSource
public final class ImGuiFocusedFlags {
    private ImGuiFocusedFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiFocusedFlags_")
    public Void __;
}
