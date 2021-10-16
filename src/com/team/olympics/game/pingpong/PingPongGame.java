package com.team.olympics.game.pingpong;

import com.team.olympics.game.gender.Gender;

/**
 * @author Charles Gao
 * @description the ping-pong abstract class
 * @date 2021/10/15
 */
public abstract class PingPongGame {
    private Gender gender;
    public PingPongGame(Gender gender)
    {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public abstract void show();

}
