//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class A {
    public void get(int a){
        System.out.println("Class A");
    }
}

 class B extends A {
    public void get(int b){
        System.out.println("CLass B");
    }
    public static void main(String[] args) {
        B b1 = new B();
        b1.get(10);



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}