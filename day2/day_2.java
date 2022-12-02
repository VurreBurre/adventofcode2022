package day2;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
   
public class day_2 {
    private int total =0;
    private  int paper =2;
    private int rock = 1;
    private int scissor =3;
    private int win = 6;
    private int loss =0;
    private int draw =3;

    public day_2(){
        total=0;
        paper =2;
        rock=1;
        scissor=3;
        win=6;
        loss=0;
        draw=3;
    }

    public void partOne(Scanner scan) throws FileNotFoundException{
        while(scan.hasNextLine()){
            String s = scan.nextLine();
           // System.out.println(s);
            switch (s) {
                case "A Y":
                total+=win+paper;
                    break;
                case "A X":
                total+=draw+rock;
                    break;
                case "A Z":
                total+=loss+scissor;
                    break;
                case "B Y":
                total+=draw+paper;
                    break;
                case "B X":
                total+=loss+rock;
                    break;  
                case "B Z":
                total+=win+scissor;
                break;
                case "C Y":
                total+=loss+paper;
                    break;
                case "C X":
                total+=win+rock;
                    break;
                case "C Z":
                total+=draw+scissor;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Part 1: " + total);
    }
    /* Y=draw
     * X=lose
     * Z=win
     */
    public void partTwo(Scanner scan){
        total =0;
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
        
            switch (s) {
                case "A Y":
                total+=draw+rock;
                    break;
                case "A X":
                total+=loss+scissor;
                    break;
                case "A Z":
                total+=win+paper;
                    break;
                case "B Y":
                total+=draw+paper;
                    break;
                case "B X":
                total+=loss+rock;
                    break;  
                case "B Z":
                total+=win+scissor;
                break;
                case "C Y":
                total+=draw+scissor;
                    break;
                case "C X":
                total+=loss+paper;
                    break;
                case "C Z":
                total+=win+rock;
                    break;
                default:
                    break;
            }

    }
    System.out.println("Part 2: " + total);
}



public static void main(String[] args) throws FileNotFoundException {
    File file = new File("day2/input.txt");
    Scanner scan = new Scanner(file);
    day_2 a = new day_2();
    a.partOne(scan);
    Scanner scan2 = new Scanner(file);
    a.partTwo(scan2);
}

}