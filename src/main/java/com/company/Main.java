package com.company;

import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Organiser o1 = new Organiser("Organiser 1");
        Organiser o2 = new Organiser("Organiser 2");
        Organiser o3 = new Organiser("Organiser 3");
        Organiser o4 = new Organiser("Organiser 4");
        Organiser o5 = new Organiser("Organiser 5");
        Organiser o6 = new Organiser("Organiser 6");
        Organiser o7 = new Organiser("Organiser 7");
        Organiser o8 = new Organiser("Organiser 8");

        Helper h1 = new Helper("Helper 1");
        Helper h2 = new Helper("Helper 2");
        Helper h3 = new Helper("Helper 3");
        Helper h4 = new Helper("Helper 4");
        Helper h5 = new Helper("Helper 5");
        Helper h6 = new Helper("Helper 6");
        Helper h7 = new Helper("Helper 7");
        Helper h8 = new Helper("Helper 8");
        Helper h9 = new Helper("Helper 9");
        Helper h10 = new Helper("Helper 10");

        CocktailParty cocktailParty = new CocktailParty(o1,20,45);

        cocktailParty.start();

        cocktailParty.addOrganiser(o2);
        cocktailParty.addOrganiser(o3);

        cocktailParty.addHelper(h1);
        cocktailParty.addHelper(h2);
        cocktailParty.addHelper(h3);
        cocktailParty.addHelper(h4);
        cocktailParty.addHelper(h5);
        cocktailParty.addHelper(h6);
        cocktailParty.addHelper(h7);
        cocktailParty.addHelper(h8);
        cocktailParty.addHelper(h9);
        cocktailParty.addHelper(h10);

        cocktailParty.requestCoktails();

        cocktailParty.start();

        cocktailParty.requestCoktails();
        cocktailParty.requestCoktails();
        cocktailParty.requestCoktails();

        Wedding wedding = new Wedding(o2,100,"Strawberry cake");

        wedding.addOrganiser(o4);
        wedding.addOrganiser(o5);

        wedding.addHelper(h1);
        wedding.addHelper(h2);
        wedding.addHelper(h3);
        wedding.addHelper(h4);
        wedding.addHelper(h5);
        wedding.addHelper(h6);
        wedding.addHelper(h7);
        wedding.addHelper(h8);
        wedding.addHelper(h9);
        wedding.addHelper(h10);

        wedding.start();

        Conference conference = new Conference(o7,50,30);

        conference.addOrganiser(o2);
        conference.addOrganiser(o8);

        conference.addHelper(h1);
        conference.addHelper(h2);
        conference.addHelper(h3);
        conference.addHelper(h4);
        conference.addHelper(h5);
        conference.addHelper(h6);
        conference.addHelper(h7);
        conference.addHelper(h8);
        conference.addHelper(h9);
        conference.addHelper(h10);

        conference.askForGoodieBags();

        conference.start();

        conference.askForGoodieBags();

        conference.askForGoodieBags();

        ArrayList<Event> events = new ArrayList<>();
        events.add(cocktailParty);
        events.add(wedding);
        events.add(conference);

        Organiser maxOrganiser = Organiser.mostEventsOrganisedby(events);

        System.out.println("Most event organised by: " + maxOrganiser);



    }
}
