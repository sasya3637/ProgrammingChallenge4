package com.programmingChallencge3;
import java.util.ArrayList;
import java.util.List;

public class CoreData {
	private List<Person> people = new ArrayList<Person>();


    // Method to create hardcoded data

    public void createPeople(){
        this.people.add(new Person(1, "Andy Turner", "123-456-7890", "123 Example St, New York, NY 10111" ));
        this.people.add(new Person(2, "Peter Griffin ", "585-222-3333", "67 Washington St, Rochester, NY 14609" ));
        this.people.add(new Person(3, "Lisa Simpson", "347-989-7484", "78 Lincoln Ave, New York, NY 11111" ));
        this.people.add(new Person(4, "Homer Simpson", "518-357-1239", "123 Martin Luther St, New York, NY 10111" ));
        this.people.add(new Person(5, "Barney Gumble", "732-665-9990", "742 Evergreen Terrace, Springfield, 10111" ));
        this.people.add(new Person(6, "Kevin Thompson", "114-668-2376", "123 Simspson St, Washington DC, 12345" ));
    }

    // Returns a list of person objects

    public List<Person> getPeople(){
        return people;
    }

}
