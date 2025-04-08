public class DemoPrimitive {

  public static void main(String[] args) {
    // ! Primitives(int, double, long, short, byte, float, boolean, char)
    // 8 primitive in total for java

    // Primitives for integer byte, short, int, long)
    int x = 10;
    // range from -128 to 127
    byte b1 = 10;
    byte b2 = -128;
    byte b3 = 127;
    // byte b4 = 128;
    System.out.println(b1);

    //-32XXX to 32XXX
    short s1 = 10;
    short s2 = -32768;
    short s3 = 32767;
    // short s4 = 32768;
    System.out.println(s1);

    //long 
    // 10 is an int value
    // !-2147483649 -> illegal int value
    // !-2147483649L -> long value
    
    long L1 = 10;
    long L2 = -2147483649L;
    System.out.println(L1);

    // long + int -> long
    L1 = L1 +100;
    System.out.println(L1);

    int x3 = 0;
     x3 = x3 + 1;
    System.out.println(x3);
    
    // b3 + 

    //Double, float
    // !9.5 is a double value
    // ! 9.5b is a double value
    // ! 9.5f is a float value
    // !
    

    // boolean
    boolean b10 = true;
    b10 = false;

    int age = 66;
     boolean isEldery = age > 65;
    System.out.println(isEldery);

    // char
    // Store singe charater
    //"a" -> char value
    // c1 -> char variable
    char c1= 'a'
    char c2

}
  
}
