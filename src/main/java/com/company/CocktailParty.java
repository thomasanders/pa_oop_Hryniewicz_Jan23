package com.company;

public class CocktailParty extends Event {
    private int numberOfCocktails;

    public CocktailParty(Organiser chefOrganiser, int numberOfGuests, int numberOfCocktails) {
        super(chefOrganiser,numberOfGuests);
        this.numberOfCocktails = numberOfCocktails;
    }

    public void requestCoktails()
    {
        if(isStarted()) {
            System.out.println("Cocktails requested!");
            numberOfCocktails -= getNumberOfGuests();


            if (numberOfCocktails <= 0) {
                numberOfCocktails = 0;
                System.out.println("No cocktails left!");
            }
        }
        else {
            System.out.println("First start the event");
        }
    }
}
