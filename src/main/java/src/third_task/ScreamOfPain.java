package src.third_task;

public class ScreamOfPain implements Skill {

    @Override
    public void useOn(Character chr) {
        chr.setHP(chr.getHP() - 25);
        chr.addEffect(Effect.FEAR);
        if (chr.getHP() < 0) chr.addEffect(Effect.DEAD);
    }
}
