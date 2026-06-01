package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Enumeration for PushStyleColor() / PopStyleColor()
 */
@BindingSource
public final class ImGuiCol {
    private ImGuiCol() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiCol_")
    public Void __;
}
