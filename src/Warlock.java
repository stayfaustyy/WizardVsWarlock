public class Warlock extends Character {

    Warlock(String name) {
        super(name);
    }

    /* Warlock Damage Spells */
    public void BladeStorm(Character enemyCharacter) {

        System.out.println(super.CharacterName + " attacks " + enemyCharacter.CharacterName
                + " using Blade Storm (Damage - 80 , Ability Points Cost - 20)");

        int damagePoints = 80;
        DamageToTarget(enemyCharacter, damagePoints);
        int manaPoints = 60;
        AbilityToTarget(enemyCharacter, manaPoints);

    }

    public void Tailwind(Character enemyCharacter) {

        System.out.println(super.CharacterName + " attacks " + enemyCharacter.CharacterName
                + " with Tail Wind (Damage - 60 , Ability Points Cost - 30)");

        int damagePoints = 60;
        DamageToTarget(enemyCharacter, damagePoints);
        int manaPoints = 50;
        AbilityToTarget(enemyCharacter, manaPoints);

    }

    /* Warlock Recovery Spells */

    public void SkyeHealing(Character characterName) {

        System.out.println("--------------");
        System.out.println(super.CharacterName + " Use Skye Healing (Heal - 50)");
        int healPoints = 50;
        int AbilityPoints = 50;
        healTarget(characterName, healPoints);
        AbilityPointsTarget(characterName, AbilityPoints);
    }

}