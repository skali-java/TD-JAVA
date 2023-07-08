import java.util.Scanner;

public class test {
    public static class tp {
        public static void main(String[] args) {
            class EqualsIgnoreCaseExample {
                public static void main(String args[]) {
                    String s1 = "french";
                    String s2 = "english";
                    String s3 = "spanich";
                    String s4 = "arabic";
                    System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
                    System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
                    System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
                }
            }
        }
    }
}