public class Main {
    public static void main(String[] args) {
        //HW 1 Exercise 1-3
        System.out.println("HW 1 Exercise 1-3");
        //1
        int[] intNums = new int[]{1,2,3};
        float[] floatNums = new float[]{1.57f,7.654f,9.986f};
        char[] chars = new char[]{'a','b','c'};

        //2
        for (int intNum : intNums) {
            System.out.print(intNum);
            if (intNum != intNums.length) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.printf("%f, %f, %f\n",floatNums[0], floatNums[1], floatNums[2]);
        System.out.printf("%c, %c, %c\n", chars[0], chars[1], chars[2]);



        //3
        System.out.println();
        int n = intNums.length - 1;
        for(;n >= 0; n--){
            System.out.print(intNums[n]);
            if(intNums[n] != 0){
                System.out.print(",");
            }
        }
        System.out.println();
        int o  = floatNums.length - 1;
        for(;o >= 0; o--){
            System.out.print(floatNums[o]);
            if(o != 0){
                System.out.print(",");
            }
        }

        System.out.println();
        int p  = chars.length - 1;
        for(;p >= 0; p--){
            System.out.print(chars[p]);
            if(p != 0){
                System.out.print(",");
            }
        }
        System.out.println();

        //HW 1 Exercise 4
        System.out.println();
        System.out.println("HW 1 Exercise 4");
        for(int i = 0; i < intNums.length; i++){
            if(intNums[i] % 2 != 0){
                intNums[i] = intNums[i] + 1;
            }
            System.out.println(intNums[i]);
        }



    }
}