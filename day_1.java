import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
public class day_1{


public static void main(String[] args) throws FileNotFoundException {
    File file = new File("input.txt");
    Scanner scan = new Scanner(file);
    List<Integer> list = new ArrayList<Integer>();
        int temp=0;
        while(scan.hasNextLine()){
            String templine = scan.nextLine();
            if (templine.equals("")) {
                list.add(temp);
                temp =0;
            }else{
                temp +=Integer.valueOf(templine);
            }
            
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Part 1 " + list.get(0));
        int total=0;
        for (int i = 0; i < 3; i++) {
            total += list.get(i);
        }
        System.out.println("Part 2 " + total);
}
}