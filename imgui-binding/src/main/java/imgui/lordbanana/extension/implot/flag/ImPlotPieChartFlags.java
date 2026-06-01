package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotPieChartFlags {
    private ImPlotPieChartFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotPieChartFlags_")
    public Void __;
}
