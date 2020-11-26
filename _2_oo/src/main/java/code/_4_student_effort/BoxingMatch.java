package code._4_student_effort;

public class BoxingMatch {
    Fighter f1;
    Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight() {
        while (f1.health > 0 && f2.health > 0) {
            f1.attack(f2);
            f2.attack(f1);
        }
        if (f1.health < f2.health) {
            return f2.name;
        } else
            if (f2.health < f1.health) {
            return f1.name;
        } else {
            return "Remiza";
        }
    }
}
