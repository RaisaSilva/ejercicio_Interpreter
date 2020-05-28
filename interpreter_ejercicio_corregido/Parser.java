package interpreter_ejercicio_corregido;

import java.util.ArrayList;

public class Parser {
    // no terminal expresion
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;

    public Parser(String s) {
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")) {
           switch (token){
               case "Como":
                   parseTree.add(new TerminalExpressionComo(token.length()));
                   break;
               case "Para":
                   parseTree.add(new TerminalExpressionPara(token.length()));
                   break;
               case "Quiero":
                   parseTree.add(new TerminalExpressionQuiero(token.length()));
                   break;
               default:
                   parseTree.add(new TerminalExpressionAny(token.length()));
                   break;
           }
        }
    }

    public String evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);

        return context.output;
    }
}
