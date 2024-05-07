/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organisation;

import model.Viewer.ViewerDirectory;

/**
 *
 * @author payaljadhav
 */
public class ViewerOrganisation extends Organisation{
    
    ViewerDirectory viewerDirectory ;
    public ViewerOrganisation() {
        super("Viewer Organisation");
        this.viewerDirectory =new ViewerDirectory();
    }

    public ViewerDirectory getViewerDirectory() {
        return viewerDirectory;
    }

    public void setViewerDirectory(ViewerDirectory viewerDirectory) {
        this.viewerDirectory = viewerDirectory;
    }
    
    
    
}
