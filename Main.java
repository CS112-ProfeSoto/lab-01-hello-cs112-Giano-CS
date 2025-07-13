public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        Main.printIntroduction();

        System.out.println("Do I like football? " + Main.isAlike("football"));

    }


    public static void printIntroduction() {
        System.out.println(
                "Hello, my name is Giano. I like soccer, skateboarding, snowboarding, videogames, and technology.");

    }
    

    public static boolean isAlike(String topic) {
        String myLikes = "I like soccer, skateboarding, snowboarding, videogames, and technology.";

        return myLikes.contains(topic);

        
    }
}