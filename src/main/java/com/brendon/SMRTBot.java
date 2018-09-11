package com.brendon;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;


public class SMRTBot {


    public static void main(String[] args) {

        String token = "NDc3NDMyNTIxODg2MjY5NDQy.Dk8D1Q.PpVpBvPcpq2VeDdmOe3GPLt-6Rw";

        new DiscordApiBuilder().setToken(token).login().thenAccept(api -> {

            api.addMessageCreateListener(event -> {

                // Break down the message into commands and arguments.
                String[] message = event.getMessage().getContent().toLowerCase().split(" ");

               /* switch (message[0]) {

                    case "!ping":
                        event.getChannel().sendMessage("Pong!");
                        break;
                    case "!test":
                        event.getChannel().sendMessage("Don't test me fool");
                        break;
                    case "!tinytext":
                        event.getChannel().sendMessage( ( tinyText(message) ) );
                        // System.out.println("Calculating tinytext on message: " + message[1]);
                        break;
                    case "!chemical":
                        event.getChannel().sendMessage("The anwser is yes; to what, some may ask. Well little" +
                                " children my name does infact represent my highly volatile nature. After all, how can" +
                                " one be a chemical without being toxic(yeah I know thats not true smartass)? The " +
                                "answer is they cannot. This sudden realization may be a bit shocking for you... " +
                                "perhaps even out of your comprehension, but you must be aware that at this moment I" +
                                " could infact be at the breaking point. Ready to spew so much profanity at you,that no" +
                                " matter the will, you will break, and break hard. How does it feel to stand at the " +
                                "event horizon of such misfortune? Well no matter the answer, I implore you to run. " +
                                "Thank you and good day... Asshole.");
                    default:
                        break;

                }*/

                doMessage(message);
            });

            // Print the invite url of your bot

            //

        });


    }


    static String doMessage(String[] message) {

        switch (message[0]) {

            case "!ping":
                return "Pong!";
            case "!test":
                return "Don't test me fool";
            case "!tinytext":
                return tinyText(message);
                // System.out.println("Calculating tinytext on message: " + message[1]);
            case "!chemical":
                return  "The anwser is yes; to what, some may ask. Well little" +
                        " children my name does infact represent my highly volatile nature. After all, how can" +
                        " one be a chemical without being toxic(yeah I know thats not true smartass)? The " +
                        "answer is they cannot. This sudden realization may be a bit shocking for you... " +
                        "perhaps even out of your comprehension, but you must be aware that at this moment I" +
                        " could infact be at the breaking point. Ready to spew so much profanity at you,that no" +
                        " matter the will, you will break, and break hard. How does it feel to stand at the " +
                        "event horizon of such misfortune? Well no matter the answer, I implore you to run. " +
                        "Thank you and good day... Asshole.";
            default:
                return null;

        }

    }

    static String tinyText(String[] words) {

        String output = "";
        for (String word : words) {
            if (word.equals("!tinytext"))
                continue;
            char[] tiny = new char[] {
                    'ᵃ', 'ᵇ', 'ᶜ', 'ᵈ', 'ᵉ', 'ᶠ', 'ᵍ', 'ʰ', 'ⁱ', 'ʲ', 'ᵏ', 'ˡ', 'ᵐ', 'ⁿ', 'ᵒ', 'ᵖ', 'q', 'ʳ', 'ˢ', 'ᵗ', 'ᵘ',
                    'ᵛ', 'ʷ', 'ˣ', 'ʸ', 'ᶻ'
            };

            char[] temp = word.toCharArray();
            int[] chars = new int[temp.length];

            for (int i = 0; i < temp.length; i++) {
                if ((int) temp[i] < 97 || (int) temp[i] > 122) {
                    continue;
                }
                chars[i] = ((int) temp[i]) - 97;

            }



            for (int i = 0; i < chars.length; i++) {
                output += tiny[chars[i]];
            }

            output += " ";

        }
        return output;
    }


}
