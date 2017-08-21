
strictfp class DataTypes{
public static void main(String args[]){
// Primitive Data Type or Value Data Type
// Non - Decimal
byte x = (byte)131 ; 
short y = 1000;
int z = 90000;
long t = 1000L;
t = z;
System.out.println("X is "+x);

float b = 10.20f;
double bb = 10.2345677;
System.out.println("B is "+b);

boolean g1 = true;  // 1 , false - 0
char ee[] = {'न','म','त'};  //2 Byte (UNICOde Chars)
for(int i = 0; i<ee.length; i++){
System.out.println(ee[i]);
}
}
}