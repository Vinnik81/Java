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
};

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
        int loozerIndex;
        do {
            loozerIndex = random.nextInt(count);
        } while (loozerIndex == attackerIndex);

        Warrior attacker = attacks.get(attackerIndex);
        Warrior loozer = attacks.get(loozerIndex);

        fight(attacker, loozer);
    }

    private void fight(Warrior attacker, Warrior loozer) {
        int hp = new Random().nextInt(100) +1;
        loozer.modifyHp(new Warrior(loozer.getName(), loozer.getHp() - hp));
        System.out.println(attacker.getName() + " атакует " + loozer.getName() + " на " + hp +" hp, осталось ("
                + loozer.getHp() + " hp)");

        if (!loozer.isAlive()) {
            attacks.remove(loozer);
            System.out.println(loozer.getName() + " был побежден!");
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

Battle battle = new Battle();
battle.addAttack(warrior);
battle.addAttack(warrior2);
battle.addAttack(warrior3);
battle.addAttack(warrior4);

warrior.setAttackType(AttackType.DAMAGE);
warrior2.setAttackType(AttackType.HEAL);
warrior3.setAttackType(AttackType.HEAL);
warrior4.setAttackType(AttackType.DAMAGE);

battle.selected();
    }
}