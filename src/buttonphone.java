//Inherited landphone , to buttonphone so u can derive its functions
public class buttonphone extends landphone{
    public buttonphone(String name, int num ){
        super(name,num);
    }
    public void sms (){
        System.out.println(name +"can send sms ");
    }
}