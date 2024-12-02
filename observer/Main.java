package observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        YoutubeChannel channel = new YoutubeChannel();

        Subscriber tuhin = new Subscriber("Tuhin");
        Subscriber rahul = new Subscriber("Rahul");
        Subscriber nayan = new Subscriber("Nayan");

        channel.subscribe(tuhin);
        channel.subscribe(rahul);
        channel.subscribe(nayan);

        channel.notifyChanges("Java Course");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Press 1 to add new subscriber!");
            System.out.println("Press 2 to remove an existing subscriber!");
            System.out.println("Press 3 to upload new video!");
            System.out.println("Press 4 to exit!");

            int n = Integer.parseInt(br.readLine());

            if (n == 1) {

                // create subscriber
                System.out.print("Enter subscriber name: ");
                Subscriber subscriber = new Subscriber(br.readLine());
                channel.subscribe(subscriber);
                System.out.println("Congratulations! New subscriber added..!\n");

            } else if (n == 2) {

                // remove subscriber
                System.out.print("Enter subscriber name: ");
                String name = br.readLine();

                for (Observer ob : channel.subscribers) {

                    Subscriber subscriber = (Subscriber) ob;

                    if (subscriber.getName().equals(name))
                        channel.unsubscribe(ob);
                }

                System.out.println("Subscriber removed..!\n");

            } else if (n == 3) {

                // upload video
                System.out.print("Enter video title: ");
                channel.notifyChanges(br.readLine());

            } else if (n == 4) {

                // exit
                System.out.println("Thank you, visit again!\n");
                break;

            } else {
                // wrong input
                System.out.println("Wrong input, try again!\n");
            }

        }

    }

}
