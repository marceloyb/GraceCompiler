package main.semantic;

public class Expression extends Content{

    private boolean Unary = false;

    public Expression(Type type, Object content, boolean unary) {
        super(type, content);
        Unary = unary;
    }

    public boolean isUnary() {
        return Unary;
    }

    public void setUnary(boolean unary) {
        Unary = unary;
    }
}
