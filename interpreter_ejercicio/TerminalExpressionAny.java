package interpreter_ejercicio;

public class TerminalExpressionAny extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
            String value=context.input.split(" ")[0];
            context.output = context.output + value+" " ;
            context.input = context.input.substring(value.length());
      }
}

