//Inherited buttonphone , to smartphone so u can derive its functions
public class smartphone extends buttonphone {
    public smartphone(String name, int num){
        super (name,num);
    }
    public void browse_internet (){
        System.out.println(name + "can browse internet");
    }
}
