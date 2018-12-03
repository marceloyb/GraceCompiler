package main.semantic;

import java.util.List;

public class General {

    public static void updateVar(List<Var> var, Type type){
        for (Var v: var) {
            v.setType(type);
        }
    }
}
