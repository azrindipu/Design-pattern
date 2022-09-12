package templatemethod;

import java.util.Date;

public abstract class Template {
    void template(String templateName){
        System.out.println("Template Name: "+templateName);
        String date = new Date().toString();
        System.out.println("Date: "+date);
        System.out.println("-------------------------");
        System.out.println("Image");
        getImage();
        System.out.println("Text");
        getText();
    }
    abstract void getImage();
    abstract void getText();
}
