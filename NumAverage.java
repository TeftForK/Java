public class NumAverage {
        public static void main(String[] args) {

            int[] numbers = new int[]{1,5,92,93,94};
            int sum = 0;
            float count = 0;
            for(int i=0; i < numbers.length ; i++) {
                if(i > 150){
                    sum = sum + numbers[i];
                    count++;
                }
            }
            double average = sum/count;
            System.out.println("საშალო არითმეტიკული არის : " + average);
        }
}



