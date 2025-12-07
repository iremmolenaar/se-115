import java.util.Random;

public class lab6_3 {

        public static void main(String[] args) {
            Random rand = new Random();

            int days = 1_000_000;

            String[] weatherTypes = {"Sunny", "Cloudy", "Rainy", "Stormy"};
            int[] counts = new int[4];

            String[] probabilityArray = new String[100];
            for (int i = 0; i < 40; i++) probabilityArray[i] = "Sunny";
            for (int i = 40; i < 70; i++) probabilityArray[i] = "Cloudy";
            for (int i = 70; i < 90; i++) probabilityArray[i] = "Rainy";
            for (int i = 90; i < 100; i++) probabilityArray[i] = "Stormy";


            for (int i = 0; i < days; i++) {
                int index = rand.nextInt(100);
                String weather = probabilityArray[index];

                if (weather.equals("Sunny")) counts[0]++;
                else if (weather.equals("Cloudy")) counts[1]++;
                else if (weather.equals("Rainy")) counts[2]++;
                else counts[3]++;
            }


            System.out.println("Weather Simulation Results for " + days + " days:\n");
            for (int i = 0; i < weatherTypes.length; i++) {
                double percentage = (counts[i] * 100.0) / days;
                System.out.printf("%s: %d times (%.2f%%)%n",
                        weatherTypes[i], counts[i], percentage);
            }
        }
    }


