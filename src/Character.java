public class Character {

    public String CharacterName = "Agent";

    /* Agents Starting Stats */
    public int Level = 0;

    public int HP = 150;
    public int AbilityPoints = 200;
    public int Recovery = 50;

    Character(String name)

    {
        CharacterName = name;
    }

    public void DamageToTarget(Character Enemy, int damagePoints) {
        System.out.println("--------------");
        System.out.println("Status");
        Enemy.HP -= damagePoints;
        System.out.println(Enemy.CharacterName + " HP Left = " + Enemy.HP);

        if (Enemy.HP <= 0) {
            System.out.println(Enemy.CharacterName + " is now defeated! ");
        }

    }

    public void healTarget(Character enemyCharacter, int healPoints) {

        enemyCharacter.HP += healPoints;
        System.out.println(enemyCharacter.CharacterName + " HP Left = " + enemyCharacter.HP);

    }

    public void AbilityToTarget(Character enemyCharacter, int AbilityPoints) {

        enemyCharacter.AbilityPoints -= AbilityPoints;
        System.out.println(CharacterName + " Ability Points Left = " + enemyCharacter.AbilityPoints);

    }

    public void AbilityPointsToTarget(Character enemyCharacter, int AbilityPoints) {

        enemyCharacter.AbilityPoints -= AbilityPoints;
        System.out.println(CharacterName + " Ability Points Left = " + enemyCharacter.AbilityPoints);

    }

    public void levelTarget(Character enemyCharacter, int level) {

        enemyCharacter.Level += 10;
        System.out.println(CharacterName + " gains +8317 experience points! ");
        System.out.println(CharacterName + " Level is = " + enemyCharacter.Level);
        enemyCharacter.Level = level;
        System.out.println(enemyCharacter.CharacterName + " Level is = " + enemyCharacter.Level);

    }

    public void AbilityPointsTarget(Character characterName, int AbilityPoints) {

        characterName.AbilityPoints += 50;
        System.out.println(characterName.CharacterName + " Ability Points Left = " + characterName.AbilityPoints);

    }
}