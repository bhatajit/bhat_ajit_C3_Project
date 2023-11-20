import java.io.PrintStream;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main{
public static void main(String[] agrs)
{
    Restaurant res1 = new Restaurant("Hotel1", "Bangalore", LocalTime.of(9, 0), LocalTime.of(23,0));
    Restaurant res2 = new Restaurant("Hotel2", "Chennai", LocalTime.of(9, 0), LocalTime.of(23,0));
    Restaurant res3 = new Restaurant("Hotel3", "Mumbai", LocalTime.of(9, 0), LocalTime.of(23,0));
    res1.addToMenu("Food1", 200);
    res1.addToMenu("Food2", 300);

    res2.addToMenu("Pulav", 150);
    res2.addToMenu("veg", 100);

    res3.addToMenu("Pulav", 350);
    res3.addToMenu("Veg", 400);


    RestaurantService new_service = new RestaurantService();
    new_service.addRestaurant("Hotel1", "Bangalore", LocalTime.parse("09:00"), LocalTime.parse("23:00"));
    new_service.addRestaurant("Hotel2", "Chennai", LocalTime.of(9, 0), LocalTime.of(23,0));
    new_service.addRestaurant("Hotel3", "Mumbai", LocalTime.of(9, 0), LocalTime.of(23,0));

   // System.out.println(new_service.findRestaurantByName("Hotel2"));
    res1.displayDetails();
    System.out.println(DateTimeFormatter.ofPattern("hh:mm a").format(res1.closingTime));
    System.out.println(res2.isRestaurantOpen());

    //Item new_item = new Item("Pulav", 200);
    //System.out.println(new_item.toString());


}
}
