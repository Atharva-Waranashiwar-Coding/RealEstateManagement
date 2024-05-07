/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Viewer;

import java.util.ArrayList;


/**
 *
 * @author sakshi
 */
public class ViewerDirectory {
    
    ArrayList<Viewer>viewerList;
    

    public ViewerDirectory() {
        this.viewerList =  new ArrayList<Viewer>();
    }

    public ArrayList<Viewer> getViewerList() {
       return viewerList;
        
    }

    public void setViewerList(ArrayList<Viewer> viewerList) {
        this.viewerList = viewerList;
    }
    
    public void addNewViewer(Viewer viewer){
        this.viewerList.add(viewer);
    }
    
    
}
