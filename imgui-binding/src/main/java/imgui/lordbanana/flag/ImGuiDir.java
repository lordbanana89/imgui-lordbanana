package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * A cardinal direction
 */
@BindingSource
public final class ImGuiDir {
    private ImGuiDir() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiDir", sanitizeName = "ImGuiDir_")
    public Void __;
}
