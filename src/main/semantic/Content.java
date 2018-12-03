package main.semantic;

public class Content {

    private Type type;
    private Object content;

    public Content(Type type, Object content) {
        this.type = type;
        this.content = content;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }


}
