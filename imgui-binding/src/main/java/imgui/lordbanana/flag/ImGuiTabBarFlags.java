package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImGui::BeginTabBar()
 */
@BindingSource
public final class ImGuiTabBarFlags {
    private ImGuiTabBarFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTabBarFlags_")
    public Void __;
}
