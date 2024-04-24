public class APLine
{
  private int a, b, c;
  public APLine(int aN, int bN, int cN){
  a=aN;
  b=bN;
  c=cN;
  }
  public double getSlope(){
    return (double) -a/b;
  }

  public boolean isOnLine(int x, int y){
    return (ax + by + c)==0;
  }
}
