package academy.learnprogramming;

public class ComputerScience implements IClassSetup {

    private int classNumber;
    private String teacher;

    public ComputerScience(int classNumber, String teacher) {
        this.classNumber = classNumber;
        this.teacher = teacher;
    }

    @Override
    public void dayOfTheWeek(String day) {
        System.out.println("You have a Computer Science course on " + day + "s");

    }

    @Override
    public void timeLength(int time) {
        if(time > 4){
            System.out.println("The time limit entered goes over amount of hours allowed for 1 single course.");
        }else{
            System.out.println("Your Computer Science course is " + time + " hours(s) long. \n ****************************************");
        }

    }

    @Override
    public void levelOfDifficulty() {
        System.out.println("The Computer Science course registered is level 2, Core Java.");

    }
}
