//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        DOG D = new DOG();
        D.makesound();
        Cat C = new Cat();
        C.makesound();
        Area react = new Area();
        react.setLength(2);
        react.setBreadth(16);
        System.out.println("Length :"+react.getLength());
        System.out.println("Breadth :"+react.getBreadth());
        System.out.println("Area :"+react.getArea());
        Star S = new Labour();
        S.printInfo();
        Lion L =new Lion();
        L.makesound();
        }
    }