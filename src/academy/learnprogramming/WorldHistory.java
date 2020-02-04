package academy.learnprogramming;

public class WorldHistory implements IClassSetup {
    private int classNumber;
    private String teacher;

    public WorldHistory(int classNumber, String teacher) {
        this.classNumber = classNumber;
        this.teacher = teacher;
    }

    @Override
    public void dayOfTheWeek(String day) {
        System.out.println("You have a World History course on " + day + "s");

    }

    @Override
    public void timeLength(int time) {
        if(time > 4){
            System.out.println("The time limit entered goes over amount of hours allowed for 1 single course.");
        } else{

            System.out.println("Your World History course is " + time + " hour(s) long. \n ****************************************");
        }



    }

    @Override
    public void levelOfDifficulty() {
        System.out.println("The World History course registered is level 3, Honors World History.");

    }
}
