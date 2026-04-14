

public class Usecase5 {

    public static void main(String[] args) {
        String greetingTarget;

        if (args.length == 0) {
            greetingTarget = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            for (String currentName : args) {
                
                if (nameBuilder.length() > 0) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(currentName);
            }
            greetingTarget = nameBuilder.toString();
        }

        System.out.println("Hello, " + greetingTarget + "!");
    }
}