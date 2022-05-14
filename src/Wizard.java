public class Wizard extends Character {

    Wizard(String name) {
        super(name);
    }

    /* Waizard Damage Spells */
    public void BlastPack(Character enemyCharacter) {

        System.out.println(super.CharacterName + " attacks " + enemyCharacter.CharacterName
                + " using Blast Pack (Damage - 10 , Mana Cost - 10)");
        int DamageToTarget = 10;
        DamageToTarget(enemyCharacter, DamageToTarget);
        int AbilityPoints = 20;
        AbilityToTarget(enemyCharacter, AbilityPoints);

    }

    public void BlastPack2(Character enemyCharacter) {

        System.out.println(super.CharacterName + " attacks again " + enemyCharacter.CharacterName
                + " using Blast Pack 2nd Phase (Damage - 20 , Ability Points Cost - 15)");
        int DamageToTarget = 20;
        DamageToTarget(enemyCharacter, DamageToTarget);
        int AbilityPoints = 35;
        AbilityToTarget(enemyCharacter, AbilityPoints);

    }

    public void BoomBot(Character enemyCharacter) {

        System.out.println(super.CharacterName + " attacks again " + enemyCharacter.CharacterName
                + " using Boom Bot (Damage - 50 , Ability Points Cost - 25)");
        int DamageToTarget = 50;
        DamageToTarget(enemyCharacter, DamageToTarget);
        int AbilityPoints = 90;
        AbilityToTarget(enemyCharacter, AbilityPoints);

    }

    public void Showstopper(Character enemyCharacter) {

        System.out.println(super.CharacterName + " attacks again " + enemyCharacter.CharacterName
                + " using her Ultimate Skill! Showstopper! (Damage - 120 , Ability Points Cost - 100)");
        int DamageToTarget = 120;
        DamageToTarget(enemyCharacter, DamageToTarget);
        int AbilityPoints = 100;
        AbilityPointsToTarget(enemyCharacter, AbilityPoints);

    }

    /* Wizard Recovery Spells */

    public void SageHealing(Character characterName) {

        System.out.println(super.CharacterName + " Use Sage Healing (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        AbilityPointsTarget(characterName, AbilityPoints);
    }

}