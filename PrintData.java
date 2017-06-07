package com.programmingChallencge3;
import org.omg.CORBA.IDLTypeOperations;
import java.util.List;

public class PrintData {

    /* Main method - Calls method to create (Person) data, return data
     * and then prints the data
     */

    public static void main(String[] args){
        CoreData peopleData = new CoreData();

        // creating data

        peopleData.createPeople();


        // getting data and storing in a list of Person objects

        List<Person> people = peopleData.getPeople();


        // printing all data by traversing through the list

        if(people != null) {

            for (Person p : people) {
                System.out.println(p);
                System.out.println();
            }

        }
        else{
            System.out.println("No data present. ");
        }



    }


}
