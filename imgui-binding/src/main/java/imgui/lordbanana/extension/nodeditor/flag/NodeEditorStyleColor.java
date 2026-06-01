package imgui.lordbanana.extension.nodeditor.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class NodeEditorStyleColor {
    private NodeEditorStyleColor() {
    }

    @BindingAstEnum(file = "ast-imgui_node_editor.json", qualType = "ax::NodeEditor::StyleColor", sanitizeName = "StyleColor_")
    public Void __;
}
