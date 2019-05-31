public class Client {
    public static void main(String[] args) {
        // construct and print list
        int[] data = {5, 19, 0, 2, 4, 0, 13, 85, -8, 0, 23};
        ArrayIntList list = new ArrayIntList();
        for (int n : data) {
            list.add(n);
        }
        System.out.println("list = " + list);

        // obtain an iterator to find the product of the list, removing zeros
        ArrayIntListIterator i = list.iterator();       
        int product = 1;
        while (i.hasNext()) {
            int n = i.next();
            if (n == 0) {
                i.remove();
            } else {
                product *= n;
            }
        }
        System.out.println("list now = " + list);
        System.out.println("product = " + product);
        
        //We're going to test replaceAll
        ArrayIntList list2 = new ArrayIntList();
        for (int n : data) {
            list2.add(n);
        }
        list2.replaceAll(0, 666);
        System.out.println(list2);
    }
}
