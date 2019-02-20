public class Armstrong{
  public static void main(String[] args) {
  int num = 371, orinum, rem, result = 0;
oriNum = num;
 while (oriNum!= 0)
  {
    rem = oriNum% 10;
      result += Math.pow(rem, 3);
       oriNum /= 10;}
        if(result == num)
         System.out.println("yes");
        else
         System.out.println("no");
    }
}
