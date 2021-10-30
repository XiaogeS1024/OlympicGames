package com.team.olympics.person;



public  abstract class Person {

    public String identity = "person";
    protected String name;
    protected int age;
    public enum Sex {
        MALE, FEMALE
    }
    protected Sex sex;
    protected String nation;

    /**
     * the asset of the person
     * For staff, it may be related to his/her salary/duty/work arrangement.
     * For spectators, it may be related the ticket information.
     * For athletes, it may be related to the game arrangement/ranking.
     * etc.
     */
    protected double asset;

    /**
     * @param name the person's new name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * set the age of the person
     *
     * @param age the modified age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @return age of the person
     */
    public int getAge() {
        return this.age;
    }

    /**
     * set the sex of the person
     *
     * @param sex the modified sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    /**
     * @return sex of the person
     */
    public Sex getSex() {
        return this.sex;
    }

    /**
     * set the nation of the person
     *
     * @param nation the modified nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }
    /**
     * @return nation of the person
     */
    public String getNation() {
        return this.nation;
    }

    /**
     * set the initial asset of the person, which depends on what kind of person he/she is
     */
    protected abstract void setInitialAsset();

}
