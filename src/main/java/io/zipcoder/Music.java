package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        
        int forwardCount = goForwardCount(startIndex, selection);
        int backwardCount = goBackwardCount(startIndex, selection);

        if (backwardCount > forwardCount) {
            return forwardCount;
        } else {
            return backwardCount;
        }
    }

    public Integer goForwardCount(Integer startIndex, String selection) {
        int forwardCounter = 0;
        for (int i = startIndex; !playList[i].contains(selection); i++) {
            if (i == playList.length - 1) {
                i = -1;
            }
            forwardCounter++;

        }
        return forwardCounter;
    }


    public Integer goBackwardCount(Integer startIndex, String selection){
        int backwardCounter = 0;
        for(int i = startIndex; !playList[i].contains(selection); i--){
            if(i == 0){
                i = playList.length;
            } backwardCounter++;

        } return backwardCounter;
    }
}
