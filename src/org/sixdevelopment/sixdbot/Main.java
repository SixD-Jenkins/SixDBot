package org.sixdevelopment.sixdbot;

import org.sixdevelopment.sixdbot.common.SixDBot;
import org.sixdevelopment.sixdbot.utils.Arguments;

/**
 * Created by Sixten on 2014-11-18.
 */
public class Main {

    public static void main(String[] args){
        Arguments.args = args;
        SixDBot.start();
    }

}
