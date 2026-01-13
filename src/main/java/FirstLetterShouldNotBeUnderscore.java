public class FirstLetterShouldNotBeUnderscore implements Expression {

    private final FirstLetterShouldNotBeLowerCase firstLetterShouldNotBeLowerCase = new FirstLetterShouldNotBeLowerCase();

    @Override
    public String interpret(String context) {
        if (context.startsWith("_")) {
            context = context.substring(1);
        }
        return firstLetterShouldNotBeLowerCase.interpret(context);
    }

}
