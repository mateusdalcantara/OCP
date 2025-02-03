//What is the result of executing the following code snippet?

public class zeroUm {
    public static void main(String[] args) {
        //in the book there is no method main, I suppose that, the author doesn't show it on the test

        final int score1 = 8, score2 = 3;
        Integer myScore = 7;
        var goal = switch (myScore) { //switch wait for the specific values, not null.
            case score1, score2, 7 -> "good";
            case Integer i when i < 10 -> "better";
            case Integer i when i >= 10 -> "best";
            default -> {
                yield "unknown";
            }
            case null -> "nope"; //this line doesn't compile, you can't set null directly on case
        };
        System.out.print(goal); //output: good

    }
}

//Answer: Line 48 does not compile

