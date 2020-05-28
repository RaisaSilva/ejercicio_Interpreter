package interpreter_ejercicio_corregido;

public class TerminalExpressionQuiero extends AbstractExpresion {

	public TerminalExpressionQuiero(int sizeToRemove) {
		this.sizeToRemove = sizeToRemove;
	}

	@Override
	public void interpreter(Context context) {
		if (context.input.startsWith("Quiero")) {
			context.output = context.output + "When";
			context.input = context.input.substring(this.sizeToRemove);	
		} 
	}
}