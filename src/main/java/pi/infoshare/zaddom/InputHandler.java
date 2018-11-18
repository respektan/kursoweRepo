package infoshare.zaddom;

import java.io.IOException;

public class InputHandler {
}
    public void handleUserChoice (String choice) throws IOException {
        MenuService menuService = new MenuService();

        switch (choice) {
            case "1": {
                pl.infoshare.zaddom.Student.stworzStudenta();
                break;
            }
            case "2": {
                pl.infoshare.zaddom.Wykladowca.stworzWykladowce();
                break;
            }
            case "3": {
                Zajecia.stworzZajecia();
                break;
            }
            case "0": {
                break;
            }
            default: {
                new MenuService.wyswietBlad();
                break;
            }
        }
    }
}