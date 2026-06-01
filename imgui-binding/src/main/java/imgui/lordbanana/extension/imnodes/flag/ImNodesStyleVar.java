package imgui.lordbanana.extension.imnodes.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImNodesStyleVar {
    private ImNodesStyleVar() {
    }

    @BindingAstEnum(file = "ast-imnodes.json", qualType = "ImNodesStyleVar_")
    public Void __;
}
