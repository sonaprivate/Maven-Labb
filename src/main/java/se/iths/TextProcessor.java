package se.iths;

public class TextProcessor {

    public String toUpperCase(String hello, String world) {
        return hello + world;
    }

    public String toLowerCase(String hello, String world) {
        return hello + world;
    }

   public String StringBuilder(String Wonderland) {
        StringBuilder sb = new StringBuilder("Wonderland");
        return Wonderland;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Wonderland");
        sb.reverse();
        System.out.println(sb);
    }

}
