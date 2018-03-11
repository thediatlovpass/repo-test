package headfirstjava;

public class NinetyNineBottles {

    public static void main(String[] args) {
        System.out.println("There are : 99 bottles on the wall");
        int bottles = 99;

        while (bottles > 0) {
            if (bottles == 1) {
                System.out.println("There is : one bottle on the wall");
            }

            bottles -= 1;

            System.out.println("We put off one bottle of the wall");
            System.out.println("There are : " + bottles + " bottles on the wall");

        }
    }
}