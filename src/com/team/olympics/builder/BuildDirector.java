package com.team.olympics.builder;

/**
 * @author Charles Gao
 * @description Builders' director
 * @date 2021/10/16
 */
public class BuildDirector {
    private Builder builder;
    public BuildDirector(Builder builder)
    {
        this.builder = builder;
    }
    public void construct(String location, double size,int due)
    {
        builder.buildLocation(location);
        builder.buildSize(size);
        builder.buildType();
        builder.buildDue(due);
    }

}
