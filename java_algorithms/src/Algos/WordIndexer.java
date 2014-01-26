package Algos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class WordIndexer {
    private Map<String, List<Integer>> _mapWordIndexList;
    private String _inputFileName;

    WordIndexer(String inputFileName) throws Exception {
        _mapWordIndexList = new HashMap<String, List<Integer>>();
        _inputFileName = inputFileName;

        indexWords();
    }

    private void indexWords() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("textfile.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
        String currentLine;
        int currentWordIndex = 0;
        while((currentLine = bufferedReader.readLine()) != null)   {
            //System.out.println(currentLine);
            StringTokenizer tokenizer = new StringTokenizer(currentLine, " .,/:#()@$-*'\"");
            while(tokenizer.hasMoreTokens()) {
                ++currentWordIndex;
                String currentWord = tokenizer.nextToken().toLowerCase();
                //System.out.println(currentWord + "[" + currentWordIndex + "]");
                ArrayList<Integer> listWordIndex;
                if(!_mapWordIndexList.containsKey(currentWord)) {
                    listWordIndex = new ArrayList<Integer>();
                } else {
                    listWordIndex = (ArrayList<Integer>) _mapWordIndexList.get(currentWord);
                }
                listWordIndex.add(currentWordIndex);
                _mapWordIndexList.put(currentWord, listWordIndex);
            }
        }
        dataInputStream.close();
    }

    private ArrayList<Integer> getIndexes(String inputWord) {
        inputWord = inputWord.toLowerCase();
        //System.out.println();
        //System.out.print("Looking for word [" + inputWord + "]. ");
        if(_mapWordIndexList.containsKey(inputWord)) {
            ArrayList<Integer> listWordIndex = (ArrayList<Integer>) _mapWordIndexList.get(inputWord);
            //System.out.println(listWordIndex.toString());
            return listWordIndex;
        } else {
            System.out.println("Sorry, word [" + inputWord + "] not found.");
            return new ArrayList<Integer>();
        }
    }

    public Integer findLeastDistance(String word1, String word2) throws Exception {
        ArrayList<Integer> indexList1 = getIndexes(word1);
        ArrayList<Integer> indexList2 = getIndexes(word2);
        if(indexList1.isEmpty() || indexList2.isEmpty()) {
            throw new Exception("Error: Invalid input word(s).");
        }
        int minDistance = Integer.MAX_VALUE/2;
        BinarySearch binarySearch = new BinarySearch(indexList2);
        Iterator iterator = indexList1.iterator();
        while(iterator.hasNext()) {
            Integer currentIndex = (Integer)iterator.next();
            int currentMinDistance = binarySearch.binarySearchClosestDistance(currentIndex);
            if(currentMinDistance < minDistance) {
                minDistance = currentMinDistance;
            }
        }
        System.out.println("Minimum distance between [" + word1 + "] and [" + word2 + "] is " + minDistance + ".");
        return minDistance;
    }

    public static void main(String[] args) {
        try {
            WordIndexer wordIndexer = new WordIndexer("data/input.txt");
            wordIndexer.findLeastDistance("Gutenberg", "Project");
            wordIndexer.findLeastDistance("and", "some");
            wordIndexer.findLeastDistance("practically", "creating");
            wordIndexer.findLeastDistance("directories", "release");
            wordIndexer.findLeastDistance("release", "directories");
            wordIndexer.findLeastDistance("project", "originator");
            wordIndexer.findLeastDistance("visit", "ebooks");
            wordIndexer.findLeastDistance("desire", "heaven");
            wordIndexer.findLeastDistance("Gutenberg", "Bianca");
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
