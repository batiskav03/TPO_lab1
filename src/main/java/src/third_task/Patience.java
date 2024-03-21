package src.third_task;

public class Patience implements Skill {

    @Override
    public void useOn(Character chr) {
        chr.setHP(chr.getHP() + 1);
        chr.addEffect(Effect.CONFIDENCE);
    }
}
