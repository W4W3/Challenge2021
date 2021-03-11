package de.replycodingchallenge.buildtheskyhighway.logic;

public class Main {

    private static final String[] INPUT = {
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\input\\data_scenarios_a_example.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\input\\data_scenarios_b_mumbai.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\input\\data_scenarios_c_metropolis.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\input\\data_scenarios_d_polynesia.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\input\\data_scenarios_e_sanfrancisco.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\input\\data_scenarios_f_tokyo.in"

    };

    private static final String[] OUTPUT = {
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\output\\data_scenarios_a_example.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\output\\data_scenarios_b_mumbai.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\output\\data_scenarios_c_metropolis.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\output\\data_scenarios_d_polynesia.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\output\\data_scenarios_e_sanfrancisco.in",
            "D:\\Dev\\ReplyCodingChallenge\\BuildTheSkyHighway\\src\\de\\replycodingchallenge\\buildtheskyhighway\\output\\data_scenarios_f_tokyo.in"
    };

    public static void main(String[] args) {
        for (int i = 0; i < INPUT.length; i++) {
            new DataManager(INPUT[i], OUTPUT[i]);
        }
    }

}
