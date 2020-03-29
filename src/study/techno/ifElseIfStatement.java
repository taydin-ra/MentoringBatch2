package study.techno;

public class ifElseIfStatement {
    public static void main(String[] args) {
        String myStr="Java is cool";

        if(myStr.isEmpty()){
            System.out.println("you need to write something");
        }else if(myStr.endsWith("m")){
            System.out.println("There is m end of the string");
        }else{
            System.out.println("You have a cool java string");
        }
        System.out.println("this will be execute all the time because it is out of if body");
    }
}
