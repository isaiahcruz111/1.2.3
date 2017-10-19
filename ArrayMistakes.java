public class ArrayMistakes
{
    public static void main()
    {
      
      int[] nums = {6, 9, 14, 19};
      nums = new int[4];
      
      System.out.println("Forward");
      for (int i = 1; i <= nums.length; i++) 
      {
         System.out.print(": " + nums[i]);
      }

      System.out.println("Backward" );
      for (int i = nums.length; i > 0; i--) 
      {
         System.out.print( ": " + nums[i]);
      }
    }
}