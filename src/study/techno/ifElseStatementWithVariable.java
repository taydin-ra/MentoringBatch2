package study.techno;

public class ifElseStatementWithVariable {
    public static void main(String[] args) {
        int myVar=9;

        if(myVar++<10){
            System.out.println(myVar+" Hello World");
        }else{
            System.out.println(myVar+ "Bye bye world");
        }
    }
}
