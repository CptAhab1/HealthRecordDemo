/*
This class contains the methods to read user input, store the input in variables
used for BMI calculation, and display the complete patient profile
back on the front end.
 */

import java.util.Scanner;

public class HealthRecord {

    //Instance variables, made private to ensure they can't be manually changed
    //on the front end.
    private long ssn;

    private String firstName;

    private String lastName;

    private int age;

    private long phoneNumber;

    private String email;

    private double height;

    private double weight;

    private double BMI;

    //Declaring these variables here allows me to easily update them if the bounds
    //of these variables change.
    private int ageMax = 125;
    private int weightMax = 1400;
    private int heightMax = 108;

    Scanner scanner = new Scanner(System.in);

    //This method will display prompts for each variable for the user to input.
    public void readInputs() {
        setSsn();
        setFirstName();
        setLastName();
        setAge();
        setPhoneNumber();
        setEmail();
        setWeight();
        setHeight();
    }

    //The setter methods will assign user input to the private variables.

    private void setSsn() {

        do {
            System.out.print("Please enter your social security number. " +
                    "A valid SSN is a 9 digit positive number: ");

            ssn = scanner.nextInt();

            String ssnString = String.format("%04d",ssn);

            if (ssn < 1 || ssn > 999999999 || Long.toString(ssn).length() != 9)
                System.out.println("This is not a valid SSN.");

        } while (ssn < 1 || ssn > 999999999 || Long.toString(ssn).length() != 9);
    }

    private void setFirstName() {

        System.out.print("Please enter your first name: ");

        firstName = scanner.next();

    }

    private void setLastName() {

        System.out.print("Please enter your last name: ");

        lastName = scanner.next();

    }

    private void setAge() {

        do {
            System.out.print("Please enter your age. " +
                    "Valid entries are whole numbers from 1 to " + ageMax + ": ");

            age = scanner.nextInt();

            if (age < 1 || age > ageMax)
                System.out.println("This is not a valid age.");
        } while (age < 1 || age > ageMax);
    }

    private void setPhoneNumber() {

        do {
            System.out.print("Please enter your phone number. " +
                    "A valid phone number is a 10 digit positive number: ");

            phoneNumber = scanner.nextLong();

            if (phoneNumber < 1 || phoneNumber > 9999999999L || Long.toString(phoneNumber).length() != 10)
                System.out.println("This is not a valid phone number.");

        } while (phoneNumber < 1 || phoneNumber > 9999999999L || Long.toString(phoneNumber).length() != 10);
    }

    private void setEmail(){
        System.out.print("Please enter your email address: ");

        email = scanner.next();
    }

    private void setWeight(){
        do {
            System.out.print("Please enter your weight in lbs. " +
                    "Valid entries are whole numbers from 1 to " + weightMax + ": ");

            weight = scanner.nextDouble();

            if (weight < 1 || weight > weightMax)
                System.out.println("This is not a valid weight.");
        } while (weight < 1 || weight > weightMax);
    }

    private void setHeight(){
        do {
            System.out.print("Please enter your height in inches. " +
                    "Valid entries are whole numbers from 1 to " + heightMax + ": ");

            height = scanner.nextDouble();

            if (height < 1 || height > heightMax)
                System.out.println("This is not a valid height.");
        } while (height < 1 || height > heightMax);
    }

    private void calculateBMI(){
        BMI = (weight/(Math.pow(height,2)))*703;
    }

    //The getter methods will call those variable do display even though the
    //variables themselves are private.

    private long getSsn() {return (ssn);}

    private String getFirstName(){return (firstName);}

    private String getLastName(){return (lastName);}

    private int getAge(){return (age);}

    private long getPhoneNumber() {return (phoneNumber);}

    private String getEmail() {return (email);}

    private double getWeight(){return (weight);}

    private double getHeight(){return (height);}

    private double getBMI(){return (BMI);}

    //This method displays the variables in the console.
    public void display() {
        System.out.println("SSN: " + getSsn());
        System.out.println("First name: "+ getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Weight: " + getWeight());
        System.out.println("Height: " + getHeight());

        calculateBMI();

        System.out.println("BMI: " + String.format("%.2f",getBMI()));
    }

}