package study.techno;

public class ifElseStatementWithTrim {
    public static void main(String[] args) {
        String mystr = " ";
        mystr.trim();
        // System.out.println(mystr.isEmpty());

        if (mystr.isEmpty()) {
            System.out.println("Yes that is empty");
        }else if(mystr.equals("")){
            System.out.println("Yes there is nothing inside it");

        }else{
            System.out.println("Nope you forgot to assign it");
        }
    }
}
