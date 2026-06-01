package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * A sorting direction
 */
@BindingSource
public final class ImGuiSortDirection {
    private ImGuiSortDirection() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiSortDirection", sanitizeName = "ImGuiSortDirection_")
    public Void __;
}
