class Hai{
static int a=10; //Super
}
class Hello extends Hai{
static int a=20; // Static 
void show(){
int a=30; // Local
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
}
class Lab408{
static public void main(String args[]){
Hello h= new Hello();
h.show();
}
}