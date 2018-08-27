public class Potter {
int bookNumber;


    public static double basketPrice( int bookNumber){
        double bookPrice = 8;
        switch (bookNumber){
            case 1 : return 8;
            case 2 : return 15.2;
            case 3 : return 21.6;
            case 4 : return 25.6;
        }
        return 30;
    }
}
