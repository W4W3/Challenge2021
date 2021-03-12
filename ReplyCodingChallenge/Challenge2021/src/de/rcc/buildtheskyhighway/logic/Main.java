package de.rcc.buildtheskyhighway.logic;

import de.rcc.buildtheskyhighway.utils.FileIn;
import de.rcc.buildtheskyhighway.utils.FileOut;

public class Main {
    public final static String[] INPUT = {
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\input\\data_scenarios_a_example.in",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\input\\data_scenarios_b_mumbai.in",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\input\\data_scenarios_c_metropolis.in",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\input\\data_scenarios_d_polynesia.in",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\input\\data_scenarios_e_sanfrancisco.in",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\input\\data_scenarios_f_tokyo.in"
    };

    public final static String[] OUTPUT = {
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\output\\data_scenarios_a_example.out",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\output\\data_scenarios_b_mumbai.out",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\output\\data_scenarios_c_metropolis.out",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\output\\data_scenarios_d_polynesia.out",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\output\\data_scenarios_e_sanfrancisco.out",
            "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\output\\data_scenarios_f_tokyo.out"
    };
    public final static char[] INPUTID = {'a','b','c','d','e','f'};

    public final static String SCORE = "D:\\Dev\\ReplyCodingChallenge\\Challenge2021\\src\\de\\rcc\\buildtheskyhighway\\output\\score.txt";

    private static DataManager dataManager;

    public static void main(String[] args) {
        for (int i = 0; i <INPUT.length; i++) {
            dataManager = new DataManager(INPUT[i]);
            dataManager.solve(OUTPUT[i], INPUTID[i], SCORE);
        }
    }
}
