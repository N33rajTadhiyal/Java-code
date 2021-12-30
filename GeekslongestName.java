public class GeekslongestName {
    public static void main(String[] args) {
        String a[]={"Neeraj","Pikachu","tatara","makkhi"};
       String max =a[0];
      for(int i =1;i<a.length;i++)
      {
       if(max.length()<a[i].length())
       {
           max = a[i];
       }
      }

      System.out.println(max+" :is the longest name ");
    }
    
}
