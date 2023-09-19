package com.company;

public class Wedding extends Event {
    private String weddingCake;


    public Wedding(Organiser chefOrganiser, int numberOfGuests, String weddingCake) {
        super(chefOrganiser, numberOfGuests);
        this.weddingCake = weddingCake;
    }

    public String getWeddingCake() {
        return weddingCake;
    }

    @Override
    public void start()
    {
        super.start();

        if(super.isStarted()){
            System.out.println("Wedding started with " + weddingCake + "!");
        }
    }
}
