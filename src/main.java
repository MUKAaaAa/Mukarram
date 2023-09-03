public class main {
    public static void main(String[] args) {
        //For int dont need double quotation -"- creating the object and inserting the value)
        landphone phone1 = new landphone("Telecom ",1010);
        //Called the method (object name + method name)
        phone1.call();

        buttonphone phone2 = new buttonphone("Nokia ",2020);
        phone2.call();
        phone2.sms();

        smartphone phone3 = new smartphone("Iphone ",3030);
        phone3.call();
        phone3.sms();
        phone3.browse_internet();
    }
}
