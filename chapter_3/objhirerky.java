// Create a super class.
class A {
    A() { System.out.println("Inside A's constructor."); }  //here type A obj created first  after that B and then C 
}
// Create a subclass by extending class A.
class B extends A{
    B() {  // before calling this constructer there is extends A so it went to create obj of A
    System.out.println("Inside B's constructor.");
}
}
// Create another subclass by extending B.
class C extends B {
    C() {  // before calling this constructer there is extends B so it went to create obj of B
    System.out.println("Inside C's constructor."); }
}
class CallingCons {
    public static void main(String[] args) {
    C c=new C();  // yesma hamla c type ko obj banauna lagako so it went to create obj of C
}
}