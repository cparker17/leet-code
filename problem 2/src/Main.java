import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        String s = "VIV";

        ArrayList<Character> stringAsList= new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {
            stringAsList.add(s.charAt(i));
        }

        char currentChar;
        char nextChar = 'T';
        for(int i = 0; i < stringAsList.size(); i++) {
            currentChar = stringAsList.get(i);
            if(i < stringAsList.size() - 1) {
                nextChar = stringAsList.get(i+1);
            }

            if(currentChar == 'I' && nextChar == 'V') {
                total += 4;
                stringAsList.remove(stringAsList.get(i));
                stringAsList.remove(stringAsList.get(i+1));
            } else if(currentChar == 'I' && nextChar == 'X') {
                total += 9;
                stringAsList.remove(stringAsList.get(i));
                stringAsList.remove(stringAsList.get(i+1));
            } else if(currentChar == 'X' && nextChar == 'L') {
                total += 40;
                stringAsList.remove(stringAsList.get(i));
                stringAsList.remove(stringAsList.get(i+1));
            } else if(currentChar == 'X' && nextChar == 'C') {
                total += 90;
                stringAsList.remove(stringAsList.get(i));
                stringAsList.remove(stringAsList.get(i+1));
            } else if(currentChar == 'C' && nextChar == 'D') {
                total += 400;
                stringAsList.remove(stringAsList.get(i));
                stringAsList.remove(stringAsList.get(i+1));
            } else if(currentChar == 'C' && nextChar == 'M') {
                total += 900;
                stringAsList.remove(stringAsList.get(i));
                stringAsList.remove(stringAsList.get(i+1));
            } else {
                switch(currentChar) {
                    case 'I' : total += 1;
                        break;
                    case 'V' : total += 5;
                        break;
                    case 'X' : total += 10;
                        break;
                    case 'L' : total += 50;
                        break;
                    case 'C' : total += 100;
                        break;
                    case 'D' : total += 500;
                        break;
                    case 'M' : total += 1000;
                        break;
                    default : break;
                }
            }
            System.out.println(total);

        }

        System.out.println(total);
    }
}