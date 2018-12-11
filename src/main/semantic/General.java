package main.semantic;

import main.Token;

import java.util.List;

public class General {

    public static void updateVar(List<Var> var, Type type){
        for (Var v: var) {
            v.setType(type);
        }
    }

    public static Type updateType(Token typeToken){
        Type returnType = Type.VOID;

        if (typeToken.toString().equals("int")){
            returnType = Type.INT;
        }

        else if (typeToken.toString().equals("string")){
            returnType = Type.STRING;
        }

        else if (typeToken.toString().equals("bool")){
            returnType = Type.BOOL;
        }
        else{
            System.err.println("Syntatic error unknown type of variable in parameters");
        }

        return returnType;
    }

    public static OperationType updateOperationType(Token typeToken){
        OperationType returnType = OperationType.VOID;

        if (typeToken.toString().equals("+")){
            returnType = OperationType.ARIT;
        }
        else if (typeToken.toString().equals("-")){
            returnType = OperationType.ARIT;
        }
        else if (typeToken.toString().equals("*")){
            returnType = OperationType.ARIT;
        }
        else if (typeToken.toString().equals("/")){
            returnType = OperationType.ARIT;
        }
        else if (typeToken.toString().equals("%")){
            returnType = OperationType.ARIT;
        }

        else if (typeToken.toString().equals(">")){
            returnType = OperationType.RELAC;
        }
        else if (typeToken.toString().equals(">=")){
            returnType = OperationType.RELAC;
        }
        else if (typeToken.toString().equals("<")){
            returnType = OperationType.RELAC;
        }
        else if (typeToken.toString().equals("<=")){
            returnType = OperationType.RELAC;
        }

        else if (typeToken.toString().equals("&&")){
            returnType = OperationType.LOGIC;
        }
        else if (typeToken.toString().equals("||")){
            returnType = OperationType.LOGIC;
        }
        else if (typeToken.toString().equals("!")){
            returnType = OperationType.LOGIC;
        }

        else if (typeToken.toString().equals("==")){
            returnType = OperationType.EQUALITY;
        }
        else if (typeToken.toString().equals("!=")){
            returnType = OperationType.EQUALITY;
        }

        else {
            System.out.println("Syntatic error unknown type of operation");
        }

        return returnType;
    }

}
