import java.util.*;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Queue Interface using ArrayDeque
        Queue<String> patientQueue = new ArrayDeque<>();

        int choice;

        do {
            System.out.println("\n========== HOSPITAL MANAGEMENT SYSTEM ==========");
            System.out.println("1. Register Patient");
            System.out.println("2. View Next Patient");
            System.out.println("3. Treat Patient");
            System.out.println("4. Display Waiting List");
            System.out.println("5. Total Waiting Patients");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    String patient = "ID: " + id +
                                     " | Name: " + name +
                                     " | Age: " + age +
                                     " | Disease: " + disease;

                    patientQueue.offer(patient);

                    System.out.println("Patient Registered Successfully!");
                    break;

                case 2:
                    if (patientQueue.isEmpty()) {
                        System.out.println("No patients are waiting.");
                    } else {
                        System.out.println("\nNext Patient:");
                        System.out.println(patientQueue.peek());
                    }
                    break;

                case 3:
                    if (patientQueue.isEmpty()) {
                        System.out.println("No patients to treat.");
                    } else {
                        System.out.println("\nPatient Treated:");
                        System.out.println(patientQueue.poll());
                    }
                    break;

                case 4:
                    if (patientQueue.isEmpty()) {
                        System.out.println("Waiting list is empty.");
                    } else {
                        System.out.println("\n----- Waiting Patients -----");
                        for (String p : patientQueue) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total Waiting Patients: " + patientQueue.size());
                    break;

                case 6:
                    System.out.println("Thank you for using Hospital Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}