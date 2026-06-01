package imgui.lordbanana.extension.nodeditor.flag;

import imgui.lordbanana.binding.annotation.BindingAstEnum;
import imgui.lordbanana.binding.annotation.BindingSource;

@BindingSource
public final class NodeEditorPinKind {
    private NodeEditorPinKind() {
    }

    @BindingAstEnum(file = "ast-imgui_node_editor.json", qualType = "ax::NodeEditor::PinKind")
    public Void __;
}
