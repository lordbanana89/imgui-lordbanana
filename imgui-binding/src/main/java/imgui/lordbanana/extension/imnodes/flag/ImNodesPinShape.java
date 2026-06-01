package imgui.lordbanana.extension.imnodes.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * This enum controls the way attribute pins look.
 */
@BindingSource
public final class ImNodesPinShape {
    private ImNodesPinShape() {
    }

    @BindingAstEnum(file = "ast-imnodes.json", qualType = "ImNodesPinShape_")
    public Void __;
}
