package imgui.lordbanana.extension.imnodes.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * This enum controls the way the attribute pins behave.
 */
@BindingSource
public final class ImNodesAttributeFlags {
    private ImNodesAttributeFlags() {
    }

    @BindingAstEnum(file = "ast-imnodes.json", qualType = "ImNodesAttributeFlags_")
    public Void __;
}
