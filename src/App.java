public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.age = 20;
        client.name = "Yusmery";
        client.cellPhone = 3187202579L;
        client.credit = 5000000L;
        System.out.println(client.age);
        System.out.println(client.name);
        System.out.println(client.cellPhone);
        System.out.println(client.credit);

    }
}

class Persona {
    int age;
    String name;
    long cellPhone;
}

class Client extends Persona {
    long credit;
}

class employee extends Persona {
    String salary;
}