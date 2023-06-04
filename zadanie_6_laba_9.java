import java.util.*;

class KVNTeam {
    String city;
    boolean isUniversityTeam;
    String university;
    String league;
    String teamName;
    int captainAge;
    int numberOfMembers;
    int numberOfMembersUnder21;
    int numberOfMembersWithMusicEducation;
    int numberOfMembersWithTheaterEducation;
    int numberOfMembersCurrentlyStudying;
    int numberOfMusicalInstruments;
    double averageSponsorshipAmount;
    double averageAnnualIncome;
}

public class zadanie_6_laba_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<KVNTeam> teams = new ArrayList<>();
        System.out.println("Выберите тип ввода данных (1 - регламентированный, 2 - нерегламентированный):");
        int inputType = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 2; i++) {
            KVNTeam team = new KVNTeam();
            if (inputType == 1) {
                System.out.println("Введите информацию о команде КВН №" + (i + 1) + " в следующем формате:");
                System.out.println("Город; Относится ли команда к ВУЗу (true/false); ВУЗ; Лига; Название команды; Возраст капитана; Количество участников; Количество участников младше 21 года; Количество участников с музыкальным образованием; Количество участников с театральным образованием; Количество участников на настоящий момент получающих образование; Число музыкальных инструментов в собственности команды; Средняя сумма спонсорских взносов для обеспечения работы команды на год; Средний доход команды от выступлений за год");
                String[] input = scanner.nextLine().split(";\\s*");
                team.city = input[0];
                team.isUniversityTeam = Boolean.parseBoolean(input[1]);
                team.university = input[2];
                team.league = input[3];
                team.teamName = input[4];
                team.captainAge = Integer.parseInt(input[5]);
                team.numberOfMembers = Integer.parseInt(input[6]);
                team.numberOfMembersUnder21 = Integer.parseInt(input[7]);
                team.numberOfMembersWithMusicEducation = Integer.parseInt(input[8]);
                team.numberOfMembersWithTheaterEducation = Integer.parseInt(input[9]);
                team.numberOfMembersCurrentlyStudying = Integer.parseInt(input[10]);
                team.numberOfMusicalInstruments = Integer.parseInt(input[11]);
                team.averageSponsorshipAmount = Double.parseDouble(input[12]);
                team.averageAnnualIncome = Double.parseDouble(input[13]);
            } else {
                // Нерегламентированный ввод данных
                System.out.println("Введите информацию о команде КВН №" + (i + 1) + " в произвольном формате:");

                System.out.print("Введите город команды: ");
                team.city = scanner.nextLine();

                System.out.print("Относится ли команда к ВУЗу (true/false): ");
                team.isUniversityTeam = Boolean.parseBoolean(scanner.nextLine());

                System.out.print("Введите ВУЗ, к которому относится команда: ");
                team.university = scanner.nextLine();

                System.out.print("Введите лигу, в которой выступает команда: ");
                team.league = scanner.nextLine();

                System.out.print("Введите название команды: ");
                team.teamName = scanner.nextLine();

                System.out.print("Введите возраст капитана: ");
                team.captainAge = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите количество участников: ");
                team.numberOfMembers = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите количество участников младше 21 года: ");
                team.numberOfMembersUnder21 = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите количество участников с музыкальным образованием: ");
                team.numberOfMembersWithMusicEducation = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите количество участников с театральным образованием: ");
                team.numberOfMembersWithTheaterEducation = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите количество участников на настоящий момент получающих образование: ");
                team.numberOfMembersCurrentlyStudying = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите число музыкальных инструментов в собственности команды: ");
                team.numberOfMusicalInstruments = Integer.parseInt(scanner.nextLine());

                System.out.print("Введите среднюю сумму спонсорских взносов для обеспечения работы команды на год: ");
                team.averageSponsorshipAmount = Double.parseDouble(scanner.nextLine());

                System.out.print("Введите средний доход команды от выступлений за год: ");
                team.averageAnnualIncome = Double.parseDouble(scanner.nextLine());
            }

            teams.add(team);
        }

        // Анализ данных и вывод результатов
        int countTeamsByCity = 0;
        int countTeamsByUniversity = 0;

        for (KVNTeam team : teams) {
            if (team.numberOfMembersCurrentlyStudying > team.numberOfMembers * 0.5 && team.averageAnnualIncome > 3_000_000) {
                countTeamsByCity++;
            }

            if (team.isUniversityTeam && (team.numberOfMembersWithMusicEducation > 0 || team.numberOfMembersWithTheaterEducation > 0) && team.averageSponsorshipAmount < team.averageAnnualIncome) {
                countTeamsByUniversity++;
            }
        }

        System.out.println("Количество команд по лигам относящихся к 1 городу, в которых более 50 % участников на настоящий момент получают образование, а средний доход команды от выступлений за год превышает 3 млн. руб.: " + countTeamsByCity);
        System.out.println("Количество команд по городам, которые относятся к ВУЗам, в которых есть участники с музыкальным и театральным образованием, а средняя сумма спонсорских взносов меньше суммы доходов команды от выступлений: " + countTeamsByUniversity);
    }
}

