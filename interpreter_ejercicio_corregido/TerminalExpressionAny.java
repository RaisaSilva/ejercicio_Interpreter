package interpreter_ejercicio_corregido;

public class TerminalExpressionAny extends AbstractExpresion {
	
	public  TerminalExpressionAny(int sizeToRemove){
        this.sizeToRemove=sizeToRemove;
	}

	@Override
    public void interpreter(Context context) {
            String value=context.input.substring(0,this.sizeToRemove);
            context.output = context.output + value+" " ;
            context.input = context.input.substring(value.length());
      }
}

