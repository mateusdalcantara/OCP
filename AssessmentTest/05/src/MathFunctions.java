public class MathFunctions { //What is the result of the following program?
    public static void addToInt(int x, int amountToAdd){
        x = x + amountToAdd % -; //Resposta: Compiler erro on line 3
        //O operador % exige que você forneça dois operandos numéricos.
        // Depois do operador %, não há um número válido,
        // mas sim um símbolo -, o que é sintaticamente incorreto.
    }

    public static void main(String[] args){
        var a = 15;
        var b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }
}
