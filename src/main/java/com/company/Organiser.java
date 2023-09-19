package com.company;

import java.util.HashMap;
import java.util.List;

public class Organiser extends Employee {

    public static Organiser mostEventsOrganisedby(List<Event> events) {
        HashMap<Organiser,Integer> numberOfEventsOrganisers = new HashMap<>();

        for(Event e : events){
            for(Organiser organiser : e.getOrganisers()){
                if(numberOfEventsOrganisers.containsKey(organiser)){
                    int n = numberOfEventsOrganisers.get(organiser);
                    n++;
                    numberOfEventsOrganisers.put(organiser,n);
                }
                else
                {
                    numberOfEventsOrganisers.put(organiser,1);
                }
            }
        }

        int max = 0;
        Organiser mOrganiser = null;

        for(Organiser k : numberOfEventsOrganisers.keySet()){
            if(numberOfEventsOrganisers.get(k) > max){
                max = numberOfEventsOrganisers.get(k);
                mOrganiser = k;
            }
        }

        return mOrganiser;
    }


    public Organiser(String name) {
        super(name);
    }
}
