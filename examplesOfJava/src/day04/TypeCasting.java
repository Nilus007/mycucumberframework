package day04;

public class TypeCasting {
    /*
    byte< short< int < long <float <double
   converting small data type to big data type called "Auto Widening and
   it is easy. this process is done automatically by java.
     */
    byte b1=12;
    short s1=b1;
    int i1=b1;
    float f1=b1;


    /*
    byte< short< int < long <float <double
    converting big data type to small data type is not done by java and
    converting big data type to small data type is done with coding by programmers.
    that operation named explicit narrowing casting.
     */
    short s2=1210;
    byte b2=(byte)s2;
}
