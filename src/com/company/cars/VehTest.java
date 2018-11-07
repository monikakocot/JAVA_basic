package com.company.cars;

/*

Easy simulation for cars - user can stopped the cars, move, sell. Cars can have accident etc.
 */
public class VehTest {

    // Raport for the states of the table of cars

    static void report(String msg, Vehicle[] v)  {
        System.out.println(msg);
        for (int i=0; i < v.length; i++)
            System.out.println("" + v[i]);
    }

    public static void main(String[] args)  {
        System.out.println("Avaible states of cars:");
        System.out.println();
        String[] states = Vehicle.getAvailableStates();

        System.out.println();
        System.out.println("We have now: " + Vehicle.getCount() +"cars");

        Vehicle[] v =  { new Vehicle(new Person("Jan Piesio", "010268246"),
                200, 150, 500, 900),
                new Vehicle(new Person("Stefan Kot", "010262241"),
                        210, 250, 800, 1900),
                new Vehicle(200, 230, 300, 600),
        };

        System.out.println();
        System.out.println("We have now: " + Vehicle.getCount() + "cars");
        System.out.println();
        report("At the beginning: ", v);


        System.out.println();
        System.out.println("Now we are selling car number 3 to Ambroży");
        v[2].sellTo(new Person("Ambroży", "000000"));
        for (int i=0; i < v.length; i++) v[i].start();

        System.out.println();
        report("After moved cars", v);

        System.out.println();
        System.out.println("Which cars are able to pass under  the 220 cm height contruction");

        for (int i=0; i < v.length; i++)
            if (v[i].isTooHighToGoUnder(220)) v[i].stop();

        System.out.println();
        report("Which cars succed with pass the construction?", v);


        for (int i=0; i < v.length; i++)
            if (v[i].isStopped()) v[i].start();
        System.out.println();
        report("Stopped car moves to another way", v);


        v[0].crash(v[1]);
        System.out.println();
        report("After colision: ", v);
        System.out.println();
        System.out.println("Piesio try to move");
        v[0].start();
        System.out.println();
        System.out.println("Piesio sell the car to Krówka. He repaired it and go");
        v[0].sellTo(new Person("Anna Krówka", "121212908"));
        v[0].repair().start();
        System.out.println();
        report("In the end: ",v);

        System.out.println("State od the car number 3 is: " + Vehicle.getState(v[2].getState()));
    }

}