package imgui.lordbanana.extension.imnodes.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImNodesStyleFlags {
    private ImNodesStyleFlags() {
    }

    @BindingAstEnum(file = "ast-imnodes.json", qualType = "ImNodesStyleFlags_")
    public Void __;
}
