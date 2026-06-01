package imgui.lordbanana.extension.texteditor.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;
import imgui.lordbanana.binding.annotation.ExcludedSource;

@BindingSource
public final class TextEditorPaletteIndex {
    private TextEditorPaletteIndex() {
    }

    @BindingAstEnum(file = "ast-TextEditor.json", qualType = "TextEditor::PaletteIndex")
    public Void __;
}
