package com.vidanshu.vidanshuproject;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VidanshuService {
    private List<Vidanshu> vidanshuList = new ArrayList<>();
    
    public VidanshuService() {
        vidanshuList.add(new Vidanshu(1L, "Vidanshu", "Main Service"));
    }
    
    public List<Vidanshu> getAllVidanshu() {
        return vidanshuList;
    }
    
    public void addVidanshu(Vidanshu vidanshu) {
        vidanshuList.add(vidanshu);
    }
}