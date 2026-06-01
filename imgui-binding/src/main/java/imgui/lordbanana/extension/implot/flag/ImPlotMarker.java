package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotMarker {
    private ImPlotMarker() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotMarker_")
    public Void __;
}
