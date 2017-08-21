class BigO{
public static void main(String args[]){
long startTime = System.currentTimeMillis();
String temp ="";
Runtime r = Runtime.getRuntime();  // Singleton 
System.out.println("Total Memory "+r.totalMemory());
System.out.println("Free Memory "+r.freeMemory());
System.out.println("Used Memory "+(r.totalMemory() - r.freeMemory()));
for(int i = 1; i<=100000; i++){
 //temp = "Hello Java ";
 temp = new String("Hello Java ");
}
System.out.println("Total Memory "+r.totalMemory());
System.out.println("Free Memory "+r.freeMemory());
System.out.println("Used Memory "+(r.totalMemory() - r.freeMemory()));
long endTime = System.currentTimeMillis();
System.out.println("Time Taken "+(endTime-startTime));
}
}