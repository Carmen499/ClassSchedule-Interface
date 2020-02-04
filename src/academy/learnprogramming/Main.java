package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        IClassSetup classOne = new Math(001, "Ms. Turner");
        classOne.dayOfTheWeek("Monday and Wednesday");
        classOne.levelOfDifficulty();
        classOne.timeLength(1);

        IClassSetup classTwo = new ComputerScience(002, "Ms. Smith");
        classTwo.dayOfTheWeek("Tuesday");
        classTwo.levelOfDifficulty();
        classTwo.timeLength(2);

        IClassSetup classThree = new WorldHistory(003,"Ms. Johnson");
        classThree.dayOfTheWeek("Tuesday and Thursday");
        classThree.levelOfDifficulty();
        classThree.timeLength(2);


    }
}
