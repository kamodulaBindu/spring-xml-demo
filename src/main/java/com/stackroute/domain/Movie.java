package com.stackroute.domain;

public class Movie {

    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void actorInformation(){
        actor.actorInfo();

}

}
