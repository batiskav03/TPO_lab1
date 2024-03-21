import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.third_task.Character;
import src.third_task.Effect;
import src.third_task.Role;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdTask {

    private Character angryMan;
    private Character footman;

    @BeforeEach
    void init() {
        angryMan = new Character(Role.ANGRY);
        footman = new Character(Role.FOOTMAN);
    }

    @Test
    @DisplayName("Checking the effects overlay")
    void deadStatus() {
        angryMan.useSkill("scream", footman);
        boolean result = footman.getEffects().contains(Effect.FEAR);

        assertEquals(result, true);
    }

    @Test
    @DisplayName("Checking that dead can not use skills")
    void canNotUseSkill() {
        angryMan.useSkill("tolchok", footman);
        boolean result = footman.useSkill("patience", angryMan);

        assertEquals(result, false);
    }

    @Test
    @DisplayName("Check damage")
    void checkDmg() {
        int expected = footman.getHP() - 25;
        angryMan.useSkill("scream", footman);

        assertEquals(expected, footman.getHP());
    }



}
