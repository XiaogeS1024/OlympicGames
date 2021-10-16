package com.team.olympics.game.pingpong;

import com.team.olympics.game.gender.Gender;
/**
 * @author Charles Gao
 * @description the ping-pong single game
 * @date 2021/10/15
 */
public class PingPongSingle extends PingPongGame {

    public PingPongSingle(Gender gender) {
        super(gender);
    }

    @Override
    public void show() {
        this.getGender().show("This is ping-pong single");
    }
}
