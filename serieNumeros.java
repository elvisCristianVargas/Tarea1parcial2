

public class serieNumeros
{
    public int serien(int parametro){
        int a = 1;
        int b;
        int n = 1;
        System.out.print(" ");
        System.out.print(a + "  ");
        while (n < parametro){
            int i = 1;
            while ((n < parametro) && (i <= 3)) {
                b = a + i;
                a = b;
                i++;
                n++;
                System.out.print(b + " ");
            
            }
            if (n < parametro){
                 b = a + 2;
                 a = b;
                 n++;
                 System.out.print (b + " ");
            }
        }
        System.out.print (" ");
        System.out.print (" ");
        System.out.print (" ");
        return a;
    }
    
    public int padovan (int parametro){
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        System.out.print(num1 + " " + num2 + " " + num3 + "  ");
        for(int i = 1; i <= (parametro - 3);i ++){
            int aux = num3;
            num3 = num1 + num2;
            num1 = num2;
            num2 = aux;
            System.out.print(num3 + " ");
        }
        System.out.print (" ");
        System.out.print (" ");
        System.out.print (" ");
        return num3;
    }
}

