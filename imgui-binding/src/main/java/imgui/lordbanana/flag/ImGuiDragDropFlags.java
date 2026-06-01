package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImGui::BeginDragDropSource(), ImGui::AcceptDragDropPayload()
 */
@BindingSource
public final class ImGuiDragDropFlags {
    private ImGuiDragDropFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiDragDropFlags_")
    public Void __;
}
