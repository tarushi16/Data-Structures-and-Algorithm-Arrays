class parent {
    public parent() {
        System.out.println("parent constructor");
    }
}
class child extends parent{
     public child(){
         System.out.println("child constructor");
     }
}
public class inheritanceConstructor {
    public static void main(String[] args) {
        child p = new child();
    }
}
