package com.team.olympics.game.gender;

public class Men implements Gender{
    @Override
    public void show(String game) {
        System.out.println(game+": Men");
    }
}
