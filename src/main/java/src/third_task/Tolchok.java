package src.third_task;

public class Tolchok implements Skill{


    @Override
    public void useOn(Character chr) {
       chr.addEffect(Effect.ORANGE);
       chr.setHP(-1);
       chr.addEffect(Effect.DEAD);

    }
}
