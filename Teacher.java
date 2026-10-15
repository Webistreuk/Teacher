public class Teacher {
    String name;
    int zp;
    int year;
    String subj;
    int expG;
    int expM;
    int pairs;

    Teacher(String n, int z, int y, String s, int eg, int em, int p) {
        name = n; zp = z; year = y; subj = s; expG = eg; expM = em; pairs = p;
    }

    int bonus() {
        if (pairs <= 500) return 0;
        if (pairs <= 800) return 10;
        return 15;
    }

    void show() {
        int full = zp + zp * bonus() / 100;
        int day = 3 + (int)(Math.random() * 3);
        System.out.println(name + " | " + full/100 + "р" + full%100 + "к | +" + bonus()
                + "% | " + year + " | " + expG + "г" + expM + "м | " + subj + " | " + day + " пар/день");
    }

    public static void main(String[] args) {
        new Teacher("Иванов Иван", 800000, 2015, "Математика, Физика", 9, 3, 450).show();
        new Teacher("Петрова Анна", 1200000, 2010, "Информатика", 14, 7, 780).show();
        new Teacher("Сидоров Пётр", 1500000, 2005, "Химия, Биология", 19, 2, 950).show();
    }
    
}