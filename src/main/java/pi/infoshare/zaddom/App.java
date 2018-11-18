package pl.infoshare.zaddom;

import infoshare.zaddom.MenuService;
import pl.infoshare.zaddom.Stypendysta;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
       new MenuService().wyswietlMenu();
    }
    }