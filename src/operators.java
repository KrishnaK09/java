public class operators {
    public static void main(String[] args){
        //post increments

//        int x=5;
//        int y=6;
//        int z=x++;
//        System.out.println(z);


        // **  Comparisn operators **


//        int x =25;
//        int y =15;
//        int a=23;
//        int b=19;
//        System.out.println(x==y);
//        System.out.println(x!=a);
//        System.out.println(x<=b);
//        System.out.println(x>=b);
//        System.out.println(y==a);
//        System.out.println(a>=y);
//        System.out.println(y!=a);



        // ** LOgical operator  **
        // AND , OR , NOT

        int x =20;
        int y =25;
        int a=20;
        int b=19;
        int c=25;

        System.out.println(x==y||x<=a);
        System.out.println((x>=y) && a>=b);
        System.out.println((x==a)&& x>b);
        System.out.println((x!=a)||y==b);
        System.out.println(b!=y||x<=a);
        System.out.println(x!=c&&x<=a);
        System.out.println(!(x!=c && x<=a));

    }
}
