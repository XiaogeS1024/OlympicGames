package com.team.olympics.game.pingpong;

import com.team.olympics.game.gender.Gender;
/**
 * @author Charles Gao
 * @description the ping-pong team game
 * @date 2021/10/15
 */
public class PingPongTeam extends PingPong{
    public PingPongTeam(Gender gender) {
        super(gender);
    }

    @Override
    public void show() {
        this.getGender().show("This is ping-pong team");
    }
}
