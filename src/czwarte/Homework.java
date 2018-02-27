package czwarte;

public class Homework {

    public static void main(String[] args) {

        // kodowanie i odkodowywanie szyfru cezara
        // kodowanie

        int offsett = 2;
        String secretMessage = "Ala ma kota";
        String expectedMessage = "cnc oc mrvBc ba";

        char[] chars = secretMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
       //     if (chars[i] == 32)
                if ((chars[i] >= 'a' && chars[i] <= 'z')  || (chars)[i] >= 'A' && chars[i] <= 'Z')) {
                    if ((chars[i] + offset) > 'Z' && (chars[i] + offset) < 'a') || {
                        chars[i] = (char) ( chars[i] - 26 + offset);
                    } else if ((chars[i] + offset) > 'z') {

                    }
            }
                if (chars[i] !=' ') {
                    if (chars[i] + offset > "z") {
                        chars[i] = 'a';
                    } else {
                        chars[i] += offset;

                    }
                }
            }
            System.out.println("Correct = " + (expectedMessage.equals(String.valueOf(chars))));

            // tablica liczb. definiujemy liczbe. tworzymy 2 tablice z elmeentami odpowiednio mniejszymi i wiekszymi

            int[] numbers + {1,2,3,4,5,6,7,8};
            int searchingNumber = 4;

        int i = 0;
        while(i < numbers.length && numbers[i] != searchingNumber)


            i++;

        }
            int[] smallerNumbersArray;
            int[] biggerNumbersArray;
        }
        public static void arg(int[] array) {

            for (int i = 0; i < array ; i++) {
                f

            }
    }