package lekcijaSesi.labDarbs;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WordGenerator {
    public static void main(String[] args) throws IOException {

        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream( new File("Aiga.docx"));
        document.write(out);
        out.close();
        System.out.println("createdocument.docx written successully");


        //Write the Document in file system

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("At tutorialspoint.com, we strive hard to " +
                "provide quality tutorials for self-learning " +
                "purpose in the domains of Academics, Information " +
                "Technology, Management and Computer Programming Languages.");

        document.write(out);
        out.close();
        System.out.println("createparagraph.docx written successfully");
        System.out.println("createdocument.docx written successully");



    }
}
