package src.third_task;

import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    private Role role;
    private int HP;
    private ArrayList<String> skills;

    private ArrayList<Effect> effects;

    private SkillMap skillMap = new SkillMap();

    public Character(Role role) {

        this.skills = new ArrayList<>();
        this.effects = new ArrayList<>();
        if (role.equals(Role.FOOTMAN)) {
            this.HP = 150;
            skills.add("patience");
        }
        if (role.equals(Role.ANGRY)) {
            this.HP = 300;
            skills.add("scream");
            skills.add("tolchok");
        }
    }


    public void addEffect(Effect effect) {
        effects.add(effect);
    }

    public boolean useSkill(String skill, Character chr) {
        if (!skills.contains(skill)) {
            System.out.println("I haven't this skill...");

            return false;
        }
        if (effects.contains(Effect.DEAD)) {
            System.out.println("i'm dead...");

            return false;
        }

        Skill actualSkill = skillMap.skills.get(skill);
        actualSkill.useOn(chr);

        return true;
    }

    public Role getRole() {
        return role;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public void setEffects(ArrayList<Effect> effects) {
        this.effects = effects;
    }

    public void setRole(Role role) {
        this.role = role;
    }




     class SkillMap {
        static HashMap<String, Skill> skills = new HashMap();

        SkillMap() {
            this.skills.put("scream", new ScreamOfPain());
            this.skills.put("tolchok", new Tolchok());
            this.skills.put("patience", new Patience());
        }

    }
}
