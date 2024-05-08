public class isEvenNumber {
    public static void main(String[] args) {
        int i = 5;
        while(i<=20){
            if(isEven(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean isEven(int number){
        return (number % 2) == 0;
    }
}
