public class lab {
    public static int pranto(int a){
        return a;
    }
    public static void main(String[] args) {
        marks(65);
    }
    static void abc(int a){
        System.out.println(a);
    }
    static void  ifs(int a , int b){
        System.out.println(a+b);
    }
    static void ifg(int a, int b, int c){
        System.out.println(a*b*c);
    }
    static int mul(int a , int b,int c){
        return(a*b*c);
    }
    static boolean GenZ(int a ){
        return(1997<a);
    }
    static void marks(int a){
        if(a>=80){
            System.out.println("A+");
        }else if(a>=75){
            System.out.println("A");
        }else if(a>=70){
            System.out.println("A-");
        }else if(a>=65){
            System.out.println("B+");
        }else{
            System.out.println("F");
        }
    }
}
