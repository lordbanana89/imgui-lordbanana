package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImGui::BeginTabItem()
 */
@BindingSource
public final class ImGuiTabItemFlags {
    private ImGuiTabItemFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTabItemFlags_")
    public Void __;
}
