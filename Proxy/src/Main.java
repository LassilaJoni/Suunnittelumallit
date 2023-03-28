import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo1"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo2"));

        System.out.println("photo album content");
        for (Image image : photoAlbum) {
            image.showData();
        }
        /*
        Image name HiRes_10MB_Photo1
        Image name HiRes_10MB_Photo2
         */

        System.out.println("browse photo album");
        for (Image image : photoAlbum) {
            image.displayImage();
        }
        /*
        Loading   HiRes_10MB_Photo1
        Displaying HiRes_10MB_Photo1
        Loading   HiRes_10MB_Photo2
        Displaying HiRes_10MB_Photo2

         */
    }
}