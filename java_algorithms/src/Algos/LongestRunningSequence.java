package Algos;


public class LongestRunningSequence {
    LongestRunningSequence() {
    }

    public void computeLongestRun(String inputString) throws Exception {
        if(inputString == null || inputString.length() <= 0) {
            throw new Exception("Invalid input string");
        }

        int maxRunLength = 1;
        int currentRunLength = 1;
        char maxRunCharacter = inputString.charAt(0);
        char currentRunCharacter = inputString.charAt(0);
        boolean currentRunToggle = false;

        for(int idx = 1; idx < inputString.length(); ++idx) {
            if(currentRunLength > maxRunLength) {
                maxRunLength = currentRunLength;
                maxRunCharacter = currentRunCharacter;
                currentRunToggle = false;
            }
            if(inputString.charAt(idx) == inputString.charAt(idx - 1)) {
                currentRunLength++;
                currentRunCharacter = inputString.charAt(idx);
            } else {
                currentRunLength = 1;
                currentRunToggle = true;
            }
        }
        if(inputString.charAt(inputString.length() - 1) == maxRunCharacter) {
            maxRunLength++;
        }
        System.out.println("Input String [" + inputString + "], Max Length [" + maxRunLength + "], Max Run Character [" + maxRunCharacter + "]");
    }

    public static void main(String[] args) {
        try {
            LongestRunningSequence longestRunningSequence = new LongestRunningSequence();
            longestRunningSequence.computeLongestRun("baaaaabaaaaaaaaa");
            longestRunningSequence.computeLongestRun("deadbban");
            longestRunningSequence.computeLongestRun("ddddeadbban");
            longestRunningSequence.computeLongestRun("ddeeddbbaann");
            longestRunningSequence.computeLongestRun("abcdef");
            longestRunningSequence.computeLongestRun("aaabcdef");
            longestRunningSequence.computeLongestRun("abcdefff");
            longestRunningSequence.computeLongestRun("abcdeeefff");
            longestRunningSequence.computeLongestRun("abccdccceeeccccfff");
            //longestRunningSequence.computeLongestRun("");
            //longestRunningSequence.computeLongestRun(null);
        } catch(Exception exception) {
            System.out.println("ERR: " + exception.getMessage());
        }
        System.out.println("Hello World!");
    }
}
