package main.semantic;


import java.util.ArrayList;
import java.util.List;

public class Var{

    public String id;
    public Type type = Type.VOID;
    private boolean composed = false;
    private Content content = null;
    // var can be a array of vars, fazer adaptaçao
    private List<Content> contentOfVars = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public List<Content> getContentOfVars() {
        return contentOfVars;
    }

    public void setContentOfVars(List<Content> contentOfVars) {
        this.contentOfVars = contentOfVars;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
//        if (contentOfVars != null){
//            for (Content c: contentOfVars){
//                if (c != null && c.getType() != type){
//                    c.setType(type);
//                }
//            }
//        }
        this.type = type;
    }

    public boolean isComposed() {
        return composed;
    }

    public void setComposed(boolean composed) {
        this.composed = composed;
    }

}

