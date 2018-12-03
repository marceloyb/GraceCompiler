package main.semantic;

import main.exceptions.UndeclaredId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolList {

    private SymbolList parentList = null;
    private List<Var> symbolList;
//    private Map<Var, String> symbolList = new HashMap<>();

    public Content getValue(String id){
        Content value = null;
        for(Var v: this.symbolList) {
            if (v.getContent().getContent().toString().equals(id))
                value = v.getContent();
        }

        return value;
    }

    public SymbolList(SymbolList parentList, List<Var> symbolList) {
        this.parentList = parentList;
        this.symbolList = symbolList;
    }

    public SymbolList getParentList() {
        return parentList;
    }

    public void setParentList(SymbolList parentList) {
        this.parentList = parentList;
    }

    public List<Var> getSymbolList() {
        return symbolList;
    }

    public void setSymbolList(List<Var> symbolList) {
        this.symbolList = symbolList;
    }

}
