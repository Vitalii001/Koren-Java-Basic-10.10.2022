public class Person {
    public String personInfo (String name, String secondName, String city, String phoneNumber) {
        String humanData = " Позвонить гражданину "+name + secondName +" из города " + city +" можно по номеру " + phoneNumber;
        System.out.println(humanData);
        return humanData;

    }
}


