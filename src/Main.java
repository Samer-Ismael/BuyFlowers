import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hur mycket pengar har du? ");
        int budget = scan.nextInt();

        if (budget >= 10){
            startAsking(budget);
        } else {
            print("Vi har inget du kan handla för de pengarna! ");
        }
    }
    public static void printList (String[] flowers, int [] prices){
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(i + 1 + "--> ");
            System.out.print(flowers[i] + " ");
            System.out.print(prices[i] + " kr" );
            System.out.println();
        }
    }
    public static void printKundvagn(List<String> kassan, int totalKostnad){

        print("Välkommen åter");
        for (int i = 0; i < kassan.size(); i++){
            System.out.println(kassan.get(i));
        }
        System.out.println( "Total: " + totalKostnad + "kr");
    }
    public static void print (String text){
        System.out.println(text);
    }
    public static void startAsking (int budget){
        Scanner scan = new Scanner(System.in);

        String[] flowers = {"Ros", "Lilja", "Tulpan", "Orkide", "Svart Ros",
                "Grön Salladshuvud", "Gul Narciss", "Kompostblommor"};
        int[] prices = {50, 40, 30, 60, 80, 10, 20, 10};

        int kostnad = 0;
        int totalKostnad = 0;

        List<String> kassan = new ArrayList<>();

        while (kostnad < budget){
            print("Din budget är: " + budget);
            print("-----------------------");
            printList(flowers, prices);
            print("-----------------------");
            print("Välj en blomma eller tryck 9 om du är nöjed:  ");
            int val = scan.nextInt();

            if (val == 5 && budget < 80){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 5 && budget >= 80){
                budget -= 80;
                totalKostnad += 80;
                kassan.add(flowers[4]);
            }
            if (val == 4 && budget < 40){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 4 && budget >= 60){
                budget -= 60;
                totalKostnad += 60;
                kassan.add(flowers[3]);
            }
            if (val == 1 && budget < 50){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 1 && budget >= 50){
                budget -= 50;
                totalKostnad += 50;
                kassan.add(flowers[0]);
            }
            if (val == 2 && budget < 40){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 2 && budget >= 40){
                budget -= 40;
                totalKostnad += 40;
                kassan.add(flowers[1]);
            }
            if (val == 3 && budget < 30){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 3 && budget >= 30){
                budget -= 30;
                totalKostnad += 30;
                kassan.add(flowers[2]);
            }
            if (val == 7 && budget < 20){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 7 && budget >= 20){
                budget -= 20;
                totalKostnad += 20;
                kassan.add(flowers[6]);
            }
            if (val == 6 && budget < 10){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 6 && budget >= 10){
                budget -= 10;
                totalKostnad += 10;
                kassan.add(flowers[5]);
            }
            if (val == 8 && budget < 10){
                print("Pengarna räcker inte! ");
                print("-----------------------");
            }
            if (val == 8 && budget >= 10){
                budget -= 10;
                totalKostnad += 10;
                kassan.add(flowers[7]);
            }
            if (val == 9 || budget < 10){
                break;
            }
            if (val < 0 || val > 9){
                print("Vi har inget sådant! ta någonting från listan; ");
            }
        }
        printKundvagn(kassan, totalKostnad);
    }
}