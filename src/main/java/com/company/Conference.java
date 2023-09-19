package com.company;

public class Conference extends Event {
    private boolean goodieBagsDistributed;
    private int numberOfGoodieBags;

    public Conference(Organiser chefOrganiser, int numberOfGuests, int numberOfGoodieBags) {
        super(chefOrganiser, numberOfGuests);
        this.numberOfGoodieBags = numberOfGoodieBags;
        this.goodieBagsDistributed = false;
    }

    public void askForGoodieBags(){
        if(isStarted()) {
            System.out.println("Asked for goodie bags");

            if (!goodieBagsDistributed) {
                numberOfGoodieBags -= getNumberOfGuests();

                if (numberOfGoodieBags < 0) {
                    numberOfGoodieBags = 0;
                    System.out.println("No goodie bags left!");
                }
                goodieBagsDistributed = true;
            } else {
                System.out.println("Goodie bags already distributed!");
            }
        }
        else {
            System.out.println("First start the event");
        }
    }
}
