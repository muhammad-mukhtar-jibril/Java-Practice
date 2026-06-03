public class MonthChecker {

    public static void main(String[] args) {

        /*
         * Practice Program: Switch Statement in Java
         * ------------------------------------------
         * This program was written as a learning exercise to understand:
         * - How the switch statement works
         * - How cases map integer values to specific outputs
         * - How break statements prevent fall-through
         * 
         * The goal here is not optimization, but practice and repetition
         * of switch-case structure using month numbers.
         */

        int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};

        /*
         * Loop through each month number in the array
         * and use switch to print the corresponding month name.
         */
        for (int i = 0; i < month.length; i++) {

            switch(month[i]) {

                case 1:
                    System.out.println("January");
                    break;

                case 2:
                    System.out.println("February");
                    break;

                case 3:
                    System.out.println("March");
                    break;

                case 4:
                    System.out.println("April");
                    break;

                case 5:
                    System.out.println("May");
                    break;

                case 6:
                    System.out.println("June");
                    break;

                case 7:
                    System.out.println("July");
                    break;

                case 8:
                    System.out.println("August");
                    break;

                case 9:
                    System.out.println("September");
                    break;

                case 10:
                    System.out.println("October");
                    break;

                case 11:
                    System.out.println("November");
                    break;

                case 12:
                    System.out.println("December");
                    break;

                default:
                    System.out.println("Invalid month");
            }
        }
    }
}