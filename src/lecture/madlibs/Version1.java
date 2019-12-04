package lecture.madlibs;

public class Version1 extends FillThisIn {
    public Version1(String[] words) {
        this.name = words[0];
        this.color = words[1];
        this.randomObject = words[2];
        this.location = words[3];
    }


    @Override
    public String greeting() {
        return "Hello there!";
    }

    @Override
    public String goToLocation() {
        return "He went to the " + location;
    }

    @Override
    public String pickUpObject() {
        return "He grabbed the " + randomObject;
    }
}
