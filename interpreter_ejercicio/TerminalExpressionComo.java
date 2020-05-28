package interpreter_ejercicio;

public class TerminalExpressionComo extends AbstractExpresion {

    public  TerminalExpressionComo(int sizeToRemove){
        this.sizeToRemove=sizeToRemove;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")) {
        	context.output = context.output + "Given";
            context.input= context.input.substring(this.sizeToRemove);
        }
    }
}
