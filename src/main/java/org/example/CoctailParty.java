package com.company;

public class CocktailParty extends Event {
    private int numberOfCocktails;

    public CocktailParty(Organiser chefOrganiser, int numberOfGuests, int numberOfCocktails) {
        super(chefOrganiser,numberOfGuests);
        this.numberOfCocktails = numberOfCocktails;
    }

    public void requestCoktails()
    {
        numberOfCocktails -= getNumberOfGuests();

        if(numberOfCocktails <= 0){
            numberOfCocktails = 0;
            System.out.println("No cocktails left!");
        }
    }
}

