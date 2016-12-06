/**
 * 
 */
package clustermerge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * @author Ken.Byers
 *
 */
public class Merge {
    private static Merge  m = new Merge();
    
    public static void main(String[] args) {
        
        List<Cluster> inputList = null;;
        try {
            FileReader fileReader = new FileReader("input.txt");
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            inputList = m.parseInput(bufferedReader);
            System.out.println(inputList);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Set<Cluster> unique = new TreeSet<Cluster>();
        Iterator<Cluster> i = inputList.iterator();
        while (i.hasNext()){
            unique.add(i.next());
        }
        
        System.out.println(unique);
        
    }
    
    private ArrayList<Cluster> parseInput(BufferedReader inputFile){
        
        String line = null;
        ArrayList<Cluster> retList = new ArrayList<Cluster>();
        try {
            while ((line = inputFile.readLine()) != null){
                StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
                // First element on line contains the machine Id
                String machineId = stringTokenizer.nextToken();
                // Consume the remainder of the elements on the line and associate with this machineId
                
                while(stringTokenizer.hasMoreTokens()){
                    Cluster newCluster = new Cluster(machineId,stringTokenizer.nextToken());
                    retList.add(newCluster);
                }
                System.out.println();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return retList;
        
        
        
    }

}
