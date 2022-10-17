
import java.util.ArrayList;
import java.util.Scanner;

public class PoisedDBMain {

    // Define variables
    static Scanner sc = new Scanner(System.in);

    // Define main function
    public static void main(String[] args) {
        Project currentProject = null;

        while (true) {
            // Request input from the user and store the response in a variable
            System.out.println("1. Create new Project\n2. Edit Existing Project\n3. Exit");
            String menuChoice = sc.nextLine();

            // Call relevant function based on user's input
            if (menuChoice.equals("1")) {
                currentProject = createProject();
                System.out.println(currentProject);

            } else if (menuChoice.equals("2")) {
                while (true) {
                    // if project  is found then display menu and save user input
                    System.out.println("1. Change Due Date\n2. Update Contractor Information\n3. Finalize Project\n4. exit\nSelection:");
                    String editChoice = sc.nextLine();

                    if (currentProject != null) {
                        // based on user input call the relevant function
                        if (editChoice.equals("1")) {
                            editDueDate(currentProject);
                        } else if (editChoice.equals("2")) {
                            updateContractor(currentProject);
                        } else if (editChoice.equals("3")) {
                            finaliseProject(currentProject);
                        }
                    } else if (currentProject == null) {
                        System.out.println("There are currently no projects to edit, try adding a project first!");
                    }

                    if (editChoice.equals("4")) {
                        System.out.println("Going back to main");
                        break;
                    }
                }
            } else if (menuChoice.equals("3")) {
                break;
            }
        }
    }

    private static Project createProject() {
        // Get input from the user
        System.out.println("Project number: ");
        String projNum = sc.nextLine();
        System.out.println("Project name: ");
        String projName = sc.nextLine();
        System.out.println("Building type: ");
        String buildingType = sc.nextLine();
        System.out.println("Building address: ");
        String buildingAddress = sc.nextLine();
        System.out.println("ERF number: ");
        String erf = sc.nextLine();
        System.out.println("Total fee: ");
        double totalFee = Double.parseDouble(sc.nextLine());
        System.out.println("Total amount paid to date: ");
        double totalPaid = Double.parseDouble(sc.nextLine());
        System.out.println("Deadline: ");
        String deadline = sc.nextLine();

        // Create architect, contractor and customer objects
        System.out.println("Architect details: ");
        Person architect = createPerson();
        System.out.println("Contractor details: ");
        Person contractor = createPerson();
        System.out.println("Customer details: ");
        Person customer = createPerson();
        // Create project object using information gathered from user and person object
        // Add project object
        return new Project(projNum, projName, buildingType, buildingAddress, erf, totalFee, totalPaid, deadline, architect, contractor, customer);
    }

    private static Person createPerson() {
        // Get input from the user
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Telephone number: ");
        String tel = sc.nextLine();
        System.out.println("Email address: ");
        String email = sc.nextLine();
        System.out.println("Physical address: ");
        String address = sc.nextLine();
        // Create A person object for architect, contractor and customer
        return new Person(name, tel, email, address);
    }


    private static void editDueDate(Project projectObj) {
        // Get information from the user
        System.out.println("New due date: ");
        String newDueDate = sc.nextLine();
        // User setter to change the project information
        projectObj.setDeadline(newDueDate);
        System.out.println(projectObj);
        // Inform user that the update was successful
        System.out.println("Update success.\n");
    }

    private static void updateContractor(Project projectObj) {

        // Request option from user and store in a variable
        System.out.println("1. Change Email\n2. Change Tell NO\n3. Change Physical Address\n4. exit\nSelection: ");
        String contractorEditChoice = sc.nextLine();

        // Based on user choice, request the relevant information from user and user relevant setters to change values
        // conditional body to update information

        if (contractorEditChoice.equals("1")) {
            System.out.println("Updated email address: ");
            String newEmail = sc.nextLine();
            projectObj.contractor.setEmail(newEmail);
            System.out.println(projectObj.contractor);
            // Inform user that the update was successful
            System.out.println("Update success.");

        } else if (contractorEditChoice.equals("2")) {
            System.out.println("Updated telephone number: ");
            String newTel = sc.nextLine();
            projectObj.contractor.setTelephone(newTel);
            System.out.println(projectObj.contractor);
            // Inform user that the update was successful
            System.out.println("Update success.");

        } else if (contractorEditChoice.equals("3")) {
            System.out.println("Updated address: ");
            String newAddress = sc.nextLine();
            projectObj.contractor.setAddress(newAddress);

        } else if (contractorEditChoice.equals("4")) {
            System.out.println("Going to main");
        } else {
            System.out.println("Incorrect option");
        }
    }

    private static void finaliseProject(Project projectObj) {
        // Determine if there is any outstanding fee using getters and setters
        if (projectObj.getFee() > projectObj.getAmountPaid()) {
            double outstanding = projectObj.getFee() - projectObj.getAmountPaid();
            System.out.println("You still have R" + outstanding + " left to pay");
        }
        // if project is outstanding then generate invoice

        // Mark project as complete

        // Write project to finalized text file
    }
}

