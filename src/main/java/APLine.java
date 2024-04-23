public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine (int a1, int b1, int c1){
  a = a1;
    b = b1;
    c = c1;
  }
  public double getSLope(){
return -(double)a/b;
  }
  public boolean isOnline(int x, int y){
 if (a*x+b*y+c == 0)
   return true;
    else return false;
  }
  }
