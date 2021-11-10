import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class FileTest {

    public static void main(String[] args) throws IOException {

//        // 建立要压缩的文件File的对象src
//        File fileToZip = new File("ch1.txt");
//        FileInputStream src = new FileInputStream(fileToZip);
//
//        // 建立压缩目的位置对象
//        FileOutputStream zipToSave = new FileOutputStream("ch1.zip");
//        ZipOutputStream dst = new ZipOutputStream(zipToSave);
//
//        // 在压缩文件内建立压缩项目
//        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
//        dst.putNextEntry(zipEntry);
//
//        // byte方式读出未压缩文件src对象，然后以zip格式写入输出串流dst帝乡
//        byte[] bytes = new byte[1024];
//        int length;
//        while ((length = src.read(bytes)) >= 0) {
//            dst.write(bytes, 0, length);
//        }
//
//        dst.close();
//        src.close();

//        String[] srcFiles = {"ch1.txt", "ch12.txt", "ch13.txt"};
//
//        // 建立压缩目的位置对象
//        FileOutputStream zipToSave = new FileOutputStream("ch2.zip");
//        ZipOutputStream dst = new ZipOutputStream(zipToSave);
//
//        for (String srcFile:srcFiles) {
//            // 建立要压缩的文件File的对象src
//            File fileToZip = new File(srcFile);
//            FileInputStream src = new FileInputStream(fileToZip);
//
//            // 在压缩文件内建立压缩项目
//            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
//            dst.putNextEntry(zipEntry);
//
//            // byte方式读出未压缩文件src对象，然后以zip格式写入输出串流dst帝乡
//            byte[] bytes = new byte[1024];
//            int length;
//            while ((length = src.read(bytes)) >= 0) {
//                dst.write(bytes, 0, length);
//            }
//            src.close();
//
//        }
//        dst.close();

        File myDir = new File("myDir");
        if (myDir.mkdir()) {
            System.out.println(myDir.getName() + "存储解压缩文件的文件夹建立成功");
        } else {
            System.out.println(myDir.getName() + "文件夹已存在建立失败");
        }

        byte[] buffer = new byte[1024];
        FileInputStream srcFile = new FileInputStream("ch1.zip");
        ZipInputStream src = new ZipInputStream(srcFile);
        ZipEntry zipEntry = src.getNextEntry();

        while (zipEntry != null) {
            String fName = zipEntry.getName();
            File nName = new File(myDir + "/" + fName);
            FileOutputStream dst = new FileOutputStream(nName);
            int len;
            while ((len = src.read(buffer)) > 0) {
                dst.write(buffer, 0, len);
            }
            dst.close();
            zipEntry = src.getNextEntry();
        }
        src.close();

    }
}
