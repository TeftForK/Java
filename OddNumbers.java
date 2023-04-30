public class OddNumbers {
    public static void main(String[] args) {

        int number[]=new int[]{1,2,3,4,5};
        int sum = 0;
        int count = 0;

        for(int i=0;i<number.length;i++)
        {
            if(number[i]%2!=0) {
                sum = sum + number[i];
                count++;
            }
        }
        double avgOdd=sum/count;
        System.out.println("\nკენტი რიცხვების საშუალო არის : "+avgOdd);
    }
}
