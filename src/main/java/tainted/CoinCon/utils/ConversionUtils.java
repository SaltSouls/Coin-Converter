package tainted.CoinCon.utils;

public class ConversionUtils {

    public static void toCopper(long[] coins) {
        coins[3] += (coins[0] * 1000) + (coins[1] * 100) + (coins[2] * 10);

        coins[2] = 0;
        coins[1] = 0;
        coins[0] = 0;
    }

    public static void toSilver(long[] coins) {
        long coppRem = coins[3] % 10;
        coins[2] += (coins[0] * 100) + (coins[1] * 10) + ((coins[3] - coppRem) / 10);
        coins[3] = coppRem;

        coins[1] = 0;
        coins[0] = 0;
    }

    public static void toGold(long[] coins) {
        long coppRem = coins[3] % 10;
        coins[2] += (coins[3] - coppRem) / 10;
        coins[3] = coppRem;

        long silvRem = coins[2] % 10;
        coins[1] += (coins[0] * 10) + ((coins[2] - silvRem) / 10);
        coins[2] = silvRem;
        coins[0] = 0;
    }

    public static void toPlatinum(long[] coins) {
        long coppRem = coins[3] % 10;
        coins[2] += (coins[3] - coppRem) / 10;
        coins[3] = coppRem;

        long silvRem = coins[2] % 10;
        coins[1] += (coins[2] - silvRem) / 10;
        coins[2] = silvRem;

        long goldRem = coins[1] % 10;
        coins[0] += (coins[1] - goldRem) / 10;
        coins[1] = goldRem;
    }

}
