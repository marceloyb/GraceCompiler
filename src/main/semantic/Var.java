package main.semantic;


import java.util.ArrayList;
import java.util.List;

public class Var{

    private Type type = Type._void;
    private boolean composed = false;
    private Content content = null;
    // var can be a array of vars
    private List<Content> contentOfVars = new ArrayList<>();


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (contentOfVars != null){
            for (Content c: contentOfVars){
                if (c != null && c.getType() != type){
                    c.setType(type);
                }
            }
        }
    }

    public boolean isComposed() {
        return composed;
    }

    public void setComposed(boolean composed) {
        this.composed = composed;
    }

}

