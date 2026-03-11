public class linear_Hashing {
    int tablesize;
    Integer[] arr;
    final int deleted=-1;
    public linear_Hashing(int tablesize)
    {
        this.tablesize=tablesize;
        arr=new Integer[tablesize];
    }
    public int hashfunction(int key)
    {
        return key%this.tablesize;
    }
    public boolean collision(int index)
    {
        return (arr[index]!=null&&arr[index] != deleted);
    }
    public void inserthash(int key)
    {

        int index=hashfunction(key);
        int i=1;

        while(collision(index))
        {
            index=(hashfunction(key)+i)%this.tablesize;
            i++;
        }
        arr[index]=key;
    }
    public void search(int key) {
        int index = hashfunction(key);
        int i = 0;
        boolean found = false;

        while (i < tablesize&&arr[index]!=null) {
            if (arr[index].equals(key)) {
                found = true;
                break;
            }
            i++;
            index = (hashfunction(key) + i) % tablesize;
        }

        if (found)
            System.out.println(key + " is found");
        else
            System.out.println("Not found");
    }
void deletehash(int key) {
    int index = hashfunction(key);
    int i = 0;
    boolean found = false;

    while (i < tablesize) {
        if (arr[index].equals(key)) {
            found = true;
            break;
        }
        i++;
        index = (hashfunction(key) + i) % tablesize;
    }

    if (found) {
        arr[index] = deleted;
        System.out.println(key + " deleted");
    } else {
        System.out.println("No such element");
    }
}
    public void printAll()
    {
        for (Integer var:arr
             ) {
            System.out.println(var);
        }
    }
}

@SuppressWarnings("unused")
class Hashdemo12
{
    public static void main(String args[])
    {
        int[] input={5,7,13,14,3,9};
        linear_Hashing h=new linear_Hashing(input.length);
        for (int var:input
             ) {
            h.inserthash(var);
        }
        h.printAll();
        h.search(7);
        h.search(14);
        h.search(2);
        h.deletehash(7);
        h.printAll();
        h.search(13);
    }

}
