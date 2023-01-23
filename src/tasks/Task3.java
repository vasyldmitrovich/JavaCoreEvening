package tasks;
/*
* Roman Sitko
* */
public class Task3 {

    public static void getDollar(double costOneDollar, int sumGruvnya) {

        if((costOneDollar >= 0.0f) && (sumGruvnya >= 0)) {
            double result = (double) sumGruvnya / costOneDollar;
            System.out.println(result);
        } else {
            System.out.println("Values is wrong");
        }
    }
}
