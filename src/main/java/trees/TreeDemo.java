package trees;

import com.google.common.collect.TreeBasedTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeDemo {
    public static void main(String[] args) {
        TreeBasedTable treeBasedTable = TreeBasedTable.create();
        List<List<String>> reportData = null;
        List reportColumns = null;
        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File("/home/okuzk/Documents/reportData")));
            reportData = (List)oos.readObject();
            oos = new ObjectInputStream(new FileInputStream(new File("/home/okuzk/Documents/reportColumns")));
            reportColumns = (List)oos.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*for(List<String> currList : reportData){
            List<String> value = new ArrayList<>();
            for(int i = 0; i < currList.size(); i++){
                if(i > 1){
                    value.add(currList.get(i));
                }
            }
            treeBasedTable.put(currList.get(0), currList.get(1), value);
        }*/
        Map<List<String>, List<List<String>>> map = new TreeMap<>();

        List<String> highList;
        for(List<String> currList : reportData){
            if(currList.get(1).equals("1")){
                highList = currList;
                break;
            }
//            map.put(highList, )
        }

        System.out.println();
    }
}
