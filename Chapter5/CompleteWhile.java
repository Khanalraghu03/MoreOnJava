package Chapter5;

import java.util.Scanner;

public class CompleteWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.print("Please enter age your age: ");
        while (!input.hasNextInt()) {
            System.out.print("Please input age in terms of number:");
            input.next();
        }
        age = input.nextInt();

        if (!(age >= 25 && age <= 50)) {
            System.out.println("Sorry, you are not eligible!");
        } else {
            String smoke;
            boolean smoking;
            do {
                System.out.print("Do you Smoke? Enter Yes or No: ");
                smoke = input.next();
            } while (!(smoke.equals("Yes") || smoke.equals("yes")) && !(smoke.equals("No") || smoke.equals("no")));

            if (smoke.equals("Yes") || smoke.equals("yes")) {
                smoking = true;
                System.out.println("Sorry, you are not eligible!");
            } else {
                smoking = false;
                boolean dogOwnedHistory;
                String OwnedHistory;
                do {
                    System.out.print("Have you owned a dog before? Enter 'Yes' or 'No': ");
                    OwnedHistory = input.next();
                } while (!(OwnedHistory.equals("Yes") || OwnedHistory.equals("yes"))
                        && !(OwnedHistory.equals("No") || OwnedHistory.equals("no")));
                if (OwnedHistory.equals("No") || OwnedHistory.equals("no")) {
                    dogOwnedHistory = false;
                    System.out.println("Sorry, you are not eligible!");
                } else {
                    dogOwnedHistory = true;
                    boolean canWalkTheDog;
                    String ableToWalkTheDog;
                    do {
                        System.out.print("Are you able to walk the dog? Enter 'Yes' or 'No': ");
                        ableToWalkTheDog = input.next();
                    } while (!(ableToWalkTheDog.equals("Yes") || ableToWalkTheDog.equals("yes"))
                            && !(ableToWalkTheDog.equals("No") || ableToWalkTheDog.equals("no")));
                    if (ableToWalkTheDog.equals("No") || ableToWalkTheDog.equals("no")) {
                        canWalkTheDog = false;
                        System.out.println("Sorry, you are not eligible!");
                    } else {
                        canWalkTheDog = true;
                        int timeToWalk;
                        System.out.print("How many times are you able to walk the dog?: ");
                        while (!input.hasNextInt()) {
                            System.out.print("Please input a number:");
                            input.next();
                        }
                        timeToWalk = input.nextInt();
                        if (timeToWalk >= 0 && timeToWalk < 2) {
                            System.out.println("Sorry, you are not eligible!");
                        } else {
                            boolean jobStatus;
                            String statusJob;
                            do {
                                System.out.print("Do you have a job to take care of dogs?  Enter 'Yes' or 'No': ");
                                statusJob = input.next();
                            } while (!(statusJob.equals("Yes") || statusJob.equals("yes"))
                                    && !(statusJob.equals("No") || statusJob.equals("no")));
                            if (statusJob.equals("No") || statusJob.equals("no")) {
                                jobStatus = false;
                                System.out.println("Sorry, you are not eligible!");
                            } else {
                                jobStatus = true;
                                boolean mustBeADogPerson;
                                String itMustBeADogPerson;
                                do {
                                    System.out.print("Are you a dog lover or a dog person? Enter 'Yes' or 'No': ");
                                    itMustBeADogPerson = input.next();
                                } while (!(itMustBeADogPerson.equals("Yes") || itMustBeADogPerson.equals("yes"))
                                        && !(itMustBeADogPerson.equals("No") || itMustBeADogPerson.equals("no")));

                                if (itMustBeADogPerson.equals("No") || itMustBeADogPerson.equals("no")) {
                                    mustBeADogPerson = false;
                                    System.out.println("Sorry, you are not eligible!");
                                } else {
                                    mustBeADogPerson = true;
                                    System.out.println("Congratulation, You can be the Dog Person!!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class DoWhileFindADogPerson {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int age;
            System.out.print("Please enter your age: ");
            while (!input.hasNextInt()) {
                System.out.print("Age cannot be string, please input a number:");
                input.next();
            }
            age = input.nextInt();
            if (!(age >= 25 && age <= 50)) {
                System.out.println("Sorry, you are not eligible!");
            } else {
                String smoke;
                boolean smoking;
                do {
                    System.out.print("Do you Smoke? Enter Yes or No: ");
                    smoke = input.next();
                } while (!(smoke.equals("Yes") || smoke.equals("yes")) && !(smoke.equals("No") || smoke.equals("no")));

                if (smoke.equals("Yes") || smoke.equals("yes")) {
                    smoking = true;
                    System.out.println("Sorry, you are not eligible!");
                } else {
                    smoking = false;
                    boolean dogOwnedHistory;
                    String OwnedHistory;
                    do {
                        System.out.print("Have you owned a dog before? Enter 'Yes' or 'No': ");
                        OwnedHistory = input.next();
                    } while (!(OwnedHistory.equals("Yes") || OwnedHistory.equals("yes"))
                            && !(OwnedHistory.equals("No") || OwnedHistory.equals("no")));
                    if (OwnedHistory.equals("No") || OwnedHistory.equals("no")) {
                        dogOwnedHistory = false;
                        System.out.println("Sorry, you are not eligible!");
                    } else {
                        dogOwnedHistory = true;
                        boolean canWalkTheDog;
                        String ableToWalkTheDog;
                        do {
                            System.out.print("Are you able to walk the dog? Enter 'Yes' or 'No': ");
                            ableToWalkTheDog = input.next();
                        } while (!(ableToWalkTheDog.equals("Yes") || ableToWalkTheDog.equals("yes"))
                                && !(ableToWalkTheDog.equals("No") || ableToWalkTheDog.equals("no")));
                        if (ableToWalkTheDog.equals("No") || ableToWalkTheDog.equals("no")) {
                            canWalkTheDog = false;
                            System.out.println("Sorry, you are not eligible!");
                        } else {
                            canWalkTheDog = true;
                            int timeToWalk;
                            System.out.print("How many times are you able to walk the dog?: ");
                            while (!input.hasNextInt()) {
                                System.out.print("Please input a number:");
                                input.next();
                            }
                            timeToWalk = input.nextInt();
                            if (timeToWalk >= 0 && timeToWalk < 2) {
                                System.out.println("Sorry, you are not eligible!");
                            } else {
                                boolean jobStatus;
                                String statusJob;
                                do {
                                    System.out.print("Do you have a job to take care of dogs?  Enter 'Yes' or 'No': ");
                                    statusJob = input.next();
                                } while (!(statusJob.equals("Yes") || statusJob.equals("yes"))
                                        && !(statusJob.equals("No") || statusJob.equals("no")));
                                if (statusJob.equals("No") || statusJob.equals("no")) {
                                    jobStatus = false;
                                    System.out.println("Sorry, you are not eligible!");
                                } else {
                                    jobStatus = true;
                                    boolean mustBeADogPerson;
                                    String itMustBeADogPerson;
                                    do {
                                        System.out.print("Are you a dog lover or a dog person? Enter 'Yes' or 'No': ");
                                        itMustBeADogPerson = input.next();
                                    } while (!(itMustBeADogPerson.equals("Yes") || itMustBeADogPerson.equals("yes"))
                                            && !(itMustBeADogPerson.equals("No") || itMustBeADogPerson.equals("no")));

                                    if (itMustBeADogPerson.equals("No") || itMustBeADogPerson.equals("no")) {
                                        mustBeADogPerson = false;
                                        System.out.println("Sorry, you are not eligible!");
                                    } else {
                                        mustBeADogPerson = true;
                                        System.out.println("Congratulation, You can be the Dog Person!!");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
