package interpreter_ejercicio_corregido;

public class TerminalExpressionPara extends AbstractExpresion {
	public TerminalExpressionPara(int sizeToRemove) {
		this.sizeToRemove = sizeToRemove;
	}

	@Override
	public void interpreter(Context context) {
		if (context.input.startsWith("Para")) {
			context.output = context.output + "Then";
			context.input = context.input.substring(this.sizeToRemove);
		}
	}
}
