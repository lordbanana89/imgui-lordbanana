package imgui.lordbanana.extension.imnodes.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * This enum controls the minimap's location.
 */
@BindingSource
public final class ImNodesMiniMapLocation {
    private ImNodesMiniMapLocation() {
    }

    @BindingAstEnum(file = "ast-imnodes.json", qualType = "ImNodesMiniMapLocation_")
    public Void __;
}
