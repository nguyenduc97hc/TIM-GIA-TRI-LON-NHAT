public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        double array[] = {1,3,7,8,2,5,6,9};

        double max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }

}
