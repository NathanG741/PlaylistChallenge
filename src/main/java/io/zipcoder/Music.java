package io.zipcoder;


public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int forward = 0;
        int fromFront = 0;
        int countFromBack = 0;

        for (int i = startIndex; i < playList.length - startIndex; i++) {
            if (playList[i] != selection) {
                forward++;
            }
        }
        for (int j = playList.length - 1; j >= startIndex; j--) {
            if (playList[j] == selection) {
                countFromBack = playList.length - j - 1;
                fromFront =  countFromBack + startIndex + 1;
                break;
            }
        }
        if (forward >= fromFront && !(fromFront <= 0)) {
            return fromFront;
        } else if (forward < fromFront && !(forward <= 0)) {
            return forward;
        } else {
            return -1;
        }
    }
}