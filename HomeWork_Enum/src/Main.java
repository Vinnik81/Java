import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface Attack {
   void modifyHp(Warrior warrior);
    boolean isAlive();
}

class Warrior implements Attack {
    private String name;
    private int hp;
    private AttackType attackType;

    public Warrior(String name, int hp) {
        this.name = name;
        this.hp = hp;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
        attackType.modifyHp(this);
    }


    @Override
    public void modifyHp(Warrior warrior) {
        hp = warrior.getHp();
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}

enum AttackType implements Attack {
    DAMAGE {
        @Override
        public void modifyHp(Warrior warrior) {
            int hp = new Random().nextInt(100) +1;
            warrior.modifyHp(new Warrior(warrior.getName(), warrior.getHp() - hp));
            System.out.println(warrior.getName() + " теряет " + hp + " hp, осталось " + warrior.getHp() + " hp");
        }
        @Override
        public boolean isAlive() {
            return false;
        }
    },
HEAL {
    @Override
    public void modifyHp(Warrior warrior) {
        int hp = new Random().nextInt(50) +1;
        warrior.modifyHp(new Warrior(warrior.getName(), warrior.getHp() + hp));
        System.out.println(warrior.getName() + " исцеляет " + hp + " hp, осталось " + warrior.getHp() + " hp");
    }

    @Override
    public boolean isAlive() {
        return true;
    }
},
    SUPERATTACK {
        @Override
        public void modifyHp(Warrior warrior) {
            warrior.modifyHp(new Warrior(warrior.getName(), warrior.getHp() - 100));
            System.out.println(warrior.getName() + " теряет " + 100 + " hp, осталось " + warrior.getHp() + " hp");
        }

        @Override
        public boolean isAlive() {
            return false;
        }
    },

    SUPPERHEAL {
        @Override
        public void modifyHp(Warrior warrior) {
            warrior.modifyHp(new Warrior(warrior.getName(), warrior.getHp() + 50));
            System.out.println(warrior.getName() + " исцеляет " + 50 + " hp, осталось " + warrior.getHp() + " hp");
        }

        @Override
        public boolean isAlive() {
            return true;
        }
    }

}

interface Gaming {
    void addAttack(Warrior attack);
    void selected();
}

class Battle implements Gaming {
    private List<Warrior> attacks = new ArrayList<>();

    @Override
    public void addAttack(Warrior attack) {
        attacks.add(attack);
    }

    @Override
    public void selected() {
        int count = attacks.size();
        if (count == 1) {
            System.out.println("Ура " + attacks.get(0).getName() + " победил!");
            return;
        }

        Random random = new Random();
        int attackerIndex = random.nextInt(count);
        int userIndex;
        do {
            userIndex = random.nextInt(count);
        } while (userIndex == attackerIndex);

        Warrior attacker = attacks.get(attackerIndex);
        Warrior user = attacks.get(userIndex);

        fight(attacker, user);
    }

    private void fight(Warrior attacker, Warrior user) {
        int hp = new Random().nextInt(100) +1;
        user.modifyHp(new Warrior(user.getName(), user.getHp() - hp));
        System.out.println(attacker.getName() + " атакует " + user.getName() + " на " + hp +" hp, осталось ("
                + user.getHp() + " hp)");

        if (!user.isAlive()) {
            attacks.remove(user);
            System.out.println(user.getName() + " был побежден!");
        }

        if (user.getHp() < 30 && user.isAlive() && user.getAttackType() == AttackType.HEAL) {
            user.setAttackType(AttackType.HEAL);
        }

        if (user.getHp() > 150 && user.isAlive() && user.getAttackType() == AttackType.DAMAGE) {
            user.setAttackType(AttackType.DAMAGE);
        }

        if (user.getHp() > 300 && user.isAlive() && user.getAttackType() == AttackType.SUPERATTACK) {
            user.setAttackType(AttackType.SUPERATTACK);

        }

        if (user.getHp() < 10 && user.isAlive() && user.getAttackType() == AttackType.SUPPERHEAL) {
            user.setAttackType(AttackType.SUPPERHEAL);
        }

        selected();
    }
}

public class Main {
    public static void main(String[] args) {
Warrior warrior = new Warrior("Abroxas", 300);
Warrior warrior2 = new Warrior("Zorg", 300);
Warrior warrior3 = new Warrior("Zena", 250);
Warrior warrior4 = new Warrior("Velma", 250);
Warrior warrior5 = new Warrior("Titan", 300);

Battle battle = new Battle();
battle.addAttack(warrior);
battle.addAttack(warrior2);
battle.addAttack(warrior3);
battle.addAttack(warrior4);
battle.addAttack(warrior5);


warrior.setAttackType(AttackType.DAMAGE);
warrior2.setAttackType(AttackType.DAMAGE);
warrior3.setAttackType(AttackType.DAMAGE);
warrior4.setAttackType(AttackType.DAMAGE);
warrior5.setAttackType(AttackType.SUPERATTACK);

warrior.setAttackType(AttackType.HEAL);
warrior2.setAttackType(AttackType.HEAL);
warrior3.setAttackType(AttackType.HEAL);
warrior4.setAttackType(AttackType.HEAL);
warrior5.setAttackType(AttackType.SUPPERHEAL);

battle.selected();
    }
}