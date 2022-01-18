package task1;

public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Belt")
                .setAge(31)
                .setAddress("Brest")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Anton")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        Person sister = new PersonBuilder()
                .setName("Kate")
                .setSurname("Olsen")
                .setAge(-100)
                .build();
        System.out.println(sister);
    }
}



