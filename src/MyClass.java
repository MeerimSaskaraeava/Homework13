public class MyClass {
    String myName;
    String mySurname;
    byte myAge;
    String[] myLessons;
    String myFavouriteFood;

    public MyClass(String myName, String mySurname, byte myAge){
        this.myName=myName;
        this.mySurname=mySurname;
        this.myAge=myAge;
    }
    public MyClass(String[] myLessons,String myFavouriteFood){
        this.myLessons=myLessons;
        this.myFavouriteFood=myFavouriteFood;
    }
    String getMyName(){
        return myName;
    }
    String getMySurname(){
        return mySurname;
    }
    byte getMyAge(){
        return myAge;
    }
    String[] getMyLessons(){
        return myLessons;
    }
    String getMyFavouriteFood(){
        return myFavouriteFood;
    }
}
