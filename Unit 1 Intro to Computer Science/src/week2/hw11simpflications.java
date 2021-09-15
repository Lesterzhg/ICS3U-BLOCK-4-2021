package week2;

public class hw11simpflications {
    public static void main(String[] args){
        //a 
        double x=5.5, y=3.0, /*z=-2.0, */xy, yx, xy1, yx1, c1, c2, c3, h1, h2, i1, i2, i3, j1, j3;
        int i=5, j=4, k=3, ij, f1, f2, f3, f4, j2;
        ij = i-j;
        i1 = i-ij;
        i2 = i-i1;
        i3 = i-i2;

        System.out.println("a: "+i3);
        System.out.println("a-og: "+ (i-(i-(i-(i-j)))));

        //c
        xy= x-y;
        yx= y-x;
        xy1= x-y;
        yx1 = y-x;
        c1=xy-yx;
        c2=yx1-c1;
        c3=xy1-c2;
        
        System.out.println("c: "+c3);
        System.out.println("c-og: "+((x-y)-((y-x)-((x-y)-(y-x)))));

        //f
        f1= i*j;
        f2= (int)f1/k;
        f3= f2+i;
        f4= f3-j;
        System.out.println("f: "+f4);
        System.out.println("f-og: "+(i*j/k+i-j));



        //h

        h1 = j/k;
        h2 = i+h1;
        System.out.println("h: "+h2);
        System.out.println("h-og: "+((double)i+j/k));

        //i
        i1= (int)x/k;
        i2= x/k;
        i3= i1-i2;
        System.out.println("i: "+i3);
        System.out.println("i-og: "+((int)x/k-x/k));

        //j
        j1 =(double)i/j;
        j2 =i/j;
        j3 = j1-j2;

        System.out.println("j: "+j3);
        System.out.println("j-og: "+((double)i/j-(double)(i/j)));
    }
    
}
