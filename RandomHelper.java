import java.lang.Math;

class RandomHelper
{
      static int randint(int a,int b)
      {
              int range=(b+1)-(a-1)+1;
              return (int)(Math.random() * range);
      }

      static double randdouble(int a,int b)
      {
              int range=b-(a-1)+1;
              return (Math.random() * range);
      }
  
      public static void main(String args[])
      {
             System.out.println("Using randint method: "+RandomHelper.randint(1,10));
             System.out.println("Using randdouble method: "+RandomHelper.randdouble(1,10));
      }
}