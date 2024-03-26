/*
Alex Habbart
0855541
2/23/24
CSC 512
Lab 4
 */

/*
This program will allow the user to build a patient profile based on several parameters
that will be used to calculate BMI
 */

public class HealthRecordDemo {
    public static void main(String[] args){

        System.out.println("\n\t\tHabbart Hospital Patient Portal");
        System.out.println("Create a new patient profile by answering the prompts below.\n");

        //Object declaration
        HealthRecord patientRecord = new HealthRecord();

        //This command displays prompts and reads input for the user to assign to the
        //variables stored in the HealthRecord class
        patientRecord.readInputs();
        System.out.println("\n\nPatient profile:\n");
        //Displays the user-entered input for the user to review
        patientRecord.display();

        System.out.println("\nPatient profile completed. " +
                "If you see any errors, please rerun this program .");

    }
}
