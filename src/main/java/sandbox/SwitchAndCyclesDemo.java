package sandbox;

public class SwitchAndCyclesDemo {
    public strictfp static void main(String[] args) {
        if (fun1()) {

        } else if (fun2()) {

        } else {

        }

        int age = 30;
        switch (age){
            case 20: {
                System.out.println("too yang!");
                break;
            }
            case 30:
                System.out.println("good enough"); break;
            case 40:
                System.out.println("too yang!"); break;
            default:
                System.out.println("default");

        }
    }

    private static boolean fun2() {
        return false;
    }

    private static boolean fun1() {
        return false;
    }
}
