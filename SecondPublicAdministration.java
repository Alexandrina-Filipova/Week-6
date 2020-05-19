import java.util.Random;
import java.util.Scanner;

public class SecondPublicAdministration {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        mainMenu();
        System.out.println();
        System.out.print("Изберете опция от менюто!");
        int chooseNumberFromTheMainMenu=scanner.nextInt();
        switch (chooseNumberFromTheMainMenu){
            case 1:
                System.out.println();
                arrayNumbers(scanner);
                System.out.println();
                optionMenuForNumbers();
                System.out.println();
                break;
            case 2:
                System.out.println();
                arrayWords(scanner);
                System.out.println();
                optionMenuForWords();
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("Изход от програмата!");
                break;
        }

    }

    public static void arrayNumbers(Scanner scanner){
        System.out.println("Въведете колко на брой числа ще въвеждате: ");
        int sizeOfArray= scanner.nextInt();

        int[] array=new int[sizeOfArray];
        System.out.println("Въведете числата на масива: ");
        for(int i=0; i < array.length; i++) {
            int numbersOfArray = scanner.nextInt();

            while (numbersOfArray >= 10000 || numbersOfArray <= 0) {
                System.out.println("Въведените числа не трябва да са по-малки от 0 и по-големи от 10 000!");
                System.out.println("Опитайте отново!");
                numbersOfArray = scanner.nextInt();
            }
            array[i] = numbersOfArray;
        }
        System.out.println();
        System.out.print("Масива е: ");
        enteredNumbersOfArray(array);

        System.out.println();
       optionMenuWithNumbers(array,scanner);
    }

    public static void enteredNumbersOfArray(int[] array){
        System.out.print("[");
        for(int i=0; i < array.length - 1; i++){
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1]);
        System.out.print("]");
    }

    public static void primeNumbers(int[] array){
        int number=array.length;
        for (int i=2; i < (number/2); i++){
            if(number % i==0){
                System.out.println("Не е просто число!");
            }else{
                System.out.println(number + "Числото е просто!");
            }
        }
          enteredNumbersOfArray(array);
    }

    public static int mostCommonElement(int[] array){
        int count=1;
        for(int i=0;i<(array.length-1);i++){
            int temp=array[i];
            int tempCount=0;
            for(int j=1; j<array.length;j++){
                if(temp==array[j]){
                    tempCount++;
                }
                if(tempCount>count){
                    array[0]=temp;
                    count=tempCount;
                }
            }
        }
        return array[0];
    }

    public static void maxIncreasingElements(int[] array){
        for(int i=0;i<(array.length-1);i++){
            if(array[i]>array[i+1]){
                System.out.println("Максимална редица от нарастващи елементи: "+i);
            }
        }
        enteredNumbersOfArray(array);
    }

    public static void maxDecreasingElements(int[] array){
        for(int i=1; i<array.length;i++){
            if(array[i]<array[i-1]){
                System.out.println("Максимална редица от намаляващи елементи: "+i);
            }
        }
        enteredNumbersOfArray(array);
    }

    public static void findingTheSameNumber(int[] array){
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Повтарящите се елементи са: " + array[i]);
                }
            }
        }
        enteredNumbersOfArray(array);
    }

    public static void sumEqualsToRandomNumber(int[] array){
        Random random=new Random();

        int sumResult=random.nextInt();
            for (int i = 0; i < array.length; i++) {
                array[i] += array[i];
                array[i] = sumResult;
            }
    }


    public static void arrayWords(Scanner scanner){
        System.out.print("Въведете колко на брой думи ще пишете: ");
        int numberOfWordsInArray=scanner.nextInt();
        System.out.println("Въведете думите!");
          while(scanner.hasNext()){
            System.out.print("[");
            String words = scanner.nextLine();
            System.out.print(words + ",");
            System.out.print("]");
        }
    }

    public static void reverseWords(String[] words){
        int length=words.length;
        for(int i=length-1;i>=0;i--){
            System.out.println(length);
        }
    }

public static void optionMenuWithNumbers(int[] array, Scanner scanner){
    System.out.println("Изберете опция от менюто!");
        int chooseNumberFromTheMenu=scanner.nextInt();
        switch(chooseNumberFromTheMenu){
            case 1:
                System.out.println();
                primeNumbers(array);
                System.out.println();
                optionMenuForNumbers();
                System.out.println();
                break;
            case 2:
                System.out.println();
                mostCommonElement(array);
                System.out.println();
                optionMenuForNumbers();
                System.out.println();
                break;
            case 3:
                System.out.println();
                maxIncreasingElements(array);
                System.out.println();
                optionMenuForNumbers();
                System.out.println();
                break;
            case 4:
                System.out.println();
                maxDecreasingElements(array);
                System.out.println();
                optionMenuForNumbers();
                System.out.println();
                break;
            case 5:
                System.out.println();
                findingTheSameNumber(array);
                System.out.println();
                optionMenuForNumbers();
                System.out.println();
                break;
            case 6:
                System.out.println();
                sumEqualsToRandomNumber(array);
                System.out.println();
                optionMenuForNumbers();
                System.out.println();
                break;
            case 7:
                System.out.println();
                mainMenu();
                System.out.println();
                break;
        }
}

    public static void optionMenuWithWords(String[] words, Scanner scanner){
        int chooseNumberFromTheMenu=scanner.nextInt();
        switch(chooseNumberFromTheMenu){
            case 1:
                System.out.println();
                reverseWords(words);
                System.out.println();
                optionMenuForWords();
                System.out.println();
                break;
            case 2:
                System.out.println();
                optionMenuForWords();
                System.out.println();
                break;
            case 3:
                System.out.println();
                optionMenuForWords();
                System.out.println();
                break;
            case 4:
                System.out.println();
                optionMenuForWords();
                System.out.println();
                break;
            case 5:
                System.out.println();
                mainMenu();
                System.out.println();
                break;
        }
    }

    public static void mainMenu(){
        System.out.println("1. Работа с числа!");
        System.out.println("2. Работа с думи!");
        System.out.println("3. Изход от програмата!");
    }

    public static void optionMenuForNumbers(){
        System.out.println("1. Извеждане само на простите числа от масива!");
        System.out.println("2. Извеждане на най-често срещан елемент в масива!");
        System.out.println("3. Извеждане на максимална редица от нарастващи елементи в масива!");
        System.out.println("4. Извеждане на максимална редица от намаляващи елементи в масива!");
        System.out.println("5. Извеждане на максимална редица от еднакви елементи в масива!");
        System.out.println("6. Извеждане на последователност от числа от масива, които имат сума равна на число, генерирано на случаен принцип!");
        System.out.println("7. Връщане назад към основното меню!");
    }

    public static void optionMenuForWords(){
        System.out.println("1. Обърнете буквите на думите от масива наобратно и ги визуализирайте в конзолата!");
        System.out.println("2. Изведете броя на повтарящите се символи за всяка една от думите в масива!");
        System.out.println("3. Изведете броя на символите за всяка една от думите в масива!");
        System.out.println("4. Изведете броя на повтарящите се думи от масива!");
        System.out.println("5. Връщане назад към основното меню!");
    }

}
