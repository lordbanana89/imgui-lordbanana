package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for {@link imgui.lordbanana.ImGui#tableSetupColumn(String, int)}
 */
@BindingSource
public final class ImGuiTableColumnFlags {
    private ImGuiTableColumnFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTableColumnFlags_")
    public Void __;
}
