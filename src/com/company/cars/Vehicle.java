package com.company.cars;

public class Vehicle {


    public final static int BROKEN = 0, STOPPED = 1, MOVING = 2; // stany
    private final static String[] states =  {
            "BROKEN CAR",
            "STOPPED CAR",
            "MOVING CAR" };        // names of states

    private static int count;       // numbers of allready created cars
    // inicially 0

    private int currNr = ++count;   // when you create new car, count increases by 1 and becomes new number of car


    private int width, height, length, weight;
    private Person owner;
    private int state = STOPPED;

    public  Vehicle()  {  }

    public Vehicle(int w, int h, int l, int ww) {
        this(null, w, h, l, ww);
    }

    public Vehicle(Person p, int w, int h, int l, int ww)  {
        owner = p;     width = w;
        height = h;     length = l;
        weight = ww;
    }

    public void start()  {      // start of vehicle
        setState(MOVING);
    }

    public void stop()  {       // stop the vehicle
        setState(STOPPED);
    }

    // private metod to change state of the car

    private void setState(int newState)  {
        if (state == newState || state == BROKEN)
            System.out.println("It is impossible to change state of the car from "
                    + states[state] + " to the  " + states[newState]);
        else state = newState;
    }

    // repearing of the car - always finish with succed if you can start repairing
    // you cannot repair working car (state = MOVING)
    public Vehicle repair()  {
        if (state == MOVING)
            System.out.println("You cannot repair working car ");
        else if (state != BROKEN) System.out.println("Car works properly");
        else state = STOPPED;
        return this;
    }

    // output is a state as a number
    // int you can compare with: Vehicle.BROKEN, Vehicle.STOPPED  itp.
    public int getState()  { return state; }

    // output is a name of state of the car as a String. Input is number value of state(int)
    public static String getState(int state)  { return states[state];}


    public boolean isStopped()  { return state == STOPPED; }

    // After colision both cars are broken
    // Colission is impossible if both cars are stopped
    public void crash(Vehicle v)  {
        if (state != MOVING && v.state != MOVING)
            System.out.println("There is no colision");
        else  {
            setState(BROKEN);
            v.setState(BROKEN);
        }
    }

    public void sellTo(Person p)  {  // selling the car to the person 'p'
        owner = p;
    }

    public int getNr()  { return currNr; }  // output is unique number of the car

    // Can the vehicle pass under the construction with the specified height?
    public boolean isTooHighToGoUnder(int limit)  {
        return height > limit ? true : false;
    }

    // Number of created cars?
    static int getCount()  { return count; }

    // output is table of avaible states of cars

    static String[] getAvailableStates()  {
        for (int i = 0; i < states.length; i++) System.out.println(states[i]);
        return states;
    }


    public String toString()  {
        String s = (owner == null ? "sklep" : owner.getName());
        return "Pojazd " + currNr + " ,właścicielem którego jest "
                + s + " - " + states[state];
    }

}


