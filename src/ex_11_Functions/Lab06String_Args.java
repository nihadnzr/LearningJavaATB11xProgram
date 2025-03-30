package ex_11_Functions;

public class Lab06String_Args {

    public static void main(String... args) {
        System.out.println("Number of arguments: " + args.length);

        // Loop through the arguments and print them
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
