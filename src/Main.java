import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Lemon", "Orange", "Pear", "Pineapple"));
        int[] integerArray = {11,12,13,16,18,20, 21};
        String[] stringArray = {"ant", "boar", "cat", "dog", "eagle", "fox"};

        System.out.println("Testing linearSearch");
        System.out.println(linearSearch(integerArrayList, 1));
        System.out.println(linearSearch(integerArrayList, 8));
        System.out.println(linearSearch(stringArrayList, "Banana"));
        System.out.println(linearSearch(stringArrayList, "Cherry"));
        System.out.println(linearSearch(integerArray, 13));
        System.out.println(linearSearch(integerArray, 35));
        System.out.println(linearSearch(stringArray, "cat"));
        System.out.println(linearSearch(stringArray, "leopard"));

        System.out.println("Testing binarySearch");
        System.out.println(binarySearch(integerArrayList, 6));
        System.out.println(binarySearch(integerArrayList, 8));
        System.out.println(binarySearch(stringArrayList, "Pear"));
        System.out.println(binarySearch(stringArrayList, "Cherry"));
        System.out.println(binarySearch(integerArray, 21));
        System.out.println(binarySearch(integerArray, 35));
        System.out.println(binarySearch(stringArray, "dog"));
        System.out.println(binarySearch(stringArray, "leopard"));
    }

    //String ArrayList linearSearch
    public static int linearSearch(ArrayList<String> stringArrayList, String key){
        for (String string : stringArrayList){
            if (string.equals(key)){
                return stringArrayList.indexOf(string);
            }
        }
        return -1;
    }

    //Integer ArrayList linearSearch
    public static int linearSearch(ArrayList<Integer> intArrayList, Integer key){
        for (Integer integer : intArrayList){
            if (integer.equals(key)){
                return intArrayList.indexOf(integer);
            }
        }
        return -1;
    }

    //String Array linearSearch
    public static int linearSearch(String[] strings, String key){
        for (int i = 0; i < strings.length; i++){
            if (strings[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    //int Array linearSearch
    public static int linearSearch(int[] ints, int key){
        for (int i = 0; i < ints.length; i++){
            if (ints[i] == key){
                return i;
            }
        }
        return -1;
    }

    //arrayList must be sorted first in order for binarySearch to work
    //String ArrayList binarySearch
    public static int binarySearch(ArrayList<String> arrayList, String key){
        int low = 0;
        int high = arrayList.size() - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (key.equals(arrayList.get(mid))){
                return mid;
            }
            //key smaller than mid, key in smaller half
            else if(key.compareTo(arrayList.get(mid)) < 0)
                high = mid - 1;
            //key larger than mid, key in larger half
            else // key.compareTo(arr[mid]) > 0
                low = mid + 1;
        }
        return -1;
    }

    //Integer ArrayList binarySearch
    public static int binarySearch(ArrayList<Integer> arrayList, Integer key){
        int low = 0;
        int high = arrayList.size() - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (key.equals(arrayList.get(mid))){
                return mid;
            }
            //key smaller than mid, key in smaller half
            else if(key < arrayList.get(mid))
                high = mid - 1;
                //key larger than mid, key in larger half
            else // key > arrayList.get(mid)
                low = mid + 1;
        }
        return -1;
    }

    //String Array binarySearch
    public static int binarySearch(String[] strings, String key){
        int low = 0;
        int high = strings.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (key.equals(strings[mid])){
                return mid;
            }
            //key smaller than mid, key in smaller half
            else if(key.compareTo(strings[mid]) < 0)
                high = mid - 1;
                //key larger than mid, key in larger half
            else // key.compareTo(arr[mid]) > 0
                low = mid + 1;
        }
        return -1;
    }

    //int Array binarySearch
    public static int binarySearch(int[] ints, int key){
        int low = 0;
        int high = ints.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (key == (ints[mid])){
                return mid;
            }
            //key smaller than mid, key in smaller half
            else if(key < (ints[mid]))
                high = mid - 1;
                //key larger than mid, key in larger half
            else // key.compareTo(arr[mid]) > 0
                low = mid + 1;
        }
        return -1;
    }
}