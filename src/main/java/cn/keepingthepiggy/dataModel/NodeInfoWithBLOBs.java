package cn.keepingthepiggy.dataModel;

public class NodeInfoWithBLOBs extends NodeInfo {
    private String text;

    private String content;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}