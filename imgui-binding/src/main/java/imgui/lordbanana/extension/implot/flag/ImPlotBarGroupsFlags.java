package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotBarGroupsFlags {
    private ImPlotBarGroupsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotBarGroupsFlags_")
    public Void __;
}
