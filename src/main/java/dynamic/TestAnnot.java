package dynamic;

//@DoStuff
public class TestAnnot {
//    @DoStuff
    private int value = 99;
    
    @DoStuff
    public void aMethod() {
        System.out.println("This is aMethod");
    }

    @Override
    public String toString() {
        return "TestAnnot{" + "value=" + value + '}';
    }
    
}
