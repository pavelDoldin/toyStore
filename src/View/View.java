package View;



import Interface.IBox;
import Interface.IView;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class View implements IView{

    @Override
    public void fileWrite(IBox box) {
        String fileName = "shop.txt";

        String text = "";
        while (!box.next()) {
            text += box.get();
        }

        try {
            Writer myWriter = new FileWriter(fileName, true);
            myWriter.write(text + "\n");
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(text);
    }

}
