package main.semantic;

import java.util.List;

public class SymbolList {

    private SymbolList parentList = null;
    private List<Var> varList = null;
    private List<SubProgram> subProgramList = null;


    public void addToList(Var var){
        this.varList.add(var);
    }

    public SymbolList(SymbolList parentList, List<Var> varList) {
        this.parentList = parentList;
        this.varList = varList;
    }

    public Var getVar (String id){
        Var returnVal = null;
        for (Var v: this.varList)
            if (v.getId().equals(id))
                returnVal = v;

        return returnVal;
    }

    public SubProgram getSubProgram (String id){
        SubProgram returnSub = null;
        if (subProgramList != null) {
            for (SubProgram s : this.subProgramList) {
                System.out.println(s.getId());
                if (s.getId().equals(id))
                    returnSub = s;
            }
        }
        return returnSub;
    }

    public SymbolList getParentList() {
        return this.parentList;
    }

    public void setParentList(SymbolList parentList) {
        this.parentList = parentList;
    }

    public List<Var> getVarList() {
        return this.varList;
    }

    public void setVarList(List<Var> varList) {
        this.varList = varList;
    }

    public List<SubProgram> getSubProgramList() {
        return subProgramList;
    }

    public void setSubProgramList(List<SubProgram> subProgramList) {
        this.subProgramList = subProgramList;
    }
}
