public class Company {
    public static void main(String[] args) {

        Worker worker1 = new Worker("John", "Smith", 34);
        Worker worker2 = new Worker("Mary", "Sweet", 50);

        System.out.println("Company worker: " + worker1.getName() + " " + worker1.getSurname() + " " + worker1.getAge());
    }
}
