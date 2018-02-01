/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author Erik B.
 * @version 
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int w = h;

        for (int r=0; r<h; r++)
        {
            for (int c=0; c<w; c++)
            {
                if (r == 0 || r == h -1 || r+c == h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starXBox(int h)
    {
        int w = h;
    for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i == 0 || i==h-1 || j==0 || j==w-1 || i + j == h-1 || i == j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void twoStarBoxes(int h)
    {
        int w = h;
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
              if(i < h/2)
              {
                  if(j < w/2)System.out.print("*");
                  else System.out.print(" ");
              }
              else
              {
                  if(j >= w/2)System.out.print("*");
                  else System.out.print(" ");
              }  
            }
            System.out.println();
        }
    }
    
    public static void starTriangle(int h)
    {
        int w = h;
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if(i == j || i > j)System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void emptyTriangle(int h)
    {
       int w = h;
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if(i == j || j == 0 || i == h-1)System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
         
    }
    
    public static void starTriangleUR(int h)
    {
        int w = h;
        for(int i = 0; i < h; i ++)
        {
           for(int j = 0; j < w; j++)
           {
              if(i == j || i < j)System.out.print("*");
              else System.out.print(" ");
           }
           System.out.println();
        }
    }
    
    public static void isoscelesStarTriangle(int w)
    {
        
    }
    
    public static void checkerBoard(int h)
    {
        int w = h;
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if((j + (i%2))%2 == 0)System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void biggerCheckerBoard(int h)
    {
       
    }
    
    public static void upsideDownCheckeredTriangle(int w)
    {
        int start = 0;
        int end = w;
        int h = (w/2) + 1;
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if(j < start || j > end)System.out.print(" ");
                else if((j + (i%2))%2 == 0)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            start ++;
            end --;
        }
    }
    
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if (n < 2) return false;
        else if (n == 2)        return true;
        else if (n % 2==0) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     * returns the nth prime
     * 
     * 
     * @param nth the nth prime the function will return
     * @return returns the prime at the nth place
     */
    public static int nthPrime(int nth)
    {
        int numPrime = 0;
        int num = 1;
        while(numPrime != nth)
        {
            num ++;
            if(isPrime2(num))
            {
                numPrime ++;
            }
        }
        return num;
    }
    
    public static void primeStars(int h)
    {
        for(int i = 1; i < h; i++)
        {
            {
                int count = nthPrime(i);
                for(int j = 0; j < count; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
    
    public static void fibonacciStars(int h)
    {
        int a = 1;
        int b = 1; 
        int c = a + b;
        
        for(int i = 0; i < h; i ++)
        {
            int count = c;
            if(i == 0 || i == 1) count = 1;
            
            for(int j = 0; j < count; j++){
                System.out.print("*");
            }

            if(i != 0 && i != 1){
                a = b;
                b = c;
                c = a + b;
            }
            
            System.out.println();
        }
    }
    
    public static void starFlag()
    {
        int h = 14;
        int w = 36;
        for(int i = 0; i <= h; i++){
            for(int j = 0; j <= w; j++){
                if(i < 7)
                {
                    if(j < 17){
                        System.out.print("*");
                    }
                    else if(i%2 == 0){
                        System.out.print("R");
                    }
                }
                else if(i%2 == 0)
                {
                    System.out.print("R");
                }
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
            
    }
     
}