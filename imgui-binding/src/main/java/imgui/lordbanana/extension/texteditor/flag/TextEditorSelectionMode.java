package imgui.lordbanana.extension.texteditor.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class TextEditorSelectionMode {
    private TextEditorSelectionMode() {
    }

    @BindingAstEnum(file = "ast-TextEditor.json", qualType = "TextEditor::SelectionMode")
    public Void __;
}
