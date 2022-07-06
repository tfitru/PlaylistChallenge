package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        for(int i =startIndex; i<playList.length; i++){
            if(this.playList[i].equalsIgnoreCase(selection)){
                return i - 1;
            }
        }
        return 0;
    }
}
