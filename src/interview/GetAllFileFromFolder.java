package interview;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 题目：获取文件夹下的所有文件
 *
 *
 * 思路：不使用递归，使用队列存储所有file（fileFolder），遍历，如果是文件夹入队
 *
 */
public class GetAllFileFromFolder {

    public static int totalFolder = 0;
    public static int totalFile = 0;

    public void getAllFile() throws IOException {
        int fileNum = 0;
        int folderNum = 0;

        File originFile = new File("D:\\mongodb");

        Queue<File> fileList = new LinkedList<>();

        if (originFile.exists()){

            File[] files = originFile.listFiles();
            for (File file : files){
                if (file.isDirectory()){
                    fileList.add(file);
                    folderNum++;

                    //System.out.println(file.getAbsolutePath());
                }else {
                    fileNum++;

                    //System.out.println(file.getAbsolutePath());
                }
            }


            File tmpFile = null;
            while (!fileList.isEmpty()){
                tmpFile = fileList.poll();

                files = tmpFile.listFiles();
                for (File file : files){
                    if (file.isDirectory()){
                        fileList.add(file);

                        folderNum++;
                        //System.out.println(file.getAbsolutePath());
                    }else {
                        fileNum++;
                        //System.out.println(file.getAbsolutePath());
                    }
                }

            }

        }else {
            System.out.println("文件不存在");
        }

        System.out.println("Total FolderNum is : " + folderNum);
        System.out.println("Total FileNum is : " + fileNum);
    }


    public void tarverseAllFile(String path){
        File originFile = new File(path);

        if (originFile.exists()){
            File []files = originFile.listFiles();
            for (File file : files){
                if (file.isDirectory()){
                    totalFolder++;

                    String basePath = file.getAbsolutePath();

                    tarverseAllFile(basePath);
                }else {

                    String basePath = file.getAbsolutePath();
                    //System.out.println(basePath);


                    totalFile++;
                }
            }
        }else {
            System.out.println("文件不存在");
        }

    }

    public static void main(String[] args) throws IOException{

        /*long startTime = System.currentTimeMillis();
        new GetAllFileFromFolder().getAllFile();
        long endTime = System.currentTimeMillis();

        System.out.println("Using Time : " + (endTime - startTime));*/


        long startTime = System.currentTimeMillis();
        new GetAllFileFromFolder().tarverseAllFile("D:\\mongodb");
        long endTime = System.currentTimeMillis();

        System.out.println("TotalFolder : " + totalFolder);
        System.out.println("TotalFile : " + totalFile);
        System.out.println("Using Time : " + (endTime - startTime));

    }
}
