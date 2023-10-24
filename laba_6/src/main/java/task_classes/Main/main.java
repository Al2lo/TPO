package task_classes.Main;

import task_classes.Customer;

public class main {
    public static void main(String[] args) {
        task_classes.Customer[] customers = Customer.getArrCustomer();

        for (var item:
                customers) {
            System.out.println(item.toString());
        }
        System.out.println("\nсписок покупателей в алфавитном порядке: ");
        Customer.getCustomersToAlfavit(customers);
        System.out.println("\n список покупателей, у которых номер кредитной карточки находится в заданном интервале: ");
        Customer.getListCustomersCurdInterval(customers,3,777777);

    }

}