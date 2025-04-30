import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsInGroup1 = scanner.nextInt();
        int studentsInGroup2 = scanner.nextInt();
        int studentsInGroup3 = scanner.nextInt();

        int minNumberOfDesks1 = getMinimumNumberOfDesk(studentsInGroup1);
        int minNumberOfDesks2 = getMinimumNumberOfDesk(studentsInGroup2);
        int minNumberOfDesks3 = getMinimumNumberOfDesk(studentsInGroup3);

        int totalDesks = minNumberOfDesks1 + minNumberOfDesks2 + minNumberOfDesks3;

        System.out.println(totalDesks);
    }

    private static int getMinimumNumberOfDesk(int totalStudentsInGroup) {
       if ((totalStudentsInGroup % 2) == 0) {
           return totalStudentsInGroup / 2;
       } else {
           int remainder = totalStudentsInGroup % 2;
           return (totalStudentsInGroup / 2) + remainder;
       }
    }
}
