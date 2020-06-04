import java.util.Scanner;


public class Q8979 {

   static int n;
   static int k;



   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      n= sc.nextInt();
      k= sc.nextInt();
      Medal[] country = new Medal[n];

      for(int i=0;i<n;i++) {
         country[i] = new Medal();
         country[i].name= sc.nextInt();
         country[i].gold = sc.nextInt();
         country[i].silver = sc.nextInt();
         country[i].bronze = sc.nextInt();
      }
      sc.close();

      int result = CountryRank(country);
      System.out.println(result);
   }

   public static int CountryRank(Medal[] country) {
      int rank = 1;
      int answer = 0;
      for(int j=0;j<n;j++) {
         if(country[j].name == k)
            answer = j;
      }

      for(int i=0;i<n;i++) {
         if(country[i].gold>country[answer].gold)
            rank++;
         else if((country[i].gold==country[answer].gold)&&(country[i].silver>country[answer].silver))
            rank++;
         else if((country[i].gold==country[answer].gold)&&(country[i].silver==country[answer].silver)&&(country[i].bronze>country[answer].bronze))
            rank++;

      }
      return rank;

   }

   private static class Medal{
      int name;
      int gold;
      int silver;
      int bronze;


   }
}