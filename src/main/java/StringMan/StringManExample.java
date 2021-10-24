package StringMan;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManExample {


    short y;
    Short yy;
    int a;
    Integer aa;
    long b;
    Long bb;
    float c = 2.3f;
    Float cc;
    double d;
    Double dd;
    boolean f = true;
    Boolean ff;
    char g = 'd';
    Character gg;

   public void charMan(){
       String name = "David";
       char mi = 'T';
       char value = Character.toLowerCase(mi);
   }

   public void stringSub(){

       String str = "I like Houston";
       String str2 = "I don't like Houston";
       boolean value = str.startsWith("Fr");
       System.out.println(value);
       value = str.regionMatches(2,str2,8,4);
       System.out.println("partial matches : "+value);
       System.out.println(str.indexOf("J"));



       str = "and a one and two and a three";
       int position = str.indexOf("and",0);
       System.out.println("position "+position);
       int counter = 0;

       while(position != -1){

           counter++;
           position = str.indexOf("and",position+1);
       }

       System.out.println(" counter = "+counter);

       char[] chars = str.toCharArray();

       str = str.concat(" and four  ");
       System.out.println(str+" length "+str.length());
       System.out.println(str+" length "+str.trim().length());
       String value2 = String.valueOf(2.3);

       StringBuilder stringBuilder = new StringBuilder("and a one and two and a three");
       System.out.println("From stringbuilder "+stringBuilder.toString());
       stringBuilder.append(" and four");

       str2 = "David,Merry,Tom,Caleb";
       String[] strings = str2.split(",");
       StringTokenizer stringTokenizer = new StringTokenizer(str2,",");

//       Map map = new HashMap<String, List<Book>>();

   }

    public void strExample(){
      String value = "View the latest news and breaking news today for U.S., world, weather, entertainment, politics and health at CNN.com.";
      String[] values = value.split(" ");
      System.out.println(value.substring(5,8));
    }

    public  void display(){
        System.out.println("hello");
    }

    public void stringmatch(){
        String Str = new String("Java is easy to learn");

        System.out.print("Return Value :" );
        System.out.println(Str.matches("(.*)easy(.*)"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("easy"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Java(.*)"));

//        The expression “[a-zA-Z]” accepts any English alphabet.
//
//        The expression “[0-9&&[^35]]” accepts numbers except 3 and 5.

        String regex = "^[a-zA-Z0-9]*$";
        //Compiling the regular expression
        Pattern pattern = Pattern.compile(regex);
        //Retrieving the matcher object
        Matcher matcher = pattern.matcher("Hello#"); //Hello#
        if(matcher.matches()) {
            System.out.println("Match occurred");
        } else {
            System.out.println("Match not occurred");
        }


        regex = "[0-9&&[^35]]";
        //Compiling the regular expression
         pattern = Pattern.compile(regex);
        //Retrieving the matcher object
         matcher = pattern.matcher("111223333555689");
        int count = 0;
        while(matcher.find()) {
            count++;
        }
        System.out.println("Occurrences :"+count);

        String str = "Java example , split by StringTokenizer, created for testing";
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }


    }


    public static void main(String[] args) {
        StringManExample stringManExample = new StringManExample();
//        stringManExample.stringmatch();
        stringManExample.strExample();


    }
}


