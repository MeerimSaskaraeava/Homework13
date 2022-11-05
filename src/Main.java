import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] myLessons={"Java-8","English","Soft skills"};
        MyClass myClass1=new MyClass("Meerim","Saskaraeva", (byte) 39);
        MyClass myClass2=new MyClass(myLessons,"Besh barmak");

        System.out.println(myClass1.getMyName()+" "+myClass1.getMySurname()+" "+myClass1.getMyAge()+" "+ Arrays.toString(myLessons)+" "+myClass2.getMyFavouriteFood());
    }
}