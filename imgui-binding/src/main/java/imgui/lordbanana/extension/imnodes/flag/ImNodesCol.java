package imgui.lordbanana.extension.imnodes.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImNodesCol {
    private ImNodesCol() {
    }

    @BindingAstEnum(file = "ast-imnodes.json", qualType = "ImNodesCol_")
    public Void __;
}
