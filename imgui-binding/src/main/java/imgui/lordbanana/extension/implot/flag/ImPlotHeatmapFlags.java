package imgui.lordbanana.extension.implot.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotHeatmapFlags {
    private ImPlotHeatmapFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotHeatmapFlags_")
    public Void __;
}
