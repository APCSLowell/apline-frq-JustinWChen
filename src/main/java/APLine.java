public class APLine
{
  /* your code here */
  private double a, b, c;
  public APLine (double a1, double b1, double c1){
  a = a1;
    b = b1;
    c = c1;
  }
  public double getSLope(){
return -a/b;
  }
  public boolean isOnline(int x, int y){
 if (a*x+b*y+c == 0)
   return true;
    else return false;
  }
  }
