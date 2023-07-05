package section2;

/***********************************************************************************************************************
 * Flour Pack Exercise
     - Write a method named canPack with 3 parameters of type int named bigCount, smallCount and goal
     - The parameter bigCount represents the count of big flour bags(5 kilos each)
     - The parameter smallCount represents the count of small flour bag (1 kilo each)
     - The parameter goal represents the goal amount of kilos of flour needed to assemble a package
     - Therefore, the sum of kilos of bigCount and smallCount must be at least equal to the value of goal.
        The method should return true if it is possible to make a package with goal kilos of flour.
     - If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
     - If any of the parameters are negative, return false.

    E.g., canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos,
        and there is 1 bag left.
    E.g., canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and
        smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
 **********************************************************************************************************************/
public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if ((bigCount *5) + smallCount < goal) {
            return false;
        } else return goal % 5 <= smallCount;
    }
}