package academy.devdojo.maratonajava.javacore.Minterfaces.Test;

import academy.devdojo.maratonajava.javacore.Minterfaces.Dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.Dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
