class RefDemo{
public static void main(String args[]){
String name = "Amit".intern();
String name2 = "Amit".intern();
String name3 = new String("Amit").intern();
if(name == name3){
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}
}
}