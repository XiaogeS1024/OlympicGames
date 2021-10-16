package com.team.olympics.builder;

import com.team.olympics.ground.GameGround;

public interface Builder {
    void buildType();
    void buildLocation(String location);
    void buildSize(double size);
    void buildDue(int due);
    GameGround build();
}
