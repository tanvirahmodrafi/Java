// Source code is decompiled from a .class file using FernFlower decompiler.
public class lab {
    public lab() {
    }
 
    public static int pranto(int var0) {
       return var0;
    }
 
    public static void main(String[] var0) {
       marks(65);
    }
 
    static void abc(int var0) {
       System.out.println(var0);
    }
 
    static void ifs(int var0, int var1) {
       System.out.println(var0 + var1);
    }
 
    static void ifg(int var0, int var1, int var2) {
       System.out.println(var0 * var1 * var2);
    }
 
    static int mul(int var0, int var1, int var2) {
       return var0 * var1 * var2;
    }
 
    static boolean GenZ(int var0) {
       return 1997 < var0;
    }
 
    static void marks(int var0) {
       if (var0 >= 80) {
          System.out.println("A+");
       } else if (var0 >= 75) {
          System.out.println("A");
       } else if (var0 >= 70) {
          System.out.println("A-");
       } else if (var0 >= 65) {
          System.out.println("B+");
       } else {
          System.out.println("F");
       }
 
    }
 }
 