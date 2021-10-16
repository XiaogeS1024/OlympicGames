package com.team.olympics.builder;



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
