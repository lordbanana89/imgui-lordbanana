package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImGui::TreeNodeEx(), ImGui::CollapsingHeader*()
 */
@BindingSource
public final class ImGuiTreeNodeFlags {
    private ImGuiTreeNodeFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTreeNodeFlags_")
    public Void __;
}
