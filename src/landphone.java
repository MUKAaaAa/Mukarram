public class landphone {
    //Attribute
    String name;
    int num;

    //Constructor
    public landphone(String name, int num){
        this.name = name;
        this.num =num;

    }
    //Method
    public void call(){
        System.out.println(name + "can call");
    }
}