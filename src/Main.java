import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("natali");
        people.add("mariami");
        people.add("ani");
        people.add("lasha");
        people.add("giorgi");
        people.add("elene");
        people.add("mate");
        people.add("danieli");
        people.add("anastasia");
        people.add("akaki");

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(7);
        listA.add(4);
        listA.add(5);

        ArrayList<Integer> listB = new ArrayList<Integer>();
        listB.add(8);
        listB.add(3);
        listB.add(5);

        int maxNumber = findNumb(listA, listB);
        System.out.println("The largest number is: " + maxNumber);
    }


    public static int findNumb(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        Integer maxNumber = listA.get(0);
        for (int num : listA) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        for (int num : listB) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        return maxNumber;
    }
}



//შექმენი სტრინგების ArrayList , ჩაწერე
//მასში 10 სიტყვა, შემდეგ გადაუყევი მას For
//loop -ის გამოყენებით. დაბეჭდე თითოეული
//სიტყვა
//● დაწერეთ მეთოდი, რომელსაც გადაეცემა
//ორი ცალი რიცხვების ArrayList, მეთოდმა
//უნდა დააბრუნოს უდიდესი რიცხვი,
//რომელიც ამ ArrayList-ებშია
//● მაგალითად: თუ გადმოგვეცემა ListA = 7,4,5
//და ListB = 8,3,5
//● მეთოდმა უნდა დააბრუნოს 8