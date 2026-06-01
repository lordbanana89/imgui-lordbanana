package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotLocation {
    private ImPlotLocation() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotLocation_")
    public Void __;
}
