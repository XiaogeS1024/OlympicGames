package com.team.olympics.game.gender;

public class Women implements Gender{
    @Override
    public void show(String game) {
        System.out.println(game+": Women");
    }
}
