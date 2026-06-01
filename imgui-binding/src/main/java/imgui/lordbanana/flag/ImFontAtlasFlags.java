package imgui.lordbanana.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

/**
 * Flags for ImFontAtlas build
 */
@BindingSource
public final class ImFontAtlasFlags {
    private ImFontAtlasFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImFontAtlasFlags_")
    public Void __;
}
