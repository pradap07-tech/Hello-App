public class Usecase6 {
    public static void main(String[] args) {
        String greetingTarget;

        if (args == null || args.length == 0) {
            greetingTarget = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            
            
            if (nameBuilder.length() > 0) {
                greetingTarget = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                greetingTarget = "World";
            }
        }

        
        System.out.println("Hello, " + greetingTarget + "!");
    }
}