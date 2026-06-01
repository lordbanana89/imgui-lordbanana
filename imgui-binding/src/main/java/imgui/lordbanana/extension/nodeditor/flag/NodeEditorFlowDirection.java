package imgui.lordbanana.extension.nodeditor.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class NodeEditorFlowDirection {
    private NodeEditorFlowDirection() {
    }

    @BindingAstEnum(file = "ast-imgui_node_editor.json", qualType = "ax::NodeEditor::FlowDirection")
    public Void __;
}
