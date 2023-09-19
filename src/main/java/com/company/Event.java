package com.company;

import java.util.ArrayList;

public abstract class Event {
    private boolean started;
    private ArrayList<Helper> helpers;
    private ArrayList<Organiser> organisers;
    private Organiser chefOrganiser;
    private int numberOfGuests;

    public Event(Organiser chefOrganiser, int numberOfGuests) {
        this.chefOrganiser = chefOrganiser;
        this.numberOfGuests = numberOfGuests;
        helpers = new ArrayList<>();
        organisers = new ArrayList<>();
        organisers.add(chefOrganiser);
        started = false;
    }

    public void start()
    {
        started = organisers.size() >= 3 && helpers.size() >= 10;
    }

    public boolean isStarted() {
        return started;
    }

    public ArrayList<Helper> getHelpers() {
        return helpers;
    }

    public ArrayList<Organiser> getOrganisers() {
        return organisers;
    }

    public Organiser getChefOrganiser() {
        return chefOrganiser;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void addOrganiser(Organiser organiser)
    {
        organisers.add(organiser);
    }

    public void addHelper(Helper helper)
    {
        helpers.add(helper);
    }
}
