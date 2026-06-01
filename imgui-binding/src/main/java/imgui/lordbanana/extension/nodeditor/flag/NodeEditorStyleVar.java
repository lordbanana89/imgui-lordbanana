package imgui.lordbanana.extension.nodeditor.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class NodeEditorStyleVar {
    private NodeEditorStyleVar() {
    }

    @BindingAstEnum(file = "ast-imgui_node_editor.json", qualType = "ax::NodeEditor::StyleVar", sanitizeName = "StyleVar_")
    public Void __;
}
