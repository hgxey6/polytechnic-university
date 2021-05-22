package block3.domain;

import block3.strategy.*;

public class Captain extends Player {

    private static Captain instance; // уникальный объект

    private Captain() { // приватный конструктор
    }

    public static Captain getInstance() {
        if (instance == null) { // если объект не имеет ссылку на себя
            instance = new Captain(); // то создать новый объект
        }
        return instance; // вернуть ссылку на объект
    }

    public TeamBehavior newStrategy(String s) { // выбрать стратегию по строке
        if ("attack".equals(s)) {
            return new AttackBehavior();
        } else if ("defense".equals(s)) {
            return new DefenseBehavior();
        } else if ("putBomb".equals(s)) {
            return new PutBombBehavior();
        } else if ("destroyBomb".equals(s)) {
            return new DestroyBombBehavior();
        }
        return null;
    }
}
