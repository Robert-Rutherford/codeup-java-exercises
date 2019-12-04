package lecture;

abstract class Student {
    protected String firstName;
    protected String lasName;
    protected String cohort;
    protected String computer;
    protected Boolean graduated;

    public abstract void greeting();

    public abstract void study();

    public abstract Boolean giveBusinessCards();
}
