public class Main {
  public static void main(String[] args) {
    String name = "John-michael ", lastname = "Koch", num1 = "69420";
    System.out.println("Hello " + name + " " + num1);
    //im not sure why i decided to write it like that but whatever
    int num = 60,num2 = 9;
    System.out.println(num+num2);
    //im just practicing a little bit of everything i learned
    short shortynum = 17800;
    System.out.println(shortynum + " i used short variable for that number but dont think ill use it much as int is the most common to see due to not needing higher number values than it is maxed at");
    float flyingnum = 1.7f;
    int num3 = 66;
    float flyingnum2 = 1.3f;
    double doublenum = 1.3e7d;
    System.out.println(flyingnum + flyingnum2 + num3 + " there woldnt be a .0 at the end but later in the code i was testing and changed the int to double" + doublenum + " i did that scientific notation with a double variable not a float but you can use a float integer");
    //i used an integer and two floats and added them :)
    double num3switch = num3;
    System.out.println(num3switch);
System.out.println("but when making the variable into a smaller one i must put it like this ----- int myInt = (int) myDouble");
String txt ="doing length checks length of string";
System.out.println(txt + " the length of that text is " + txt.length() + "characters and i can get where a word is in a text the word length is " + (txt.indexOf("length")) + " spaces in");
System.out.println("my name is" + name.concat(lastname));
System.out.println("quotes in the text \"yay\" this is fun let\'s do more lol");
System.out.println("this is a backslash \\");
System.out.println("i can make a new line \n or idk what a carrige return is so lets see \r or i can do tab \t yay");
System.out.println("\f");
//Java uses the + operator for both addition and concatenation.
//If you add a number and a string, the result will be a string concatenation
System.out.println("whats bigger 69 or 420...\t...well with Math.max()we can find out its " + Math.max(69,420) + " now lets find out whats lower with Math.min...\t...well look its " + Math.min(69,420));
System.out.println("the sqaure root of 69420 is" + Math.sqrt(69420) + " i did Math.sqrt() to get my answer");
System.out.println("to get absolute value do Math.abs...\t...the absolute value of -68.999 is " + Math.abs(-68.999) + " cool number right?");
int randomNum = (int)(Math.random() * 101);  // 0 to 100
System.out.println(randomNum);  
if (randomNum == 69) System.out.println("you randomly generated 69 good job");
//im not sure if the if statement above works so if you get 69 pls screenshot it and send it to me
if (69 > 420){System.out.println(randomNum);
}
 else if (420 == 69) {System.out.println(randomNum);
 }
  else {System.out.println(6969);
  }
  int testing = 17;
  String truthfull = (testing < 7) ?"testing smaller than 7" : "testing bigger than 7";
  System.out.println(truthfull);
int casie = 2;
switch (casie) {
  case 1:
  System.out.println("casie one");
  break; 
  case 2:
  System.out.println("casie two");
  break;
  default:System.out.println("casie default");
}
int lama = 1;
while (lama < 10) {System.out.println("buttifull");
lama++;
//Do not forget to increase the variable used in the condition, otherwise the loop will never end!
}
int dowhile = 10;
do {System.out.println(dowhile);
dowhile++;
}
while (dowhile < 10);
for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}
System.out.println("ive been testing loops and stuff mostly that why theres all those numbers and 9 buttifulls");
String[] guns = {"ak-47", "ar-15", ".50cal"};
System.out.println("i put multiple things assighned to the string gun here is the gun you get when you put in 0 " + guns[0]);
  System.out.println("here is how many strings i assigned to guns" + guns.length);
 for (int gunned = 0; gunned < guns.length; gunned++) {
 System.out.println(guns[gunned]); 
 }
 String[] calibers = {".50", "9mm", "45acp", "22long rifle", "40 smith and wesson"};
 for (String cal : calibers) {
   System.out.println(cal);
 }
 System.out.println('there we go i did that lol')
 int[][] seption = { {1, 2, 9}, {69, 420} };
int lel = seption[1][1];
System.out.println(lel);
}
}

  }
  }