public class Company {
    public static void main(String[] args) {

        Worker[] workers = new Worker[3];
        String[] dataTable1 = {"John", "Mary", "William"};
        String[] dataTable2 = {"Smith", "Sweet", "Goodly"};
        int[] dataTable3 = {34, 43, 30};

        for (int i = 0; i < dataTable1.length; i++){
            workers[i] = new Worker();
            workers[i].name = dataTable1[i];
            workers[i].surname = dataTable2[i];
            workers[i].age = dataTable3[i];
        }

        for (int i = 0; i < dataTable1.length; i++){
            System.out.println("Company worker: " + workers[i].getName() + " "
                    + workers[i].getSurname() + " " + workers[i].getAge());
        }
    }
}

