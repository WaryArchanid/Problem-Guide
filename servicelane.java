/*
*   HackerRank Service Lane Problem 
*/
public class Solution {
 static int serviceLane(int i, int j, int[]arr){
     ArrayList<Integer> list = new ArrayList<>();
     list.clear();
     for(int lane = i ; lane <= j ; lane++){
             list.add(arr[lane]);
     }
     return (Collections.min(list));
 }
 
 public static void main(String [] args){
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int t = in.nextInt();
     int[] width = new int[n];
     for(int width_i = 0 ; width_i < n ; width_i++){
         width[width_i] = in.nextInt();
     }
     
     for(int test = 0 ; test < t ; test++){
         int i = in.nextInt();
         int j = in.nextInt();
         int result = serviceLane(i,j,width);
         System.out.println(result);
     }
 }
}
