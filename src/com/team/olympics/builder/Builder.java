package com.team.olympics.builder;

import com.team.olympics.ground.GameGround;
/**
 * @author Charles Gao
 * @description Builder interface
 * @date 2021/10/16
 */
public interface Builder {
    void buildType();
    void buildLocation(String location);
    void buildSize(double size);
    void buildDue(int due);
    GameGround build();
}
