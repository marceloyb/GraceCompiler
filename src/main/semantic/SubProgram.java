package main.semantic;

import java.util.ArrayList;
import java.util.List;

public class SubProgram {

    private String id = null;
    private Type type = Type.VOID;
    private SymbolList subSymbolList = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SymbolList getSubSymbolList() {
        return subSymbolList;
    }

    public void setSubSymbolList(SymbolList subSymbolList) {
        this.subSymbolList = subSymbolList;
    }
}
