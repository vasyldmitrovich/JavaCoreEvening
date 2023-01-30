package practical.first;

public class ArrayIntegers {



    public int getSumPositive() {
        return sumPositive;
    }

    public void setSumPositive(int sumPositive) {
        ArrayIntegers.sumPositive = sumPositive;
    }

    public int getSumNegative() {
        return sumNegative;
    }

    public void setSumNegative(int sumNegative) {
        ArrayIntegers.sumNegative = sumNegative;
    }

    public int getNumberNegative() {
        return numberNegative;
    }

    public void setNumberNegative(int numberNegative) {
        ArrayIntegers.numberNegative = numberNegative;
    }

    public void CheckMaxValue(int value){

    }





    static int sumPositive,sumNegative,numberNegative=0,numberPositive=0;

    public static void main(String[] args) {


        int[] arr= {10,41,59,7,992,1654,-127,11,25,0};
        int maxValue= arr[0];

        for(int i : arr){
            if(maxValue<i) maxValue=i;
            if(i>0){
                sumPositive+=i;
                numberPositive++;
            }
            else if(i<0){
                sumNegative+=i;
                numberNegative++;
            }
        }

        System.out.println("Biggest number: "+maxValue +
                " Sum Positive: "+ sumPositive +
                " Sum Negative: " + sumNegative +
                ((numberNegative>numberPositive)? " There are more negatives":" There are more positives"));



    }





}
