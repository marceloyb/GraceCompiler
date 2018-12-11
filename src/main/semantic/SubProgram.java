package main.semantic;

import java.util.ArrayList;
import java.util.List;

public class SubProgram extends Var{

    private String id = null;
    private Type type = Type.VOID;
    private SymbolList subSymbolList = null;
    List<Var> parameterList = new ArrayList<Var>();
    List<Var> varList = new ArrayList<Var>();

    public List<Var> getVarList() {
        return varList;
    }

    public void setVarList(List<Var> varList) {
        this.varList = varList;
    }

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

    public List<Var> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<Var> parameterList) {
        this.parameterList = parameterList;
    }
}
