public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("VALORANT GAME");
        System.out.println("--------------");
        System.out.println("Match Found");
        System.out.println("Both Agent Have 150 HP, 200 Ability Points and starts at Level 0");
        System.out.println("--------------");
        System.out.println("Match Begins!");

        /* Wizard */
        Wizard Raze = new Wizard("Raze");

        /* Warlock */
        Warlock Jett = new Warlock("Jett");

        System.out.println("----Round 1! Raze attacks first!----");
        Raze.BlastPack(Jett);
        Raze.BlastPack2(Jett);
        System.out.println("----Round 2! Jett attacks first!----");
        Jett.BladeStorm(Raze);
        Raze.BoomBot(Jett);
        System.out.println("----Round 3! Jett attacks first again!----");
        Jett.Tailwind(Raze);
        Jett.SkyeHealing(Jett);
        System.out.println("----Round 4! Raze chance to attack!----");
        Raze.Showstopper(Jett);
        System.out.println("----Round Over----");
        System.out.println("----Raze Wins!----");

    }
}
